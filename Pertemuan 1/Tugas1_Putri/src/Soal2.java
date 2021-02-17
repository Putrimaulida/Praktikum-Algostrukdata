
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
public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int simpan, jumlah;
        
        System.out.println("Menghitung Bulan");
        System.out.print("Masukkan jumlah simpanan : Rp ");
        simpan = sc.nextInt();
        System.out.println();
        System.out.println("Menghitung Saldo");
        int i = 1;
        while (true){
            int bunga = simpan * 2/100;
            jumlah = simpan + (bunga*i);
            if (jumlah > 1500000)
                break;
            System.out.println("Saldo bulan ke-" + i + " : Rp " + jumlah);
            i++;
        }
    }
}
