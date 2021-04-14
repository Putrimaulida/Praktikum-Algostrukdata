/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal2;

/**
 *
 * @author asus
 */
public class Struk {
    String noTransaksi, tglPembelian;
    int jmlBarang, totalBayar;
    int size;
    int top;
    Struk struk[];
    
    Struk(String nt, String tp, int jb, int tb){
        noTransaksi = nt;
        tglPembelian = tp;
        jmlBarang = jb;
        totalBayar = tb;
    }
    
    public Struk(int size){
        this.size = size;
        struk = new Struk[size];
        top = -1;
    }
    
    public boolean IsEmpty(){
        return top == -1;
    }
    
    public boolean IsFull(){
        return top == size - 1;
    }
    
    public void push(Struk str){
        if (!IsFull()){
            top++;
            struk[top] = str;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }
    
    public void pop(){
        if (!IsEmpty()){
            Struk x = struk[top];
            top--;
            System.out.println("");
            System.out.println(">> Struk yang diambil << ");
            System.out.println("-------------------------------------");
            System.out.println("           MARKET LARIZZZZ           ");
            System.out.println("-------------------------------------");
            System.out.println("Nomor Transaksi   : " + x.noTransaksi);
            System.out.println("Tanggal Pembelian : " + x.tglPembelian);
            System.out.println("Jumlah Barang     : " + x.jmlBarang);
            System.out.println("Total Bayar       : " + x.totalBayar);
            System.out.println("-------------------------------------");
            System.out.println("");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    
    public void print(){
        System.out.println(">> Isi struk dalam laci <<");
        for (int i = top; i >= 0; i--){
            System.out.println("-------------------------------------");
            System.out.println("           MARKET LARIZZZZ           ");
            System.out.println("-------------------------------------");
            System.out.println("Nomor Transakasi  : " + struk[i].noTransaksi);
            System.out.println("Tanggal Pembelian : " + struk[i].tglPembelian);
            System.out.println("Jumlah Barang     : " + struk[i].jmlBarang);
            System.out.println("Total Bayar       : " + struk[i].totalBayar);
            System.out.println("-------------------------------------");
            System.out.println("");
        } 
        System.out.println("");       
    }
}
