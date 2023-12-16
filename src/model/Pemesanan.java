/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Pemesanan {
    private int idPemesanan;
    private String CheckInDate;
    private String CheckOutDate;
    private int jumlahTamu;

    public Pemesanan(int idPemesanan, String CheckInDate, String CheckOutDate, int jumlahTamu) {
        this.idPemesanan = idPemesanan;
        this.CheckInDate = CheckInDate;
        this.CheckOutDate = CheckOutDate;
        this.jumlahTamu = jumlahTamu;
    }

    public void setIdPemesanan(int idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public void setCheckInDate(String CheckInDate) {
        this.CheckInDate = CheckInDate;
    }

    public void setCheckOutDate(String CheckOutDate) {
        this.CheckOutDate = CheckOutDate;
    }

    public void setJumlahTamu(int jumlahTamu) {
        this.jumlahTamu = jumlahTamu;
    }

    public int getIdPemesanan() {
        return idPemesanan;
    }

    public String getCheckInDate() {
        return CheckInDate;
    }

    public String getCheckOutDate() {
        return CheckOutDate;
    }

    public int getJumlahTamu() {
        return jumlahTamu;
    }
    
    
}
