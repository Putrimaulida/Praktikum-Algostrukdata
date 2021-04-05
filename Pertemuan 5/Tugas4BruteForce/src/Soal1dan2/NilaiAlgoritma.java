/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1dan2;

/**
 *
 * @author asus
 */
public class NilaiAlgoritma {
    public String namaMhs;
    public int nilaiTugas;
    public int nilaiKuis;
    public int nilaiUTS;
    public int nilaiUAS;
    
    public double hitungTotalNilai(){
        double total = ((nilaiTugas * 0.3) + (nilaiKuis * 0.2) + (nilaiUTS * 0.2) + (nilaiUAS * 0.3));
        return total;
    }
}
