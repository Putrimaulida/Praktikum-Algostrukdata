/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal2;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class MahasiswaMain {
    
    static void menu() {
     
        System.out.println("Pilih menu :");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Semua Antrian"); 
        System.out.println("4. Cek Antrian terdepan");
        System.out.println("5. Cek antrian paling belakang");       
        System.out.println("6. Cek posisi antrian");
        System.out.println("7. Cari data mahasiswa");
        System.out.println("------------------------");
    }
    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas antrian : ");
        int max = sc1.nextInt();
        QueueMahasiswa antri = new QueueMahasiswa(max);
        int pilih;
        do {
            menu();
            pilih = sc1.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = sc2.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc2.nextLine();
                    System.out.print("No. Absen : ");
                    int absen = sc1.nextInt();
                    System.out.print("IPK : ");
                    double ipk = sc1.nextDouble();
                    Mahasiswa m = new Mahasiswa(nim, nama, absen, ipk);
                    antri.Enqueue(m);
                    break;
                case 2:
                    Mahasiswa data = antri.Dequeue();
                    if (!"".equals(data.nim) && !"".equals(data.nama)
                            && data.absen != 0 && data.ipk != 0) {
                        System.out.println("Antrian yang keluar : " + data.nim + " " + data.nama
                                + " " + data.absen + " " + data.ipk);
                        break;
                    }
                case 3:
                    antri.print();
                    break;
                case 4:
                    antri.peek();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan NIM : ");
                    String ceknim = sc2.nextLine();
                    antri.peekPosition(ceknim);
                    break;
                case 7:
                    System.out.print("Masukkan nomor antrian : ");
                    int cekantri = sc1.nextInt();
                    antri.printMahasiswa(cekantri);
                    break;
            }
        } while (pilih > 0 && pilih < 8);
    }
}
