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
public class StrukMain {
    public static void main(String[] args) {
        
        Struk str = new Struk(8);
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        for(int i = 0; i < 8; i++){
            System.out.println("------------------------------");
            System.out.print("Nomor Transaksi   : ");
            String nt = sc.nextLine();
            System.out.print("Tanggal Pembelian : ");
            String tp = sc.nextLine();
            System.out.print("Jumlah Barang     : ");
            int jb = sc1.nextInt();
            System.out.print("Total Bayar       : ");
            int byr = sc1.nextInt();
            Struk st = new Struk(nt, tp, jb, byr);
            str.push(st);
        }
        str.print();
        for (int i = 0; i < 5; i++){
            str.pop();
        }
    }
}
