/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.models.Vacas;
import java.util.List;

/**
 *
 * @author lalom
 */
public interface DAOVacas {
    public void registrar (Vacas vaca) throws Exception;
    public void modificar (Vacas vaca) throws Exception;
    public void eliminar (int id) throws Exception;
    public List <Vacas> Listar(String arete) throws Exception;
    public Vacas getVacaByID (int id) throws Exception;
    public boolean existeArete(String arete) throws Exception;
    
}
