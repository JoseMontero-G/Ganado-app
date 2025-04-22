/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agrovacas;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOVacunas;
import com.mycompany.models.Vacunas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lalom
 */
public class DAOVacunasImpl extends Database implements DAOVacunas {

    @Override
    public void registrar(Vacunas vacuna) throws Exception {
        try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO vacunas( animal_id, nombre, dosis, fecha_aplicacion) VALUES( ?,?,?,?);");
            st.setInt(1,vacuna.getAnimalId());
            st.setString(2,vacuna.getNombre());
            st.setString(3,vacuna.getDosis());
            st.setDate(4,vacuna.getFechaAplicacion());  
            st.executeUpdate();
            st.close();
        }catch(Exception e){
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void modificar(Vacunas vacuna) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Vacunas vacuna) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Vacunas> Listar() throws Exception {
    List<Vacunas> lista = new ArrayList<>();
    try {
        this.conectar();

        // Realizamos un JOIN entre vacunas y animales para obtener los aretes
        String sql = "SELECT v.id, v.nombre, v.dosis, v.fecha_aplicacion, v.animal_id, a.arete, a.arete_bebe " +
                     "FROM vacunas v JOIN animales a ON v.animal_id = a.id;";

        PreparedStatement st = this.conexion.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            Vacunas v = new Vacunas();
            v.setId(rs.getInt("id"));
            v.setNombre(rs.getString("nombre"));
            v.setDosis(rs.getString("dosis"));
            v.setFechaAplicacion(rs.getDate("fecha_aplicacion"));
            v.setAnimalId(rs.getInt("animal_id"));
            v.setAreteAnimal(rs.getString("arete"));  // Obtenemos el arete del animal
            v.setAreteBebeAnimal(rs.getString("arete_bebe"));  // Obtenemos el arete_bebe del animal

            lista.add(v);
        }

        rs.close();
        st.close();
    } catch (Exception e) {
        throw e;
    } finally {
        this.cerrar();
    }

    return lista;
    }

    @Override
    public int obtenerIdPorArete(String arete) throws Exception {
         int id = -1;
        this.conectar(); // Usa tu método personalizado de conexión

        String sql = "SELECT id FROM animales WHERE arete = ?";
        try (PreparedStatement stmt = this.conexion.prepareStatement(sql)) {
            stmt.setString(1, arete);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (Exception e) {
            throw e; // Propaga la excepción para que pueda capturarse donde se llame
        } finally {
            this.cerrar(); // Siempre cerramos la conexión
        }

         return id;
    }
}
    

