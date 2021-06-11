/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author asus
 */
public class Tugas2Node {
    int data;
    Tugas2Node prev, next;
    
    public Tugas2Node(Tugas2Node prev, int data, Tugas2Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
