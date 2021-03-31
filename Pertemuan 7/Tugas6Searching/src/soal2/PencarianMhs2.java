/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2;


/**
 *
 * @author asus
 */
public class PencarianMhs2 {
    public static int jmlMhs;
    public static Mahasiswa2 listMhs[];
    int idx;
    
    void jmlhMhs(int jumlah){
        jmlMhs = jumlah;
        listMhs = new Mahasiswa2[jmlMhs];
    }
    
    void tambah(Mahasiswa2 m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    
    void tampil(){
        for (Mahasiswa2 m : listMhs){
            m.tampil();
            System.out.println("---------------------");
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
}
