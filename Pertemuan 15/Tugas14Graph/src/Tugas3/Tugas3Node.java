/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author asus
 */
public class Tugas3Node {
    int data;
    Tugas3Node prev, next;
    
    public Tugas3Node(Tugas3Node prev, int data, Tugas3Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
