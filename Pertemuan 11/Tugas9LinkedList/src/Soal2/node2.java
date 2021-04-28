/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal2;

/**
 *
 * @author asus
 */
public class node2 {
    String data;
    node2 next;
    
    public node2(String huruf, node2 berikutnya){
        this.data = huruf;
        this.next = berikutnya;
    }
}
