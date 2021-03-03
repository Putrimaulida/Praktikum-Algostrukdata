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
public class LuasTanahMain {
    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        System.out.print("Jumlah tanah : ");
        int n = ap.nextInt();
        System.out.println();
        LuasTanah[] tnh = new LuasTanah[n];
         
        for (int x = 0; x < n; x++){
            tnh[x] = new LuasTanah();
            System.out.println("Tanah " + (x+1));
            System.out.print("Panjang: ");
            tnh[x].panjang = ap.nextInt();
            System.out.print("Lebar: ");
            tnh[x].lebar = ap.nextInt();
        }
        System.out.println();
        for (int x = 0; x < n; x++){
            System.out.println("Luas Tanah " + (x+1) + " = " + tnh[x].hitungLuasTanah());
        }
    }
}
