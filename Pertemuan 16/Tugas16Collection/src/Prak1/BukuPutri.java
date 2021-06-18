/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prak1;

/**
 *
 * @author asus
 */
public class BukuPutri {
    
    String isbn;
    String judul;
    String terbit;
    String penerbit;

    public BukuPutri() {
    }

    public BukuPutri(String isbn, String judul, String terbit, String penerbit) {
        this.isbn = isbn;
        this.judul = judul;
        this.terbit = terbit;
        this.penerbit = penerbit;
    }

    @Override
    public String toString(){
            return "Buku{" + "isbn=" + isbn + ", judul=" + judul + ", terbit=" + terbit + ", penerbit=" + penerbit + '}';
    }
}
