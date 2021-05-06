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
public class Node2 {
    String data;
    Node2 prev, next;
    
    Node2(Node2 prev, String data, Node2 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
