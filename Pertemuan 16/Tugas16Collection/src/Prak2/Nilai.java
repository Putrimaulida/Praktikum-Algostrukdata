/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prak2;

/**
 *
 * @author asus
 */
public class Nilai {
    String kodenilai;
    String kodematakuliah;
    String nimmhs;
    Float nilai;

    public Nilai() {
    }

    Nilai(String kodenilai, float nilai, String kodematakuliah, String nimmhs) {
        this.kodenilai = kodenilai;
        this.nilai = nilai;
        this.kodematakuliah = kodematakuliah;
        this.nimmhs = nimmhs;
    }
}
