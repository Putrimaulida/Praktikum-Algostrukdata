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
public class Kubus {
    int sisi;
    
    public Kubus (int s){
        sisi = s;
    }
    
    int luasPermukaan (){
        return 6 * sisi * sisi;
    }
    
    int hitungVolume (){
        return sisi * sisi * sisi;
    }
}
