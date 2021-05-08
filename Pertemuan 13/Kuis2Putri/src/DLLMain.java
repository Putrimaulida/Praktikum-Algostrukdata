
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class DLLMain {
    public static void main(String[] args)throws Exception {
        DLL dll = new DLL();        
        Scanner scPutri = new Scanner(System.in);
        
        int a = 0;
        do{
            menu();
            a = scPutri.nextInt();
            
            switch(a){
                case 1:{
                    scPutri.nextLine();
                    System.out.println(">> Masukkan data mahasiswa << ");
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
                case 2:{
                    scPutri.nextLine();
                    System.out.println(">> Masukkan data posisi akhir <<");
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
                    System.out.println(">> Masukkan data posisi awal <<");
                    System.out.print("NIM : ");
                    String nim = scPutri.nextLine();
                    System.out.print("Nama : ");
                    String nama = scPutri.nextLine();
                    System.out.print("IPK : ");
                    double ipk = scPutri.nextDouble();
                    dll.addFirst(nim, nama, ipk);
                    break;
                }
                case 4:{
                    System.out.print("Menghapus data pada index ke- ");
                    int pt = scPutri.nextInt();
                    dll.remove(pt);
                    System.out.println("Menghapus data pada index-"+pt);
                    break;
                }
                case 5:{
                    dll.removeFirst();
                    System.out.println(">> Menghapus data Mahasiswa posisi awal <<");
                    break;
                }
                case 6:{
                    dll.removeLast();
                    System.out.println(">> Menghapus data Mahasiswa posisi akhir <<");
                    break;
                }
                
                case 7:{
                    System.out.println(">> Cetak Data Mahasiswa <<");
                    dll.print();
                    break;
                }
                case 8:{
                    System.out.println(">> Data Mahasiswa Urutan Pertama <<");
                    System.out.println(dll.peek());
                    break;
                }
                case 9:{                    
                    scPutri.nextLine();
                    System.out.println(">> Cari Data <<");
                    System.out.print("Masukkan NIM yang dicari : ");
                    String nim = scPutri.nextLine();
                    dll.search(nim);
                    break;
                }
                case 10:{
                    System.out.println("Mengurutkan Data Mahasiswa (IPK)");
                    dll.selectionSort();
                    break;
                }
            }
            
        } while(a !=11);     
    }
    
    
    public static void menu(){
        System.out.println("=====================================");
        System.out.println("            DATA MAHASISWA           ");
        System.out.println("=====================================");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Awal");
        System.out.println("4. Hapus Data Mahasiswa");
        System.out.println("5. Hapus Data Awal"); 
        System.out.println("6. Hapus Data Akhir");
        System.out.println("7. Cetak Data Mahasiswa");
        System.out.println("8. Cari Data Mahasiswa Urutan Pertama");
        System.out.println("9. Cari Data Mahasiswa (NIM)");
        System.out.println("10. Urut Data Mahasiswa (IPK)");
        System.out.println("11. Keluar");
        System.out.println("=====================================");
    }
}

