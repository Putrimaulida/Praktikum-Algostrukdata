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
public class Bola {
    double phi, jari;
    
    public Bola (double phii, double rr){
        phi = phii;
        jari = rr;
    }
    
    double luasPermukaan(){
        return 4 * phi * jari * jari;
    }
    
    double hitungVolume(){
        return 4/3 * phi * jari * jari * jari;
    }
}
