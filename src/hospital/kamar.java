/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

public class kamar {
    private String idKamar;
    private String detailKamar;
    private boolean ketersediaan;

    public kamar(String idKamar, String detailKamar, boolean ketersediaan) {
        this.idKamar = idKamar;
        this.detailKamar = detailKamar;
        this.ketersediaan = ketersediaan;
    }

    public void setIdKamar(String idKamar) {
        this.idKamar = idKamar;
    }

    public void setDetailKamar(String detailKamar) {
        this.detailKamar = detailKamar;
    }

    public void setKetersediaan(boolean ketersediaan) {
        this.ketersediaan = ketersediaan;
    }

    public String getIdKamar() {
        return idKamar;
    }

    public String getDetailKamar() {
        return detailKamar;
    }

    public boolean isKetersediaan() {
        return ketersediaan;
    }

    String getKetersediaan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
