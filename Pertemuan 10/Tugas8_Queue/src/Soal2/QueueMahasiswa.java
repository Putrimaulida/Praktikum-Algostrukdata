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
public class QueueMahasiswa {
    public int max, size, front, rear;
    public Mahasiswa[] antrian;

    public QueueMahasiswa(int n) {
        max = n;
        Create();
    }

    public void Create() {
        antrian = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(Mahasiswa data) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = data;
            size++;
        }
    }

    public Mahasiswa Dequeue() {
        Mahasiswa data = new Mahasiswa("", "", 0, 0);
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            data = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(antrian[i].nim + " " + antrian[i].nama
                    + " " + antrian[i].absen + " " + antrian[i].ipk);
                i = (i + 1) % max;
                System.out.println("");
            }
            System.out.println(antrian[i].nim + " " + antrian[i].nama
                    + " " + antrian[i].absen + " " + antrian[i].ipk);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan : " + antrian[front].nim + " " + antrian[front].nama
                    + " " + antrian[front].absen + " " + antrian[front].ipk);
        } else {
            System.out.println("Queue masih kosong!");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian paling belakang : " + antrian[rear].nim + " " + antrian[rear].nama
                    + " " + antrian[rear].absen + " " + antrian[rear].ipk);
        } else {
            System.out.println("Queue masih kosong!");
        }
    }

    public void peekPosition(String data) {
        if (!isEmpty()) {
            for (int i = 0; i < (front+size); i++) {
                if (antrian[i].nim.equals(data)) {
                    System.out.println("Mahasiswa dengan NIM " + data + " berada pada antrian indeks ke-" + i);
                    break;
                }
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void printMahasiswa(int posisi) {
        if (!isEmpty()) {
            for (int i = 0; i < antrian.length; i++) {
                if (posisi == i) {
                    System.out.println(antrian[i].nim + " " + antrian[i].nama
                            + " " + antrian[i].absen + " " + antrian[i].ipk);
                }
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}
