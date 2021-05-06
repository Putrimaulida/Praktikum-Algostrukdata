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
public class Node3 {
    
    String namaP, nomorP;
    Node3 prev, next;

    Node3(Node3 prev, String nomorP, String namaP, Node3 next) {
        this.prev = prev;
        this.nomorP = nomorP;
        this.namaP = namaP; 
        this.next = next;
    }
}
