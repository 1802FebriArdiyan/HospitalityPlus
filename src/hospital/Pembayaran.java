/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

    
public class Pembayaran {
    private int idPembayaran;
    private double totalPembayaran;
    private String statusPembayaran;

    public Pembayaran(int idPembayaran, double totalPembayaran, String statusPembayaran) {
        this.idPembayaran = idPembayaran;
        this.totalPembayaran = totalPembayaran;
        this.statusPembayaran = statusPembayaran;
    }

    public int getIdPembayaran() {
        return idPembayaran;
    }

    public double getTotalPembayaran() {
        return totalPembayaran;
    }

    public String getStatusPembayaran() {
        return statusPembayaran;
    }

    public void setIdPembayaran(int idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public void setTotalPembayaran(double totalPembayaran) {
        this.totalPembayaran = totalPembayaran;
    }

    public void setStatusPembayaran(String statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }
    
    
    
}
