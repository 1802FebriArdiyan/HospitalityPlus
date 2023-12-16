/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import db.DBHelper;

public class PegawaiModel {
    private final Connection CONN;
    
    public PegawaiModel(){
        this.CONN = DBHelper.getConnection();
    }
    
    //add Pegawai
    public void addPegawai(Pegawai pegawai){
        String insert = "INSERT INTO `pelanggan` VALUES ('" + pegawai.getIdPegawai() + "','" + pegawai.getNama() +"','" + "')";
        
        System.out.println(insert);
        
        try {
            if (CONN.createStatement().executeUpdate(insert) > 0) {
                System.out.println("Berhasil memasukkan pegawai");
            } else {
                System.out.println("Gagal memasukkan pegawai");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PelangganModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal memasukkan pegawai");
        }
    }
    
    //getPegawai
    public ArrayList<Pegawai> getPegawai() {
        String query = "SELECT * FROM `Pegawai`";
        ArrayList<Pegawai> listPegawai = new ArrayList<>();
        
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
           
            while(rs.next()) {
                Pegawai temp = new Pegawai(rs.getInt("idPegawai"), rs.getString("nama"));
                listPegawai.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PegawaiModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listPegawai;
    }
    
    
    //update Pegawai
    public void updatePegawai(int id, Pegawai pegawai) {
        String update = "UPDATE `pegawai` SET `nama`='" + pegawai.getNama() + "' WHERE idPegawai ='" + id + "'";
        System.out.println(update);
        
        try {
            if (CONN.createStatement().executeUpdate(update) > 0) {
                System.out.println("Berhasil mengubah pegawai");
            } else {
                System.out.println("Gagal mengubah pegawai");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PegawaiModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal mengubah pegawai");
        }
    }
    
    
    //delete Pegawai
    public void deletePegawai(int id) {
        String delete = "DELETE FROM `pegawai` WHERE idPegawai ='" + id + "'";
        System.out.println(delete);
        
        try {
            if (CONN.createStatement().executeUpdate(delete) > 0) {
                System.out.println("Berhasil menghapus nama pegawai");
            } else {
                System.out.println("Gagal menghapus nama pegawai");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PegawaiModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menghapus nama pegawai ");
        }
    }
}
