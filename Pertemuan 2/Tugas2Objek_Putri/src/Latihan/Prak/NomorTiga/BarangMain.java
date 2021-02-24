/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Prak.NomorTiga;

import static Latihan.Prak.NomorTiga.Barang.ulang;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class BarangMain {
    public static void main(String[] args) {
        Scanner ap = new Scanner (System.in);
        Barang b1  = new Barang();
        System.out.println("==============================");
        System.out.println("\t MAULIDA SHOP");
        System.out.println("==============================");
        
        do {
            System.out.print("Nama barang  : ");
            Barang.nama = ap.next();
            System.out.print("Harga satuan : ");
            Barang.hargaSatuan = ap.nextInt();
            System.out.print("Jumlah\t     : ");
            Barang.jumlah = ap.nextInt();
            System.out.println("------------------------------ x");
            System.out.println("Total\t     : " + b1.hitungHargaTotal());
            System.out.println("Diskon\t     : " + b1.hitungDiskon());
            System.out.println("------------------------------ -");
            System.out.println("Total bayar  : " + b1.hitungHargaBayar());
            System.out.println();
            System.out.print("Ulang (y/t) ? ");
            ap.nextLine();
            Barang.ulang = ap.nextLine();
        } 
        while (ulang.equalsIgnoreCase("Y"));
        int i = 0;
        i++;      
    }
}
