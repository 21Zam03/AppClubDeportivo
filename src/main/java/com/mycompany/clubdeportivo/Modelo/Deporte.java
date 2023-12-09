/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clubdeportivo.Modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Deporte implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Deporte_id")
    private int id_Deporte;
    
    @Basic
    @Column(name="nombre")
    private String nombre;
    
    @OneToMany(mappedBy="deporte")
    private List<Socio> socio;

    public Deporte() {
    }

    public Deporte(int id_Deporte, String nombre, List<Socio> socio) {
        this.id_Deporte = id_Deporte;
        this.nombre = nombre;
        this.socio = socio;
    }
    
    public int getId_Deporte() {
        return id_Deporte;
    }

    public void setId_Deporte(int id_Deporte) {
        this.id_Deporte = id_Deporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Socio> getSocio() {
        return socio;
    }

    public void setSocio(List<Socio> socio) {
        this.socio = socio;
    }    
    
}
