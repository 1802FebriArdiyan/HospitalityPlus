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

public class PembayaranModel {
    private final Connection CONN;
    
    public PembayaranModel(){
        this.CONN = DBHelper.getConnection();
    }
    
    //add Pemesanan
    public void addPembayaran(Pembayaran pembayaran){
        String insert = "INSERT INTO `pemabayaran` VALUES ('" + pembayaran.getIdPembayaran() + "','" + pembayaran.getTotalPembayaran() +"','" + pembayaran.getStatusPembayaran() +"')";
        
        System.out.println(insert);
        
        try {
            if (CONN.createStatement().executeUpdate(insert) > 0) {
                System.out.println("Berhasil menambahkan pemesanan");
            } else {
                System.out.println("Gagal menambahkan pemesanan");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PemesananModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menambahkan pemesanan");
        }
    }
    
     //get Pembayaran
    public ArrayList<Pembayaran> getPembayaran() {
        String query = "SELECT * FROM `Pembayaran`";
        ArrayList<Pembayaran> listPembayaran = new ArrayList<>();
        
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
           
            while(rs.next()) {
                Pembayaran temp = new Pembayaran(rs.getInt("idPembayaran"), rs.getDouble("totalPembayaran"), rs.getString("statusPembayaran"));
                listPembayaran.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PemesananModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listPembayaran;
    }
    
    //update Pembayaran
    public void updatePembayaran(int id, Pembayaran pembayaran) {
        String update = "UPDATE `pembayaran` SET `statusPembayaran` ='" + pembayaran.getStatusPembayaran() +"'  WHERE idPembayaran ='" + id + "'";
        System.out.println(update);
        
        try {
            if (CONN.createStatement().executeUpdate(update) > 0) {
                System.out.println("Berhasil mengubah status pembayaran");
            } else {
                System.out.println("Gagal mengubah status pembayaran");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PembayaranModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal mengubah pembayaran");
        }
    }
    
     
    //delete Pembayaran
     public void deletePembayaran(int id) {
        String delete = "DELETE FROM `pembayaran` WHERE idPembayaran='" + id + "'";
        System.out.println(delete);
        
        try {
            if (CONN.createStatement().executeUpdate(delete) > 0) {
                System.out.println("Berhasil menghapus pembayaran");
            } else {
                System.out.println("Gagal menghapus pembayaran");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PembayaranModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menghapus pembayaran");
        }
    }
}
