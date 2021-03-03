/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class ModLuasTanahMain {
    public static void main(String[] args) {
      
        Scanner ap = new Scanner(System.in);
        System.out.print("Jumlah tanah : ");
        int n = ap.nextInt();
        System.out.println();
        ModLuasTanah[] modtnh = new ModLuasTanah[n];
         
        for (int x = 0; x < n; x++){
            modtnh[x] = new ModLuasTanah();
            System.out.println("Tanah " + (x+1));
            System.out.print("Panjang: ");
            modtnh[x].panjang = ap.nextInt();
            System.out.print("Lebar: ");
            modtnh[x].lebar = ap.nextInt();
        }
        
        System.out.println();
        for (int x = 0; x < n; x++){
            System.out.println("Luas Tanah " + (x+1) + " = " + modtnh[x].hitungLuasTanah());
        }
        
        System.out.println();
        ModLuasTanah terbesar = new ModLuasTanah();
        System.out.println("Tanah terluas : Tanah "+ terbesar.tanahTerluas(modtnh[0].hitungLuasTanah(), modtnh[1].hitungLuasTanah(), modtnh[2].hitungLuasTanah()));

    }
}
