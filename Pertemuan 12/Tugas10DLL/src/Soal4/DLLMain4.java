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
public class DLLMain4 {
    public static void main(String[] args)throws Exception {
        DLL4 dll = new DLL4();        
        Scanner scPutri = new Scanner(System.in);
        
        int a = 0;
        do{
            menu();
            a = scPutri.nextInt();
            
            switch(a){
                case 1:{
                    scPutri.nextLine();
                    System.out.println("Masukkan data posisi awal : ");
                    System.out.print("NIM : ");
                    String nim = scPutri.nextLine();
                    System.out.print("Nama : ");
                    String nama = scPutri.nextLine();
                    System.out.print("IPK : ");
                    double ipk = scPutri.nextDouble();
                    dll.addFirst(nim, nama, ipk);
                    break;
                }
                case 2:{
                    scPutri.nextLine();
                    System.out.println("Masukkan data posisi akhir : ");
                    System.out.print("NIM : ");
                    String nim = scPutri.nextLine();
                    System.out.print("Nama : ");
                    String nama = scPutri.nextLine();
                    System.out.print("IPK : ");
                    double ipk = scPutri.nextDouble();
                    dll.addLast(nim, nama, ipk);
                    break;
                }
                case 3:{
                    scPutri.nextLine();
                    System.out.println("Masukkan data mahasiswa : ");
                    System.out.print("NIM : ");
                    String nim = scPutri.nextLine();
                    System.out.print("Nama : ");
                    String nama = scPutri.nextLine();
                    System.out.print("IPK : ");
                    double ipk = scPutri.nextDouble();
                    System.out.print("Data mahasiswa ini akan dimasukkan di urutan ke-");
                    int idx = scPutri.nextInt();
                    dll.add(nim, nama, ipk, idx);
                    break;
                }
                case 4:{
                    dll.removeFirst();
                    System.out.println("Menghapus data pertama");
                    break;
                }
                case 5:{
                    dll.removeLast();
                    System.out.println("Menghapus data terakhir");
                    break;
                }
                case 6:{
                    System.out.print("Menghapus data pada index ke- ");
                    int pt = scPutri.nextInt();
                    dll.remove(pt);
                    System.out.println("Menghapus data pada index-"+pt);
                    break;
                }
                case 7:{
                    System.out.println("Cetak Data");
                    dll.print();
                    break;
                }
                case 8:{                    
                    scPutri.nextLine();
                    System.out.println("Cari Data");
                    System.out.print("Masukkan NIM yang dicari : ");
                    String nim = scPutri.nextLine();
                    dll.search(nim);
                    break;
                }
                case 9:{                    
                    dll.bubbleSort();
                    break;
                }
            }
            
        } while(a !=10);     
    }
    public static void menu(){
        System.out.println("==================================");
        System.out.println("SISTEM PENGELOLAAN DATA MAHASISWA");
        System.out.println("==================================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari NIM");
        System.out.println("9. Urut Data IPK-DESC");
        System.out.println("10. Keluar");
        System.out.println("==================================");
    }
}
