/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal5;

/**
 *
 * @author asus
 */
public class node5 {
    String norek, nama, alamat;
    node5 next;
    
    public node5(node5 berikutnya, String... a){
        this.next=berikutnya;
        this.norek=a[0];
        this.nama=a[1];
        this.alamat=a[2];
    }
}
