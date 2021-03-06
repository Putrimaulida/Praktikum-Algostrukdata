/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class DLL {
    Node head;
    int size;

    public DLL() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }
    
    //Memasukkan data posisi awal
    public void addFirst(String nim, String nama, double ipk) {
        if (isEmpty()) {
            head = new Node(null, nim, nama, ipk, null);
        } else {
            Node newNode = new Node(null, nim, nama, ipk, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    //Memasukkan data posisi akhir
    public void addLast(String nim, String nama, double ipk) {
        if (isEmpty()) {
            addFirst(nim, nama, ipk);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, nim, nama, ipk, null);
            current.next = newNode;
            size++;
        }
    }
    
    //Menambahkan data mahasiswa
    public void add(String nim, String nama, double ipk, int index) throws Exception {
        if (isEmpty()) {
            addFirst(nim, nama, ipk);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai Indeks Di Luar Batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, nim, nama, ipk, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, nim, nama, ipk, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    public int size() {
        return size;
    }
    
    //Mencetak seluruh data mahasiswa
    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("NIM: "+tmp.nim);
                System.out.println("Nama : "+tmp.nama);
                System.out.println("ipk : "+tmp.ipk);
                tmp = tmp.next;
            }
            System.out.println("semua data berhasil dicetak");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    
    //Menghapus data mahasiswa posisi awal
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    //Menghapus data mahasiswa posisi akhir
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    //Menghapus data index ke-
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai Indeks Di Luar Batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
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
    
    //Mencari data berdasarkan NIM
    public void search(String nim)throws Exception{
        int i=0;
        boolean flag=false;
        Node current=head;
        if(head==null){
            System.out.println("List masih kosong!");
            return;
        }
        while(current!=null){
            if(current.nim.equalsIgnoreCase(nim)){
                flag=true;
                break;
            }
            current=current.next;
            i++;
        }
        if(flag){
            System.out.println("Data "+nim+" berada di node ke-"+i);
            System.out.println("IDENTITAS :");
            System.out.println("NIM : "+current.nim);
            System.out.println("Nama : "+current.nama);
            System.out.println("ipk : "+current.ipk);
        } else{
            System.out.println("Data tidak ditemukan!");
        }
    }
    
    //Mengurutkan data mahasiswa dari IPK tertinggi
    public void selectionSort()throws Exception{
        Node current=null, idx=null;
        double tmp;
        if(head==null){
            return;
        } else{
            for(current=head; current.next!=null; current=current.next){
                for(idx=current.next; idx!=null; idx=idx.next){
                    if(current.ipk<idx.ipk){
                        tmp=current.ipk;
                        current.ipk=idx.ipk;
                        idx.ipk=tmp;
                    }
                }
            }
        }
        print();
    }
    public void pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, tidak dapat diambil!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
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
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
