/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal4;

/**
 *
 * @author asus
 */
public class PencarianArray1 {
    int idx;
    Array1 tg[];
    
    PencarianArray1(int x){
        this.tg = new Array1[x];
    }
    
    void tambah(Array1 t){
        if (idx < tg.length){
            tg[idx] = t;
            idx++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }
    
    void tampil(){
        for (Array1 m : tg){
            m.tampil();
        }
    }
    
    void selectionSort(){
        for (int i = 0; i < tg.length - 1; i++){
            int idxMin = i;
            for (int j = i + 1; j < tg.length; j++){
                if (tg[j].nilai > tg[idxMin].nilai){
                    idxMin = j;
                }
            }
            Array1 tmp = tg[idxMin];
            tg[idxMin] = tg[i];
            tg[i] = tmp;
        }
    }
    
    public void TampilIndex(int y, int in){
        if (in != -1){
            System.out.println("Data " + y + " ditemukan pada index ke " + in);
        } else {
            System.out.println("Data " + y + " tidak ditemukan");
        }
    }
    
    public void TampilData(int y, int in){
        if (in != -1){
            System.out.println("Nilai " + y + tg[in].nilai);
        } else {
            System.out.println("Data " + y + " tidak ditemukan");
        }
    }
    
    public int BinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right) / 2;
                if (cari == tg[mid].nilai){
                    if (cari == tg[mid].nilai){
                        TampilIndex(cari, mid);
                        TampilData(cari, mid);
                        return mid;
                    }
                    if (cari == tg[left].nilai || cari == tg[right].nilai){
                        if (cari == tg[left].nilai){
                            TampilIndex(cari, left);
                            TampilData(cari, left);
                            System.out.println("Kiri basecase");
                        }
                        if (cari == tg[right].nilai){
                            TampilIndex(cari, tg[right].nilai);
                            TampilData(cari, right);
                            System.out.println("Kanan basecase");
                        }
                    }
            } else if (tg[mid].nilai < cari){
                if (cari == tg[left].nilai || cari == tg[right].nilai){
                    if (cari == tg[left].nilai){
                        TampilIndex(cari, left);
                        TampilData(cari, left);
                        return BinarySearch(cari, left, mid - 1);
                    } else {
                        TampilIndex(cari, right);
                        TampilData(cari, right);
                        return BinarySearch(cari, left, mid - 1) ;
                    }
                }
                return BinarySearch(cari, left, mid - 1) ;
            } else {
                if (cari == tg[left].nilai || cari == tg[right].nilai){
                    if (cari == tg[left].nilai){
                        TampilIndex(cari, left);
                        TampilData(cari, left);
                        return BinarySearch(cari, mid + 1, right);
                    } else {
                        TampilIndex(cari, right);
                        TampilData(cari, right);
                        return BinarySearch(cari, mid + 1, right);
                    }
                }
                return BinarySearch(cari, mid + 1, right);
            }
        }
        
        return - 1;
    }
}
