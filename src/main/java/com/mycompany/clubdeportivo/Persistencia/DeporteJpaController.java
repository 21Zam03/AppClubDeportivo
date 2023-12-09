/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clubdeportivo.Persistencia;

import com.mycompany.clubdeportivo.Modelo.Deporte;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.clubdeportivo.Modelo.Socio;
import com.mycompany.clubdeportivo.Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeporteJpaController implements Serializable {

    public DeporteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public DeporteJpaController() {
        emf = Persistence.createEntityManagerFactory("ClubJPAPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Deporte deporte) {
        if (deporte.getSocio() == null) {
            deporte.setSocio(new ArrayList<Socio>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Socio> attachedSocio = new ArrayList<Socio>();
            for (Socio socioSocioToAttach : deporte.getSocio()) {
                socioSocioToAttach = em.getReference(socioSocioToAttach.getClass(), socioSocioToAttach.getId_Socio());
                attachedSocio.add(socioSocioToAttach);
            }
            deporte.setSocio(attachedSocio);
            em.persist(deporte);
            for (Socio socioSocio : deporte.getSocio()) {
                Deporte oldDeporteOfSocioSocio = socioSocio.getDeporte();
                socioSocio.setDeporte(deporte);
                socioSocio = em.merge(socioSocio);
                if (oldDeporteOfSocioSocio != null) {
                    oldDeporteOfSocioSocio.getSocio().remove(socioSocio);
                    oldDeporteOfSocioSocio = em.merge(oldDeporteOfSocioSocio);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Deporte deporte) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Deporte persistentDeporte = em.find(Deporte.class, deporte.getId_Deporte());
            List<Socio> socioOld = persistentDeporte.getSocio();
            List<Socio> socioNew = deporte.getSocio();
            List<Socio> attachedSocioNew = new ArrayList<Socio>();
            for (Socio socioNewSocioToAttach : socioNew) {
                socioNewSocioToAttach = em.getReference(socioNewSocioToAttach.getClass(), socioNewSocioToAttach.getId_Socio());
                attachedSocioNew.add(socioNewSocioToAttach);
            }
            socioNew = attachedSocioNew;
            deporte.setSocio(socioNew);
            deporte = em.merge(deporte);
            for (Socio socioOldSocio : socioOld) {
                if (!socioNew.contains(socioOldSocio)) {
                    socioOldSocio.setDeporte(null);
                    socioOldSocio = em.merge(socioOldSocio);
                }
            }
            for (Socio socioNewSocio : socioNew) {
                if (!socioOld.contains(socioNewSocio)) {
                    Deporte oldDeporteOfSocioNewSocio = socioNewSocio.getDeporte();
                    socioNewSocio.setDeporte(deporte);
                    socioNewSocio = em.merge(socioNewSocio);
                    if (oldDeporteOfSocioNewSocio != null && !oldDeporteOfSocioNewSocio.equals(deporte)) {
                        oldDeporteOfSocioNewSocio.getSocio().remove(socioNewSocio);
                        oldDeporteOfSocioNewSocio = em.merge(oldDeporteOfSocioNewSocio);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = deporte.getId_Deporte();
                if (findDeporte(id) == null) {
                    throw new NonexistentEntityException("The deporte with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Deporte deporte;
            try {
                deporte = em.getReference(Deporte.class, id);
                deporte.getId_Deporte();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The deporte with id " + id + " no longer exists.", enfe);
            }
            List<Socio> socio = deporte.getSocio();
            for (Socio socioSocio : socio) {
                socioSocio.setDeporte(null);
                socioSocio = em.merge(socioSocio);
            }
            em.remove(deporte);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Deporte> findDeporteEntities() {
        return findDeporteEntities(true, -1, -1);
    }

    public List<Deporte> findDeporteEntities(int maxResults, int firstResult) {
        return findDeporteEntities(false, maxResults, firstResult);
    }

    private List<Deporte> findDeporteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Deporte.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Deporte findDeporte(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Deporte.class, id);
        } finally {
            em.close();
        }
    }

    public int getDeporteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Deporte> rt = cq.from(Deporte.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
