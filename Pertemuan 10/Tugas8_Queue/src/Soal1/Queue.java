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
public class Queue {
    public int max;
    public int size;
    public int front;
    public int rear;
    public int[] Q;
    
    public Queue(int n){
        max = n;
        Create();
    }
    
    public void Create(){
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean IsEmpty(){
        if (size == 0){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean IsFull(){
        if (size == max){
            return true;
        } else {
            return false;
        }
    }
    
    public void peek(){
        if (!IsEmpty()){
            System.out.println("Elemen terdepan : " +Q[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void print(){
        if (!IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear){
                System.out.println(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println( Q[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }
    
    public void clear(){
        if (!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void Enqueue(int data){
        if (IsFull()){
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()){
                front = rear = 0;
            } else {
                if (rear == max - 1){
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }
    
    public int Dequeue(){
        int data = 0;
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()){
               front = rear = -1;
            } else {
               if (front == max - 1){
                   front = 0;
                } else {
                   front++;
                }
            }
        }
        return data;
    }
    
    public void peekPosition(int data){
        if (!IsEmpty()){
            for (int i = 0; i < Q.length; i++){
                if (data == Q[i]){
                    System.out.println("Elemen : " + Q[i] + " berada pada indeks ke-" + i);
                }
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void peekAt(int position){
        if (!IsEmpty()){
            for (int i = 0; i < Q.length; i++){
                if (position == i){
                    System.out.println("Indeks : " + i + " memiliki isi data " + Q[i]);
                }
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}
