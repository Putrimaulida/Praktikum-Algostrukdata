/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1;

/**
 *
 * @author asus
 */
public class Node1 {
    int data;
    Node1 prev, next;
    
    Node1(Node1 prev, int data, Node1 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
