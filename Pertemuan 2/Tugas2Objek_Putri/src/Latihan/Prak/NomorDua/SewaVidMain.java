/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Prak.NomorDua;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class SewaVidMain {
     public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        SewaVid sw = new SewaVid();
        
        System.out.print("ID Game\t\t\t : ");
        sw.id = ap.nextInt();
        System.out.print("Nama Member\t\t : ");
        sw.namaMember = ap.next();
        System.out.print("Nama Game\t\t : ");
        sw.namaGame = ap.next();
        System.out.print("Lama Peminjaman(hari)\t : ");
        sw.lamaPinjam = ap.nextInt();
        
        int hitungHrg = sw.hitungHarga();
        System.out.println("Total Harga\t\t : Rp " + hitungHrg);
        System.out.print("Bayar Tunai\t\t : Rp ");
        int byr = ap.nextInt();
        int kembalian = byr - hitungHrg;
        System.out.println("Kembalian\t\t : Rp " + kembalian);
    }
}
