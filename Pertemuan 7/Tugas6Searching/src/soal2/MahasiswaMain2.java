/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class MahasiswaMain2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner (System.in);
        PencarianMhs2 data = new PencarianMhs2();
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int jumMhs = s.nextInt();
        data.jmlhMhs(jumMhs);
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim terkecil");
        for (int i = 0; i < jumMhs; i++){
            System.out.println("--------------------------");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = s1.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();
            
            Mahasiswa2 m = new Mahasiswa2(nim, nama, umur, ipk);
            data.tambah(m);
        }
        System.out.println("------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();
        System.out.println("------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan NAMA Mahasiswa yang dicari :");
        System.out.print("Nama : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequensial Search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    
    }
}
