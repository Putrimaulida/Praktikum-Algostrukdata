/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3;

/**
 *
 * @author asus
 */
public class ModLuasTanah {
    public int panjang;
    public int lebar;
    public int jumlahTanah;

    int hitungLuasTanah(){
        return panjang * lebar;
    }
    
    int tanahTerluas(int a, int b, int c){
        if (a > b && a > c){
            return 1;
        } else if (b > a && b > c){
            return 2;
        } else {
            return 3;
        }
    }
}
