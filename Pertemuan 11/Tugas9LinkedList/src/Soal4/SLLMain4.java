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
public class SLLMain4 {
    static void menu(){
        System.out.println("MENU NASABAH BANK DENGAN LINKED LIST");
        System.out.println("1. Tambah nasabah dengan addFirst()");
        System.out.println("2. Tambah nasabah dengan addLast()");
        System.out.println("3. Tambah nasabah dengan insertAfter()");
        System.out.println("4. Tambah nasabah dengan insertAt()");
        System.out.println("5. Hapus nasabah dengan removeFirst()");
        System.out.println("6. Hapus nasabah dengan removeLast()");
        System.out.println("7. Hapus nasabah dengan remove()");
        System.out.println("8. Hapus nasabah dengan removeAt()");
        System.out.println("9. Cetak semua data nasabah");
        System.out.println("0. Keluar program");
        System.out.print("pilih : ");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);

        SLL4 sll=new SLL4();
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
                    sll.addFirst(a,b,c);
                    break;
                } case 2:{
                    System.out.print("Masukkan No.Rek\t: ");
                    String a=sc.nextLine();
                    System.out.print("Masukkan Nama\t: ");
                    String b=sc.nextLine();
                    System.out.print("Masukkan Alamat\t: ");
                    String c=sc.nextLine();
                    sll.addLast(a,b,c);
                    break;
                } case 3:{
                    System.out.print("Masukkan key (nama/no.rek) : ");
                    String key=sc.nextLine();
                    System.out.print("Masukkan No.Rek\t: ");
                    String a=sc.nextLine();
                    System.out.print("Masukkan Nama\t: ");
                    String b=sc.nextLine();
                    System.out.print("Masukkan Alamat\t: ");
                    String c=sc.nextLine();
                    sll.insertAfter(key,a,b,c);
                    break;
                } case 4:{
                    System.out.print("Masukkan index : ");
                    int idx=sc1.nextInt();
                    System.out.print("Masukkan No.Rek\t: ");
                    String a=sc.nextLine();
                    System.out.print("Masukkan Nama\t: ");
                    String b=sc.nextLine();
                    System.out.print("Masukkan Alamat\t: ");
                    String c=sc.nextLine();
                    sll.insertAt(idx,a,b,c);
                    break;
                } case 5:{
                    sll.removeFirst();
                    System.out.println("Berhasil menghapus nasabah!");
                    break;
                } case 6:{
                    sll.removeLast();
                    System.out.println("Berhasil menghapus nasabah!");
                    break;
                } case 7:{
                    System.out.print("Masukkan key (nama/no.rek) : ");
                    String key=sc.nextLine();
                    sll.remove(key);
                    System.out.println("Berhasil menghapus nasabah!");
                    break;
                } case 8:{
                    System.out.print("Masukkan index : ");
                    int idx=sc1.nextInt();
                    sll.removeAt(idx);
                    System.out.println("Berhasil menghapus nasabah!");
                    break;
                } case 9:{
                    sll.print();
                    break;
                } default:
                    if(pilih>9&&pilih<0){
                        System.out.println("Pilihan salah!");
                    }
                    break;
            }
            System.out.println("");
        } while(pilih!=0);
    }
}
