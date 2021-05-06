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
public class DLL2 {
    Node2 head;
    int size;

    public DLL2() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String item) {
        if (isEmpty()) {
            head = new Node2(null, item, null);
        } else {
            Node2 newNode = new Node2(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node2 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node2 newNode = new Node2(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void print() {
        if (!isEmpty()) {
            Node2 tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }    
    public void pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, tidak dapat diambil!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node2 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }    
    public String peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        Node2 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }    
}
