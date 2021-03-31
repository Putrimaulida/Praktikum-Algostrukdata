/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal4;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Array1Main {
    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai Array : ");
        int jml = ap.nextInt();
        PencarianArray1 tg = new PencarianArray1(jml);
        System.out.println("--------------------------------");
        System.out.println("");
        System.out.println("========== INPUT NILAI =========");
        for (int i = 0; i < jml; i++){
            System.out.print("Nilai ke " + i + " : ");
            int nilai = ap.nextInt();
            Array1 t = new Array1(nilai);
            tg.tambah(t);
        }
        
        System.out.println("");
        System.out.println("=================================");
        System.out.println("==== DATA NILAI KESELURUHAN =====");
        System.out.println("=================================");
        tg.selectionSort();
        tg.tampil();
        System.out.println("");
        System.out.println("__________________");
        System.out.println("");
        System.out.println("======== PENCARIAN DATA =========");
        System.out.print("Masukkan nilai yang dicari : ");
        int cari = ap.nextInt();
        System.out.println("---------------------------------");
        
        System.out.println("");
        System.out.println("BINARY SEARCH");
        int index = tg.BinarySearch(cari, 0, jml - 1);
        if (index == -1){
            System.out.println("Data tidak ditemukan");
        }
    }
}
