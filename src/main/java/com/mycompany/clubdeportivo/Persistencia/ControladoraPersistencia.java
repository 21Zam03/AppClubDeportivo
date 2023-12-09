/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clubdeportivo.Persistencia;

import com.mycompany.clubdeportivo.Modelo.Deporte;
import com.mycompany.clubdeportivo.Modelo.Socio;
import com.mycompany.clubdeportivo.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    DeporteJpaController deporteJPA = new DeporteJpaController();
    SocioJpaController socioJPA = new SocioJpaController();

    public void RegistrarDeporte(Deporte deporte) {
        deporteJPA.create(deporte);
    }

    public List<Deporte> traerDeportes() {
        List<Deporte> lista_deportes = deporteJPA.findDeporteEntities();
        return lista_deportes;
    }

    public Deporte traerDeporte(int id_deporte) {
        Deporte deporte = deporteJPA.findDeporte(id_deporte);
        return deporte;
    }

    public void RegistrarSocio(Socio socio) {
        socioJPA.create(socio);
    }

    public List<Socio> traerSocios() {
        List<Socio> listas_socios = socioJPA.findSocioEntities();
        return listas_socios;
    }

    public Socio traerSocio(int id) {
        Socio socio = socioJPA.findSocio(id);
        return socio;
    }

    public void actualizarSocio(Socio socio) {
        try {
            socioJPA.edit(socio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarSocio(int id_socio) {
        try {
            socioJPA.destroy(id_socio);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
}
