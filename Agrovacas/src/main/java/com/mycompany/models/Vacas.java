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
public class Vacas {
    private int id;
    private String arete;
    private String arete_bebe;
    private String alias;
    private String rancho;
    private Date fecha_nacimiento;
    private String raza;
    private String empadre;
    private String finalidad;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setArete(String arete) {
        this.arete = arete;
    }

    public void setArete_bebe(String arete_bebe) {
        this.arete_bebe = arete_bebe;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setRancho(String rancho) {
        this.rancho = rancho;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setEmpadre(String empadre) {
        this.empadre = empadre;
    }

    public void setFinalidad(String finalidad) {
        this.finalidad = finalidad;
    }

    public int getId() {
        return id;
    }

    public String getArete() {
        return arete;
    }

    public String getArete_bebe() {
        return arete_bebe;
    }

    public String getAlias() {
        return alias;
    }

    public String getRancho() {
        return rancho;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getEmpadre() {
        return empadre;
    }

    public String getFinalidad() {
        return finalidad;
    }
    
    
}
