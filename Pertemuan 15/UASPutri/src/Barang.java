/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Barang {
    int kode;
    String nama;
    int harga;
    int stok;

    public Barang(int kode, String nama, int harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public int getStock() {
        return this.stok;
    }

    public int getHarga() {
        return this.harga;
    }

    public String getNama() {
        return this.nama;
    }


    public void minStock(int jumlahBeli) {
        this.stok -= jumlahBeli;
    }
}
