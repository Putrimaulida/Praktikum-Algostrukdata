/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class DLLMain1 {
    public static void main(String[] args) throws Exception {
        DLL1 dll = new DLL1();
        Scanner ap = new Scanner(System.in);
        
        int a = 0;
        do {
            menu();
            a = ap.nextInt();
            
            switch(a){
                case 1:{
                    System.out.println("Masukkan data head : ");
                    int head = ap.nextInt();
                    dll.addFirst(head);
                    break;
                }
                case 2:{
                    System.out.print("Masukkan data tail : ");
                    int tail = ap.nextInt();
                    dll.addLast(tail);
                    break;
                }
                case 3:{
                    System.out.print("Masukkan data : ");
                    int data = ap.nextInt();
                    System.out.print("Alamat pointer : ");
                    int pt = ap.nextInt();
                    dll.add(data, pt);
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
                    int pt = ap.nextInt();
                    dll.remove(pt);
                    System.out.println("Menghapus data pada index-"+pt);
                    break;
                }
                case 7:{                    
                    dll.print();
                    break;
                }
                case 8:{                    
                    System.out.print("Cari data : ");
                    int cari = ap.nextInt();
                    dll.search(cari);
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
        System.out.println("====================================================");
        System.out.println("PROGRAM PENGOLAAN ANGKA DENGAN DOUBLY LINKED LIST");
        System.out.println("====================================================");
        System.out.println("1. Tambah head");
        System.out.println("2. Tambah tail");
        System.out.println("3. Tambah Data");
        System.out.println("4. Hapus data pertama");
        System.out.println("5. Hapus data terakhir");
        System.out.println("6. Hapus data tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari");
        System.out.println("9. Urut data");
        System.out.println("10. Keluar");
        System.out.println("====================================================");
    }
}
