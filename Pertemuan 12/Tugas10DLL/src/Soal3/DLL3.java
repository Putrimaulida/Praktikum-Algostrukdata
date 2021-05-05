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
public class DLL3 {
    Node3 head;
    int size;

    public DLL3() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nomorP, String namaP) {
        if (isEmpty()) {
            head = new Node3(null, nomorP, namaP, null);
        } else {
            Node3 newNode = new Node3(null, nomorP, namaP, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String nomorP, String namaP) {
        if (isEmpty()) {
            addFirst(nomorP, namaP);
        } else {
            Node3 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node3 newNode = new Node3(current, nomorP, namaP, null);
            current.next = newNode;
            size++;
        }
    }
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            System.out.println(head.namaP+" telah selesai divaksinasi.");
            removeLast();            
        } else {
            System.out.println(head.namaP+" telah selesai divaksinasi.");
            head = head.next;
            head.prev = null;
            size--;            
        }
        print();
    }
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node3 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public int size() {
        return size;
    }
    public void print() {
        if (!isEmpty()) {
            Node3 tmp = head;
            while (tmp != null) {
                System.out.println(tmp.nomorP +" "+tmp.namaP+ "\t");
                tmp = tmp.next;                
            }
            System.out.println("\nsisa antrian : "+size());            
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
}
