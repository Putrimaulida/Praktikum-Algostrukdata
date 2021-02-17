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
public class Soal3 {
    public static void main(String[] args) {
        Scanner de = new Scanner(System.in);
        int n;
        
        System.out.println("Menampilkan Bilangan Genap kecuali Kelipatan 4");
        System.out.print("Masukkan nilai N : ");
        n = de.nextInt();
       
        for (int i = 1 ; i <= n * 4; i++){
            if (i % 2 == 0){
                if (i % 4 > 1){
                    System.out.print( i + " ");
                }
            }
        }
        System.out.println();
    }
}
