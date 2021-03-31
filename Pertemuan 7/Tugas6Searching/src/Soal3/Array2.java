/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3;

/**
 *
 * @author asus
 */
public class Array2 {
    public int[][] nilai;
    public int jumNilai1;
    public int jumNilai2;
    public Array2(int n[][], int jmlNilai1, int jmlNilai2){
        jumNilai1 = jmlNilai1;
        jumNilai2 = jmlNilai2;
        nilai = new int[jumNilai1][jumNilai2];
        for (int i = 0; i < jumNilai1; i++){
            System.arraycopy(n[i], 0, nilai[i], 0, jumNilai2);
        }
    }
    
    public int find(int cari){
        int posisi = -1;
        int posisi1 = 0;
        for (int i = 0; i < jumNilai1; i++){
            for (int j = 0; j < jumNilai2; j++){
                if (nilai[i][j] == cari){
                    posisi1 = 1;
                    posisi = j;
                    System.out.println("Nilai : " + cari + " ada pada Baris ke " + posisi1 + "Kolom ke " + posisi);
                    break;
                }
            }
        }
        return posisi;
    }
    
    public void tampilData(){
        for (int i = 0; i < jumNilai1; i++){
            for (int j = 0; j < jumNilai2; j++){
                System.out.println(nilai[j][j]);
            }
            System.out.println(" ");
        }
    }
}
