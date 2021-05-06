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
public class Node4 {
    String nim, nama;
    double ipk;
    Node4 prev, next;

    Node4(Node4 prev, String nim, String nama, double ipk, Node4 next) {
        this.prev = prev;
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.next = next;
    }
}
