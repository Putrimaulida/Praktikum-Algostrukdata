/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Prak.NomorSatu;

/**
 *
 * @author asus
 */
public class Lingkaran {
    public double phi = 3.14, r;
    
    Lingkaran(){
    }
    Lingkaran(double rr){
        r = rr;
    }
    double hitungKeliling(double r){
        return 2 * phi * r;
    }
    
    double hitungLuas(double r){
        return phi * r * r;
    }
}
