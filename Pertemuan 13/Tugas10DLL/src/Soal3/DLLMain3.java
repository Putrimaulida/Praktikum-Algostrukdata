/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class DLLMain3 {
    public static void main(String[] args)throws Exception {
        DLL3 dll = new DLL3();        
        Scanner scPutri = new Scanner(System.in);
        Scanner scMaul = new Scanner(System.in);
        
        int a = 0;
        do{
            menu();
            a = scPutri.nextInt();
            
            switch(a){
                case 1:{
                    System.out.println("=============================");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("=============================");
                    System.out.print("Nomor Antrian : ");
                    String nomor = scMaul.nextLine();
                    System.out.print("Nama Penerima : ");
                    String nama = scMaul.nextLine();
                    dll.addLast(nomor, nama);
                    break;
                }
                case 2:{ 
                    dll.removeFirst();
                    break;
                }
                case 3:{
                    System.out.println("+++++++++++++++++++++++");
                    System.out.println("Daftar Pengantri Vaksin");
                    System.out.println("+++++++++++++++++++++++");
                    dll.print();
                    break;
                }                                
            }
            
        } while(a !=4);
    }
    public static void menu(){
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");                
        System.out.println("+++++++++++++++++++++++++++++++");
    }
}
