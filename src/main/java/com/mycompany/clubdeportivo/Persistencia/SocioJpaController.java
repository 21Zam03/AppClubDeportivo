/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clubdeportivo.Persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.clubdeportivo.Modelo.Deporte;
import com.mycompany.clubdeportivo.Modelo.Socio;
import com.mycompany.clubdeportivo.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SocioJpaController implements Serializable {

    public SocioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public SocioJpaController() {
        emf = Persistence.createEntityManagerFactory("ClubJPAPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Socio socio) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Deporte deporte = socio.getDeporte();
            if (deporte != null) {
                deporte = em.getReference(deporte.getClass(), deporte.getId_Deporte());
                socio.setDeporte(deporte);
            }
            em.persist(socio);
            if (deporte != null) {
                deporte.getSocio().add(socio);
                deporte = em.merge(deporte);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Socio socio) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Socio persistentSocio = em.find(Socio.class, socio.getId_Socio());
            Deporte deporteOld = persistentSocio.getDeporte();
            Deporte deporteNew = socio.getDeporte();
            if (deporteNew != null) {
                deporteNew = em.getReference(deporteNew.getClass(), deporteNew.getId_Deporte());
                socio.setDeporte(deporteNew);
            }
            socio = em.merge(socio);
            if (deporteOld != null && !deporteOld.equals(deporteNew)) {
                deporteOld.getSocio().remove(socio);
                deporteOld = em.merge(deporteOld);
            }
            if (deporteNew != null && !deporteNew.equals(deporteOld)) {
                deporteNew.getSocio().add(socio);
                deporteNew = em.merge(deporteNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = socio.getId_Socio();
                if (findSocio(id) == null) {
                    throw new NonexistentEntityException("The socio with id " + id + " no longer exists.");
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
            Socio socio;
            try {
                socio = em.getReference(Socio.class, id);
                socio.getId_Socio();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The socio with id " + id + " no longer exists.", enfe);
            }
            Deporte deporte = socio.getDeporte();
            if (deporte != null) {
                deporte.getSocio().remove(socio);
                deporte = em.merge(deporte);
            }
            em.remove(socio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Socio> findSocioEntities() {
        return findSocioEntities(true, -1, -1);
    }

    public List<Socio> findSocioEntities(int maxResults, int firstResult) {
        return findSocioEntities(false, maxResults, firstResult);
    }

    private List<Socio> findSocioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Socio.class));
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

    public Socio findSocio(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Socio.class, id);
        } finally {
            em.close();
        }
    }

    public int getSocioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Socio> rt = cq.from(Socio.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
