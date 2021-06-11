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
public class Tugas4LinkedList<T> {
    //mendeklarasikan atribut
    Tugas4Node<T> head;
    int size;

    //membuat konstruktor
    public Tugas4LinkedList(){
        head = null;
        size = 0;
    }

    //method isEmpty untuk memastikan kondisi linked list kosong
    public boolean isEmpty(){
        return head == null;
    }

    //method addFirst untuk penambahan data di bagian depan linked list
    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Tugas4Node(null, item, null);
        } else {
            Tugas4Node newNode = new Tugas4Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    //method addLast() untuk penambahan data di bagian belakang linked list
    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Tugas4Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Tugas4Node newNode = new Tugas4Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    //method add untuk menambahkan data pada posisi yang telah ditentukan dengan indeks
    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai Indeks di luar batas");
        } else {
            Tugas4Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Tugas4Node newNode = new Tugas4Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Tugas4Node newNode = new Tugas4Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    //method size untuk mendapatkan nilai dari size
    public int size() {
        return size;
    }

    //method clear untuk menghapus semua isi linked list
    public void clear() {
        head = null;
        size = 0;
    }

    //method print untuk mencetak isi linked list
    public void print() {
        if (!isEmpty()) {
            Tugas4Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    //method removeFirst untuk menghapus data di bagian depan
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masing kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    //method removeLast untuk menghapus data di bagian belakang
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Tugas4Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    //method remove untuk menghapus data
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Tugas4Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    //method getFirst untuk mendapatkan data pada awal linked list
    public T getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    //method getLast untuk mendapat data pada akhir linked list
    public T getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Tugas4Node<T> tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    //method get(int index) untuk mendapatkan data pada indeks tertentu
    public T get(int index) throws Exception {
        if (isEmpty() ||  index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Tugas4Node<T> tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
