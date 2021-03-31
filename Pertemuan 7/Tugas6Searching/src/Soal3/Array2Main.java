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
public class Array2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Baris : ");
        int x = sc.nextInt();
        System.out.print("Masukkan jumlah Kolom : ");
        int y = sc.nextInt();
        int nilai[][] =  new int[x][y];
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                System.out.println("Masukkan nilai pada Array ["+i+"]["+j+"] : ");
                nilai[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
        Array2 arr = new Array2(nilai,x,y);
        System.out.println("Tampilan nilai array : ");
        arr.tampilData();
        System.out.print("Masukkan nilai yang ingin dicari : ");
        int cari = sc.nextInt();
        int posisi = arr.find(cari);
        if (posisi == -1){
            System.out.println("Maaf, data tidak ditemukan !!");
        }
    }
}
