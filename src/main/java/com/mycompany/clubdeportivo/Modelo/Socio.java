/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clubdeportivo.Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Socio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Socio_id")
    private int id_Socio;
    
    @Basic
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="apellido")
    private String apellido;
    
    @Column(name="dni")
    private String dni;
    
    @ManyToOne
    @JoinColumn(name="deporte", referencedColumnName="Deporte_id")
    private Deporte deporte;

    public Socio() {
    }

    public Socio(int id_Socio, String nombre, String apellido, String dni, Deporte deporte) {
        this.id_Socio = id_Socio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.deporte = deporte;
    }
 
    public int getId_Socio() {
        return id_Socio;
    }

    public void setId_Socio(int id_Socio) {
        this.id_Socio = id_Socio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }
 
}
