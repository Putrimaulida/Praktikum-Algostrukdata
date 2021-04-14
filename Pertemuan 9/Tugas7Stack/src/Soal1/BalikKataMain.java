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
public class BalikKataMain {
    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        String P, Q;
        System.out.print("Masukkan kalimat : ");
        Q = ap.nextLine();
        
        int total = Q.length();
        BalikKata bk = new BalikKata(total);
        P = bk.membalikkan(Q);
    }
}
