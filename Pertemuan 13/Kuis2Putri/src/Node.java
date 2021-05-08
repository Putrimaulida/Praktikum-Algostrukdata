/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Node {
    String nim, nama;
    double ipk;
    Node prev, next;
    String data;

    Node(Node prev, String nim, String nama, double ipk, Node next) {
        this.prev = prev;
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.next = next;
    }   
}

