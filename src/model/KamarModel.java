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

public class KamarModel {
    private final Connection CONN;
    
    public KamarModel(){
        this.CONN = DBHelper.getConnection();
    }
    
    //add kamar
    public void addKamar(kamar Kamar){
        String insert = "INSERT INTO `kamar` VALUES ('" + Kamar.getIdKamar() + "','" + Kamar.getDetailKamar() +"','" + Kamar.getKetersediaan() + "')";
        
        System.out.println(insert);
        
        try {
            if (CONN.createStatement().executeUpdate(insert) > 0) {
                System.out.println("Berhasil memesan kamar");
            } else {
                System.out.println("Gagal memesan kamar");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KamarModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal memesan kamar");
        }
    }
    
     //get Pemesanan Kamar
    public ArrayList<kamar> getKamar() {
        String query = "SELECT * FROM `kamar`";
        ArrayList<kamar> listKamar = new ArrayList<>();
        
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
           
            while(rs.next()) {
                kamar temp;
                temp = new kamar(rs.getString("idKamar"), rs.getString("detailKamar"), rs.getBoolean("ketersediaan"));
                listKamar.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PemesananModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listKamar;
    }
    
    
    //update Kamar
    public void updateKamar(int id, kamar Kamar) {
        String update = "UPDATE `kamar` SET `ketersediaan` ='" + Kamar.getKetersediaan() +"'  WHERE idKamar ='" + id + "'";
        System.out.println(update);
        
        try {
            if (CONN.createStatement().executeUpdate(update) > 0) {
                System.out.println("Berhasil mengubah ketersediaan kamar");
            } else {
                System.out.println("Gagal mengubah ketersediaan kamar");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KamarModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal mengubah ketersediaan kamar");
        }
    }
    
    //delete Pemesanan Kamar
    public void deleteKamar(int id) {
        String delete = "DELETE FROM `kamar` WHERE idKamar ='" + id + "'";
        System.out.println(delete);
        
        try {
            if (CONN.createStatement().executeUpdate(delete) > 0) {
                System.out.println("Berhasil menghapus pemesanan kamar");
            } else {
                System.out.println("Gagal menghapus pemesanan kamar");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KamarModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menghapus pemesanan ");
        }
    }
}
