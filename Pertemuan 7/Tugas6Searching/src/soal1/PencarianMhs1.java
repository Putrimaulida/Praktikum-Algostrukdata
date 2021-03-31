/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal1;

/**
 *
 * @author asus
 */
public class PencarianMhs1 {
    Mahasiswa1 listMhs[] = new Mahasiswa1[5];
    int idx;
    void tambah(Mahasiswa1 m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    
    void tampil(){
        for (Mahasiswa1 m : listMhs){
            m.tampil();
            System.out.println("---------------------");
        }
    }
    
    //tambahan modifikasi bubblesort
    void bubbleSort(){
        for (int i = 0; i < listMhs.length - 1; i++){
            for (int j = 1; j < listMhs.length - i; j++){
                if (listMhs[j].nim > listMhs[j - 1].nim){
                    
                    Mahasiswa1 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }
    
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0 ; j < listMhs.length; j++){
            if (listMhs[j].nim==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    public void TampilPosisi(int a, int pos){
        if (pos!=-1){
            System.out.println("data : " + a + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data : " + a + " tidak ditemukan! ");
        }
    }
    
    public void TampilData(int a, int pos){
        if (pos!=-1){
            System.out.println("Nim\t : " + a);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        }
    }
    
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right) / 2;
            if (cari == listMhs[mid].nim){
                return (mid);
            } else if (listMhs[mid].nim < cari){
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
