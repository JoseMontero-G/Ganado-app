/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

import java.sql.Date;

/**
 *
 * @author lalom
 */
public class Vacunas {
    private int id;  
    private String nombre;
    private Date fechaAplicacion;
    private String Dosis;
    private int animalId;
    private String areteAnimal;
    private String areteBebeAnimal;

    public void setAreteAnimal(String areteAnimal) {
        this.areteAnimal = areteAnimal;
    }

    public void setAreteBebeAnimal(String areteBebeAnimal) {
        this.areteBebeAnimal = areteBebeAnimal;
    }
    
    
    
    public void setAnimalId(int id) {
    this.animalId = id;
}

public int getAnimalId() {
    return this.animalId;
}

    public void setDosis(String Dosis) {
        this.Dosis = Dosis;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaAplicacion(Date fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    
    
    public int getId() {
        return id;
    }

    

    public String getNombre() {
        return nombre;
    }

    public Date getFechaAplicacion() {
        return fechaAplicacion;
    }

    public String getDosis() {
        return Dosis;
    }

    public String getAreteAnimal() {
        return areteAnimal;
    }

    public String getAreteBebeAnimal() {
        return areteBebeAnimal;
    }
 
    
}
