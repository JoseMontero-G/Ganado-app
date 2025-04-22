/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agrovacas;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOVacas;
import com.mycompany.models.Vacas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lalom
 */
public class DAOVacasImpl extends Database implements DAOVacas {

    @Override
    public void registrar(Vacas vaca) throws Exception {
        try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO animales( arete, alias, arete_bebe, rancho, fecha_nacimiento, raza, empadre, finalidad) VALUES(?,?,?,?,?,?,?,?);");
            st.setString(1,vaca.getArete());
            st.setString(2,vaca.getAlias());
            st.setString(3,vaca.getArete_bebe());
            st.setString(4,vaca.getRancho());
            st.setDate(5, vaca.getFecha_nacimiento());
            st.setString(6,vaca.getRaza());
            st.setString(7,vaca.getEmpadre());
            st.setString(8,vaca.getFinalidad());
            st.executeUpdate();
            st.close();
        }catch(Exception e){
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void modificar(Vacas vaca) throws Exception {
          try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE animales SET arete = ?, alias = ?,  arete_bebe = ?, rancho = ?, fecha_nacimiento = ?, raza = ?, empadre = ?, finalidad = ? WHERE id = ?");
            st.setString(1,vaca.getArete());
            st.setString(2,vaca.getAlias());
            st.setString(3,vaca.getArete_bebe());
            st.setString(4,vaca.getRancho());
            st.setDate(5, vaca.getFecha_nacimiento());
            st.setString(6,vaca.getRaza());
            st.setString(7,vaca.getEmpadre());
            st.setString(8,vaca.getFinalidad());
            st.setInt(9, vaca.getId());
            st.executeUpdate();
            st.close();
        }catch(Exception e){
            throw e;
        } finally {
            this.cerrar();
        }

    }

    @Override
    public void eliminar(int  id) throws Exception {
         try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM animales WHERE id = ?;");
            st.setInt(1,id);
            st.executeUpdate();
            st.close();
        }catch(Exception e){
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public List<Vacas> Listar(String arete) throws Exception {
    List <Vacas> lista = null;
    try{
        this.conectar();
        String Query = arete.isEmpty() ? "SELECT * FROM animales;" : "SELECT * FROM animales WHERE arete LIKE '%"+ arete +"%';";
        PreparedStatement st = this.conexion.prepareStatement(Query);
        
        lista= new ArrayList();
        ResultSet rs = st.executeQuery();
        while (rs.next()){
            Vacas vaca = new Vacas();
            vaca.setId(rs.getInt("id"));
            vaca.setArete(rs.getString("arete"));
            vaca.setAlias(rs.getString("alias"));
            vaca.setArete_bebe(rs.getString("arete_bebe"));
            vaca.setRancho(rs.getString("rancho"));
            vaca.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
            vaca.setRaza(rs.getString("raza"));
            vaca.setEmpadre(rs.getString("empadre"));
            vaca.setFinalidad(rs.getString("finalidad"));
            lista.add(vaca);
        }
        rs.close();
        st.close();
    }catch(Exception e){
            throw e;
    } finally {
            this.cerrar();
        }
    return lista;
    }

    @Override
    public Vacas getVacaByID(int id) throws Exception {
        Vacas vaca = new Vacas();
    try{
        this.conectar();
        PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM animales WHERE id = ? LIMIT 1");
        
        st.setInt(1, id);
        ResultSet rs = st.executeQuery();
        while (rs.next()){
            
            vaca.setId(rs.getInt("id"));
            vaca.setArete(rs.getString("arete"));
            vaca.setAlias(rs.getString("alias"));
            vaca.setArete_bebe(rs.getString("arete_bebe"));
            vaca.setRancho(rs.getString("rancho"));
            vaca.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
            vaca.setRaza(rs.getString("raza"));
            vaca.setEmpadre(rs.getString("empadre"));
            vaca.setFinalidad(rs.getString("finalidad"));
            
        }
        rs.close();
        st.close();
    }catch(Exception e){
            throw e;
    } finally {
            this.cerrar();
        }
    return vaca;
    
    }

    @Override
    public boolean existeArete(String arete) throws Exception {
    boolean existe = false;
    try {
        this.conectar();
        String sql = "SELECT COUNT(*) FROM animales WHERE arete = ?";
        PreparedStatement st = this.conexion.prepareStatement(sql);
        st.setString(1, arete);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            existe = rs.getInt(1) > 0;
        }
        rs.close();
        st.close();
    } catch (Exception e) {
        throw e;
    } finally {
        this.cerrar();
    }
    return existe;    }
    
}
