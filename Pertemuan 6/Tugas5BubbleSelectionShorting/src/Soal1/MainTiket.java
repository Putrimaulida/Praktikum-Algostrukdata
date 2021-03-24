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
public class MainTiket {
    public static void main(String[] args) {
        TiketService list = new TiketService();
        Tiket t1 = new Tiket("Garuda Indonesia", "Surabaya", "Jakarta", 2808400);
        Tiket t2 = new Tiket("Citilink Airlines", "Surabaya", "Kota Denpasar", 499790);
        Tiket t3 = new Tiket("Air Asia", "Surabaya", "Lombok", 373193);
        Tiket t4 = new Tiket("Wings Air", "Semarang", "Lombok", 1068100);
        Tiket t5 = new Tiket("Lion Air", "Surabaya", "Tarakan", 843000);
        
        list.tambah(t1);
        list.tambah(t2);
        list.tambah(t3);
        list.tambah(t4);
        list.tambah(t5);
        
        System.out.println("=============================");
        System.out.println("Data Maskapai sebelum sorting");
        System.out.println("=============================");
        list.tampilA11();
        
        System.out.println("==============================================================");
        System.out.println("Data Maskapai setelah asc berdasarkan harga dengan Bubble Sort");
        System.out.println("==============================================================");
        list.bubbleSort();
        list.tampilA11();
        
        System.out.println("=========================================================================");
        System.out.println("Data Maskapai setelah sorting asc berdasarkan harga dengan Selection Sort");
        System.out.println("=========================================================================");
        list.bubbleSort();
        list.tampilA11();
    }
}
