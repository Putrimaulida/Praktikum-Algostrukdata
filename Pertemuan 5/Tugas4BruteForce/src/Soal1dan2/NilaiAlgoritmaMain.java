/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1dan2;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class NilaiAlgoritmaMain {
    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.print("Banyak Data : ");
        int byk = ap.nextInt();
        NilaiAlgoritma[] total = new NilaiAlgoritma[byk];
        for (int i = 0; i < byk; i++){
            total[i] = new NilaiAlgoritma();
            System.out.println("______________________________");
            System.out.println("Masukkan mahasiswa ke- " + (i + 1));
            System.out.print("Nama        : ");
            total[i].namaMhs = ap.next();
            System.out.print("Nilai Tugas : ");
            total[i].nilaiTugas = ap.nextInt();
            System.out.print("Nilai Kuis  : ");
            total[i].nilaiKuis = ap.nextInt();
            System.out.print("Nilai UTS   : ");
            total[i].nilaiUTS = ap.nextInt();
            System.out.print("Nilai UAS   : ");
            total[i].nilaiUAS = ap.nextInt();
        }
        
        for (int i = 0; i < byk; i++){
            System.out.println("Total Nilai Mahasiswa ke-" + (i +1) + " :" + total[i].hitungTotalNilai());
        }
    }
}
