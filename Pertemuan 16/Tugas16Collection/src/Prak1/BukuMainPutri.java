/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prak1;

/**
 *
 * @author asus
 */
import java.util.*;
public class BukuMainPutri {
    public static void main(String[] args) {

        Stack<BukuPutri> buku = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("********************");
            System.out.println("Data Buku Perpusatakaan");
            System.out.println("********************");
            System.out.println("1. Entry Judul Buku");
            System.out.println("2. Ambil Buku Teratas");
            System.out.println("3. Cek Buku Teratas");
            System.out.println("4. Info Semua Judul Buku");
            System.out.println("5. Keluar");
            System.out.println("********************");
            System.out.print("Pilihan: ");

            pilih = sc.nextInt();
            if (pilih == 1) {
                System.out.println("");
                String entry = sc.nextLine();
                System.out.print("Isbn\t : ");
                String isbn = sc.nextLine();
                System.out.print("Judul\t : ");
                String judul = sc.nextLine();
                System.out.print("Terbit\t : ");
                String terbit = sc.nextLine();
                System.out.print("Penerbit : ");
                String penerbit = sc.nextLine();
                BukuPutri b = new BukuPutri();
                buku.push(b = new BukuPutri(isbn, judul, terbit, penerbit));
            }
            if (pilih == 2) {
                buku.pop();
            }
            if (pilih == 3) {
                System.out.println("Buku{" + "isbn=" + (buku.get(buku.size() - 1).isbn) + ", " + "judul=" + (buku.get
        (buku.size() - 1).judul) + ", " + "Terbit=" + (buku.get(buku.size() - 1).terbit) + ", " + "Penerbit=" + 
                        (buku.get(buku.size() - 1).penerbit) + '}');
            }
            if (pilih == 4) {
                buku.stream().forEach(b -> {
                    System.out.println("Buku{" + "isbn=" + b.isbn + ", " + "judul=" + b.judul + ", " + "terbit=" + b.terbit + 
                            ", " + "penerbit=" + b.penerbit + '}');
                });
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
