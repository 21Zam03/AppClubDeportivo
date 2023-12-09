/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clubdeportivo.Modelo;

import com.mycompany.clubdeportivo.Persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void RegistrarSocio(String nombre, String apellido, String dni, Deporte deporte) {
        Socio socio = new Socio();
        socio.setNombre(nombre);
        socio.setApellido(apellido);
        socio.setDni(dni);
        socio.setDeporte(deporte);
        controlPersis.RegistrarSocio(socio);
    }

    public void RegistrarDeporte(String nombre) {
        Deporte deporte = new Deporte();
        deporte.setNombre(nombre);
        controlPersis.RegistrarDeporte(deporte);
    }

    public List<Deporte> traerDeportes() {
        List<Deporte> lista_deportes = controlPersis.traerDeportes();
        return lista_deportes;
    }

    public Deporte traerDeporte(int id_deporte) {
        Deporte deporte = controlPersis.traerDeporte(id_deporte);
        return deporte;
    }

    public List<Socio> traerSocios() {
        List<Socio> lista_socios = controlPersis.traerSocios();
        return lista_socios;
    }

    public Socio traerSocio(int id) {
        Socio socio = controlPersis.traerSocio(id);
        return socio;
    }

    public void actualizarSocio(String nombre, String apellido, String dni, Deporte deporte, int id) {
        Socio socio = controlPersis.traerSocio(id);
        socio.setNombre(nombre);
        socio.setApellido(apellido);
        socio.setDni(dni);
        socio.setDeporte(deporte);
        controlPersis.actualizarSocio(socio);
    }

    public void eliminarSocio(int id_socio) {
        controlPersis.eliminarSocio(id_socio);
    }
    
}
