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
public class TiketService {
    Tiket tikets[] = new Tiket[5];
    int indx;
    
    //Method tambah
    void tambah(Tiket t){
        if (indx < tikets.length){
            tikets[indx] = t;
            indx++;
        } else {
            System.out.println("Data sudah penuh !");
        }
    }
    
    //Method tampilA11
    void tampilA11(){
        for (Tiket t : tikets){
            t.tampilTiket();
            System.out.println("--------------------");
        }
    }
    
    //Method Bubble Sort
    void bubbleSort(){
        for (int i = 0; i < tikets.length; i++){
            for (int j = 0; j < tikets.length - 1; j++){
                if (tikets[j].harga > tikets[j + 1].harga){
                    Tiket temp = tikets[j + 1];
                    tikets[j + 1] = tikets[j];
                    tikets[j] = temp;
                }
            }
        }
    }
    
    //Method selectionSort
    void selectionSort(){
        for (int i = 0; i < tikets.length; i++){
            int idxMin = i;
            for (int j = i + 1; j < tikets.length - 1; j++){
                if (tikets[j].harga < tikets[idxMin].harga){
                    idxMin = j;
                }
            }
            //swap
            Tiket tmp = tikets[idxMin];
            tikets[idxMin] = tikets[i];
            tikets[i] = tmp;
        }
    }
}
