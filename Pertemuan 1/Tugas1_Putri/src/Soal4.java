import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Soal4 {
    static double luasLingkaran(double r){
        double L = 3.14 * r * r;
        return L;
    }
    
    static double luasPP(double p, double l){
        double luas = p * l;
        return luas;
    }
    
    static double luasSegiTiga(double alas, double tinggi){
        double l = (alas * tinggi) / 2;
        return l;
    }
    
     public static void main(String[] args) {
        Scanner de = new Scanner(System.in);
        System.out.println("---------------------------------------------------------");
        System.out.println("|\t\t\t MENU UTAMA \t\t\t|");
        System.out.println("---------------------------------------------------------");
        System.out.println("1. Luas Segitiga ");
        System.out.println("2. Luas Persegi Panjang");
        System.out.println("3. Luas Lingkaran");
        System.out.print("Pilih Menu (1-3)\t: ");
        int menu = de.nextInt();
        
        switch(menu){
            case 1 -> {
                System.out.println("========================");
                System.out.println("Menghitung Luas Segitiga");
                System.out.println("========================");
                System.out.print("Masukkan Alas\t : ");
                double a = de.nextInt();
                System.out.print("Masukkan Tinggi\t : ");
                double t = de.nextInt();
                System.out.println("Luas Segitiga\t : " + luasSegiTiga(a,t));
            }
            case 2 -> {
                System.out.println("===============================");
                System.out.println("Menghitung Luas Persegi Panjang");
                System.out.println("===============================");
                System.out.print("Masukkan Panjang\t : ");
                double p = de.nextInt();
                System.out.print("Masukkan Lebar\t\t : ");
                double l = de.nextInt();
                System.out.println("Luas Persegi Panjang : " + luasPP(p,l));
            }
            case 3 -> {
                System.out.println("=========================");
                System.out.println("Menghitung Luas Lingkaran");
                System.out.println("=========================");
                System.out.print("Masukkan jari-jari (r)\t : ");
                double r = de.nextInt();
                System.out.println("Luas Lingkaran\t : " + luasLingkaran(r));
            }
            default -> System.out.println("ERROT!");
            }
        }
    }
    
     