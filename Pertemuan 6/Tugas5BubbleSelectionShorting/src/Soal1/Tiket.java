/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1;

/**
 *
 * @author asus
 */
public class Tiket {
    public String maskapai, asal, tujuan;
    public int harga;
    
    Tiket (String m, String a, String t, int h){
        maskapai = m;
        asal = a;
        tujuan = t;
        harga = h;
    }
    
    void tampilTiket(){
        System.out.println("Maskapai = " + maskapai);
        System.out.println("Asal     = " + asal);
        System.out.println("Tujuan   = " + tujuan);
        System.out.println("Harga    = Rp. " + harga);
    }
}
