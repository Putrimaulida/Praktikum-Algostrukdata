/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author asus
 */
public class Tugas1Node {
    int data;
    Tugas1Node prev, next;

    public Tugas1Node(Tugas1Node prev, int data, Tugas1Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
