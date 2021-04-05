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
public class pilketumBEMMain {
    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        pilketumBEM byk = new pilketumBEM();
        int kandidat[] = new int [6];
        String calon = "";
        System.out.println("PEMILIHAN KETUA UMUM BEM");
        System.out.println("Kandidat : ");
        System.out.println("1. Bisma");
        System.out.println("2. Dian");
        System.out.println("3. Haris");
        System.out.println("4. Rani\n");
        for (int i = 0; i < 5; i++){
            System.out.print("Pilih salah satu kandidat (1-4) : ");
            kandidat[i] = ap.nextInt();
        }
        
        int suara = byk.ketuaBEM(kandidat, 0, 5);
        if (suara == 1){
            calon = "Bisma";
        } else if (suara == 2){
            calon = "Dian";
        } else if (suara == 3){
            calon = "Haris";
        } else if(suara == 4){
            calon = "Rani";
        } else {
            calon = "Angka yang anda masukkan salah!";
        }  
        System.out.println(">> Mayoritas suara memilih " + calon + " dengan nomor " + suara);
    }
}
