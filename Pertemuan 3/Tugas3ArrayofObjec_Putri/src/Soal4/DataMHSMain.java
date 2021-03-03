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
public class DataMHSMain {
    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        System.out.print("Jumlah Mahasiswa : ");
        int n = ap.nextInt();
        System.out.println();
        DataMHS[] dmArray = new DataMHS[n];
        
        for (int i = 0; i < n; i++){
            dmArray[i] = new DataMHS();
            System.out.println("Masukkan data mahasiswa ke- " + (i+1));
            System.out.print("Masukkan nama : ");
            dmArray[i].nama = ap.next();
            System.out.print("Masukkan nim : ");
            dmArray[i].nim = ap.nextInt();
            System.out.print("Masukkan jenis kelamin : ");
            dmArray[i].jenisKelamin = ap.next();
            System.out.print("Masukkan IPK : ");
            dmArray[i].IPK = ap.nextDouble();
            System.out.println();
        } 
        
        for(int i = 0; i < n; i++){
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("Nama : " + dmArray[i].nama);
            System.out.println("NIM : " + dmArray[i].nim );
            System.out.println("Jenis Kelamin : " + dmArray[i].jenisKelamin);
            System.out.println("IPK : " + dmArray[i].IPK);
        }
    }
}
