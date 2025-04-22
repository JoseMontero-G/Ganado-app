/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaces;

import com.mycompany.models.Vacunas;
import java.util.List;

/**
 *
 * @author lalom
 */
public interface DAOVacunas {
    public void registrar (Vacunas vacuna) throws Exception;
    public void modificar (Vacunas vacuna) throws Exception;
    public int obtenerIdPorArete(String arete) throws Exception;
    public void eliminar (Vacunas vacuna) throws Exception;
    public List <Vacunas> Listar() throws Exception;
    
}
