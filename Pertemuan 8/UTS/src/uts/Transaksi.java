/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author asus
 */
public class Transaksi {
    public double saldo;
    public double saldoAwal;
    public double saldoAkhir;
    public String tanggalTransaksi;
    public String type;
    public String noRekening;
    
    void Transakasi (double a, double b, double c, String d, String e){
        saldo = a;
        saldoAwal = b;
        saldoAkhir = c;
        tanggalTransaksi = d;
        type = e;
    } 
    
    void dataTransaksi(){
        System.out.println("|\t" + noRekening + "\t|\t" + saldo + "\t|\t" + saldoAwal + "\t|\t" + saldoAkhir + "\t|\t" + tanggalTransaksi + "\t|");
    }
}
