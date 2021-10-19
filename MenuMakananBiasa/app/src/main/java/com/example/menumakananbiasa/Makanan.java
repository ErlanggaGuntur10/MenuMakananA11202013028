package com.example.menumakananbiasa;

public class Makanan {
    private String namaMakanan,descMakanan,hargaMakanan;
    private int idGambar;

    public Makanan(String namaMakanan, String descMakanan, String hargaMakanan, int idGambar) {
        this.namaMakanan = namaMakanan;
        this.descMakanan = descMakanan;
        this.hargaMakanan = hargaMakanan;
        this.idGambar = idGambar;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public String getDescMakanan() {
        return descMakanan;
    }

    public void setDescMakanan(String descMakanan) {
        this.descMakanan = descMakanan;
    }

    public String getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(String hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    public int getIdGambar() {
        return idGambar;
    }

    public void setIdGambar(int idGambar) { this.idGambar = idGambar;
    }
}
