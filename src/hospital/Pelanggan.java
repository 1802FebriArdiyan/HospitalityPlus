/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Acer
 */
public class Pelanggan {
    private int idPelanggan;
    private String nama_pelanggan;
    private String email;

    public Pelanggan(int idPelanggan, String nama_pelanggan, String email) {
        this.idPelanggan = idPelanggan;
        this.nama_pelanggan = nama_pelanggan;
        this.email = email;
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public String getNama_pelanggan() {
        return nama_pelanggan;
    }

    public String getEmail() {
        return email;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public void setNama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}


