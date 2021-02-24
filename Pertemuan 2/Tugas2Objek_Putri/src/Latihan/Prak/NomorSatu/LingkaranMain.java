/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Prak.NomorSatu;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class LingkaranMain {
    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        
        Lingkaran L1 = new Lingkaran();
        L1.phi = 3.14;
        
        System.out.print("Masukkan (r) Lingkaran\t : ");
        L1.r = ap.nextInt();
        double rr = L1.r;
        
        Lingkaran L2 = new Lingkaran();
        L2.hitungKeliling(rr);
        
        Lingkaran L3 = new Lingkaran();
        L3.hitungLuas(rr);
        
        double Kel = L2.hitungKeliling(rr);
        double Luas = L3.hitungLuas(rr);
        
        System.out.println("Keliling Lingkaran\t : " + Kel);
        System.out.println("Luas Lingkaran\t\t : " + Luas);
    }
}
