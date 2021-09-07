/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Transaksi {
    int kode;
    String namaBarang;
    int hargaSatuan;
    int jumlahBarang;
    int hargaTotal;
    int bayar;

    public Transaksi(int kode, String namaBarang, int hargaSatuan, int jumlahBarang, int hargaTotal, int bayar) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaSatuan = hargaSatuan;
        this.jumlahBarang = jumlahBarang;
        this.hargaTotal = hargaTotal;
        this.bayar = bayar;
    }
}
