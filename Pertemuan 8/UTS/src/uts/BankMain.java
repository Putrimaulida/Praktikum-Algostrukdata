/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class BankMain {
    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        System.out.println("UTS");
        System.out.println("1. Tampil data rekening");
        System.out.println("2. Tampil data transaksi");
        System.out.println("3. Mencari saldo > 500000");
        System.out.println("4. Sorting by name");
        System.out.println("5. Keluar");
        System.out.println("Pilih (1-5) : ");
        int pilih = ap.nextInt();
        
        
        Rekening r1 = new Rekening(160309273084,"bin Abdul Salam","Aruffin","14582643263","ligula.Nullam@tacitisociosqu.edu", "898214,494048,3587","2021-03-09 07:54:42");
        switch(pilih){
        case 1:
            dataRekening();
            break;
        case 2:
            dataTransaksi();
            break;
        case 3:
            break;
        case 4:
            break;
        case 5:
            System.exit(0);
            
    }
    }

    private static void dataRekening() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void dataTransaksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
