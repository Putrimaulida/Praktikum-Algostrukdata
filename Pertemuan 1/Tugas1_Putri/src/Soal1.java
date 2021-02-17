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
public class Soal1 {
    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        long biaya = 4500;
        double total1, total2, total3, total4 , total;
        
        System.out.println("=============================");
        System.out.println("\tSmile Laundry");
        System.out.println("=============================");
        System.out.print("Masukkan berat kg pakaian bu Ani = ");
        int kgA = ap.nextInt();
        
        if(kgA>10){
            total1 = kgA*biaya*0.05;
            total1 = kgA*biaya-total1;
            System.out.println("Total biaya bu Ani = Rp " + total1);
        }else{
            total1 = kgA*biaya;
            System.out.println("Total biaya bu Ani = Rp " + total1);
        }
        
        System.out.print("Masukkan berat kg pakaian bu Budi = ");
        int kgBu = ap.nextInt();
        if(kgBu>10){
            total2 = kgBu*biaya*0.05;
            total2 = kgBu*biaya-total2;
            System.out.println("Total biaya bu Ani = Rp " + total2);
        }else{
            total2 = kgBu*biaya;
            System.out.println("Total biaya bu Ani = Rp " + total2);
        }
        
        System.out.print("Masukkan berat kg pakaian bu Bina = ");
        int kgBi = ap.nextInt();
        if(kgBi>10){
            total3 = kgBi*biaya*0.05;
            total3 = kgBi*biaya-total3;
            System.out.println("Total biaya bu Ani = Rp " + total3);
        }else{
            total3 = kgBi*biaya;
            System.out.println("Total biaya bu Ani = Rp " + total3);
        }
        
        System.out.print("Masukkan berat kg pakaian bu Cita = ");
        int kgC = ap.nextInt();
        if(kgC>10){
            total4 = kgC*biaya*0.05;
            total4 = kgC*biaya-total4;
            System.out.println("Total biaya bu Ani = Rp " + total4);
        }else{
            total4 = kgC*biaya;
            System.out.println("Total biaya bu Ani = Rp " + total4);
        }
        
        total = total1 + total2 + total3 + total4;
        System.out.println("===============================================");
        System.out.println("Total Pendapatan Smile laundry = Rp " + total);
    
    }
}
