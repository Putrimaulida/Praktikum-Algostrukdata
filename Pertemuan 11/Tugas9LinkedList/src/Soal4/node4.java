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
public class node4 {
    String norek, nama, alamat;
    node4 next;
    
    public node4(node4 berikutnya, String... a){
        this.next=berikutnya;
        this.norek=a[0];
        this.nama=a[1];
        this.alamat=a[2];
    }
}
