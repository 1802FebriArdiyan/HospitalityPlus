/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Pegawai {
    private int idPegawai;
    private String nama;

    public Pegawai(int idPegawai, String nama) {
        this.idPegawai = idPegawai;
        this.nama = nama;
    }

    public void setIdPegawai(int idPegawai) {
        this.idPegawai = idPegawai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getIdPegawai() {
        return idPegawai;
    }

    public String getNama() {
        return nama;
    }
    
}
