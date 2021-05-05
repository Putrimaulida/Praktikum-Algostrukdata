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
public class DLLMain2 {
    public static void main(String[] args)throws Exception {
        DLL2 dll = new DLL2();        
        Scanner putri = new Scanner(System.in);
        Scanner maul = new Scanner(System.in);
        
        int a = 0;
        do{
            menu();
            a = putri.nextInt();
            
            switch(a){
                case 1:{
                    System.out.println("Masukkan judul Buku : ");
                    String data = maul.nextLine();
                    dll.addLast(data);
                    break;
                }
                case 2:{                    
                    dll.pop();
                    System.out.println("Buku pada tumpukan teratas telah diambil");
                    break;
                }
                case 3:{
                    System.out.println("Cek Buku Teratas");
                    System.out.println("----------------------");
                    System.out.println(dll.peek());
                    break;
                }
                case 4:{
                    System.out.println("Cetak Seluruh Judul Buku");
                    System.out.println("------------------------");
                    dll.print();                    
                    break;
                }                
            }
            
        } while(a !=5);
    }
    public static void menu(){
        System.out.println("========================");
        System.out.println("Data Buku Perpustakaan");
        System.out.println("========================");
        System.out.println("1. Entry Judul Buku");
        System.out.println("2. Ambil Buku Teratas");
        System.out.println("3. Cek Judul Buku Teratas");
        System.out.println("4. Info Semua Judul Buku");
        System.out.println("5. Keluar");        
        System.out.println("=========================");
    }
}
