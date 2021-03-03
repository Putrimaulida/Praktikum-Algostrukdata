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
public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    
    public Balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    int luasPermukaan(){
        return 2 * (panjang * lebar) + (panjang * tinggi) + (lebar * tinggi);
    }
    
    int hitungVolume(){
        return panjang * lebar * tinggi;
    }
}
