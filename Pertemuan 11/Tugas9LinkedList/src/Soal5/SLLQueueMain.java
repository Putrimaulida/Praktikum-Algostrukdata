/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal5;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class SLLQueueMain {
    static void menu(){
        System.out.println("QUEUE NASABAH BANK DENGAN LINKED LIST");
        System.out.println("1. Tambah antrian nasabah dengan Enqueue()");
        System.out.println("2. Hapus antrian nasabah dengan Dequeue()");
        System.out.println("3. Lihat antrian terdepan dengan Peek()");
        System.out.println("4. Mencari posisi antrian dengan PeekPosition");
        System.out.println("5. Cetak daftar antrian dengan Print()");
        System.out.println("0. Keluar program");
        System.out.print("pilih : ");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        
        SLLQueue sll=new SLLQueue();
        int pilih;
        do{
            menu();
            pilih=sc1.nextInt();
            switch (pilih){
                case 1:{
                    System.out.print("Masukkan No.Rek\t: ");
                    String a=sc.nextLine();
                    System.out.print("Masukkan Nama\t: ");
                    String b=sc.nextLine();
                    System.out.print("Masukkan Alamat\t: ");
                    String c=sc.nextLine();
                    sll.addLast(a,b,c);
                    break;
                } case 2:{
                    sll.removeFirst();
                    System.out.println("Berhasil menghapus antrian nasabah!");
                    break;
                } case 3:{
                    sll.getDataHead();
                    break;
                } case 4:{
                    System.out.print("Masukkan nama yang dicari : ");
                    String key=sc.nextLine();
                    sll.getPosition(key);
                    break;
                } case 5:{
                    sll.print();
                    break;
                } default:
                    if(pilih>5&&pilih<0){
                        System.out.println("Pilihan salah!");
                    }
                    break;
            }
            System.out.println("");
        } while(pilih!=0);
    }
}
