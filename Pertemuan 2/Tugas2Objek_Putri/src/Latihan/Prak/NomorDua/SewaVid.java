/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Prak.NomorDua;

/**
 *
 * @author asus
 */
public class SewaVid {
    public int id, lamaPinjam, harga, hargaSewa; 
    public String namaMember, namaGame;
    
    int hitungHarga(){
      return 10000 * lamaPinjam;  
    }   
}
