/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prak3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author asus
 */
public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();
    
    public void tambah(Mahasiswa... mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    
    public void hapus(int index){
        mahasiswas.remove(index);
    }
    
    public void update(int index, Mahasiswa mhs){
        mahasiswas.set(index, mhs);
    }
    
    public void tampil(){
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }
    
    int linierSearch(String nim){
        for (int i = 0; i < mahasiswas.size(); i++){
            if (nim.equals(mahasiswas.get(i).nim)){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021zz1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
        // menambah objek manusia
        lm.tambah(m, m1, m2);
        // menampikan list mahasiswa
        lm.tampil();
        // update mahasiswa
        lm.update(lm.linierSearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
    
}
