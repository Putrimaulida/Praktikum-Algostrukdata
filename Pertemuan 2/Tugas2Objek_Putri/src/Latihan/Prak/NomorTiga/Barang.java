
package Latihan.Prak.NomorTiga;
import java.util.Scanner;
public class Barang {
    public static Scanner ap = new Scanner(System.in);
    public static String nama, ulang;
    public static int hargaSatuan, jumlah;
    
    int hitungHargaTotal(){
       return hargaSatuan * jumlah;
    }
    
    int hitungDiskon(){
        int harga = hitungHargaTotal();
        if (harga > 100000){
            System.out.println("<< DISKON 10% >>");
            return  (int) (harga * 0.1);
        } else if (harga > 50000){
            System.out.println("<< DISKON 5% >>");
            return (int) (harga * 0.05);
        } else {
            System.out.println("Tidak mendapatkan Diskon");
            return harga * 0;
        }
    }
    
    int hitungHargaBayar(){
        return hitungHargaTotal() - hitungDiskon();
    }
}
