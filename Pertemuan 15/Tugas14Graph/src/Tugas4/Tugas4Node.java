/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author asus
 * @param <T>
 */
public class Tugas4Node <T> {
    T data;
    Tugas4Node<T> prev;
    Tugas4Node<T> next;

    public Tugas4Node(Tugas4Node<T> prev, T nilai, Tugas4Node<T> next){
        this.prev = prev;
        this.data = nilai;
        this.next = next;
    }
}
