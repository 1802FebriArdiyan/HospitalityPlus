/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import db.DBHelper;

public class PemesananModel {
    private final Connection CONN;
    
    public PemesananModel(){
        this.CONN = DBHelper.getConnection();
    }
    
    //add Pemesanan
    public void addPemesanan(Pemesanan pemesanan){
        String insert;
        insert = "INSERT INTO `pemesanan` VALUES ('" + pemesanan.getIdPemesanan() + "','" + pemesanan.getCheckInDate() +"','" + pemesanan.getCheckOutDate() +"','" + pemesanan.getJumlahTamu() +"')";
        
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
    
     //getPemesanan
    public ArrayList<Pemesanan> getPemesanan() {
        String query = "SELECT * FROM `Pemesanan`";
        ArrayList<Pemesanan> listPemesanan = new ArrayList<>();
        
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
           
            while(rs.next()) {
                Pemesanan temp = new Pemesanan(rs.getInt("idPemesanan"), rs.getString("CheckInDate"), rs.getString("CheckOutDate"), rs.getInt("jumlahTamu"));
                listPemesanan.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PemesananModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listPemesanan;
    }
    
    
    //update Pemesanan
    public void updatePemesanan(int id, Pemesanan pemesanan) {
        String update = "UPDATE `pemesanan` SET `CheckInDate`, `CheckOutDate` ='" + pemesanan.getCheckInDate() + pemesanan.getCheckOutDate() +"'  WHERE idPemesanan ='" + id + "'";
        System.out.println(update);
        
        try {
            if (CONN.createStatement().executeUpdate(update) > 0) {
                System.out.println("Berhasil mengubah pemesanan");
            } else {
                System.out.println("Gagal mengubah pemesanan");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PemesananModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal mengubah pemesanan");
        }
    }
    
    //delete Pemesanan
    public void deletePemesanan(int id) {
        String delete = "DELETE FROM `pemesanan` WHERE idPemesanan ='" + id + "'";
        System.out.println(delete);
        
        try {
            if (CONN.createStatement().executeUpdate(delete) > 0) {
                System.out.println("Berhasil menghapus pemesanan");
            } else {
                System.out.println("Gagal menghapus pemesanan");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PemesananModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menghapus nama pemesanan ");
        }
    }
}
