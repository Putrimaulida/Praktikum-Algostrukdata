/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class LinkedListTransaksi {
    TransaksiList head;
    TransaksiList tail;
    int size = 0;
    int tempHarga = 0;
    String tempNama = "";

    public boolean isEmpty() {
        return head == null;
    }

    public boolean checkStock(int kodeBarang, int jmlhBeli, Barang[] barangs) {
        boolean kondisi = true;
        if (jmlhBeli < 1) {
            kondisi = false;
        } else {
            for (int i = 0; i < barangs.length; i++) {
                if (barangs[i].kode == kodeBarang) {
                    int stock = barangs[i].getStock();
                    if (jmlhBeli > stock) {
                        kondisi = false;
                        break;
                    }
                }
            }
        }
        return kondisi;
    }

    public void minStock(int kodeBarang, int jmlBeli, Barang[] barangs) {
        for (int i = 0; i < barangs.length; i++) {
            if (barangs[i].kode == kodeBarang) {
                barangs[i].minStock(jmlBeli);
                break;
            }
        }
    }

    public boolean checkKodeBarang(int kodeBarang, Barang[] barangs) {
        if (kodeBarang < 1) {
            return false;
        } else if (kodeBarang > barangs.length) {
            return false;
        } else {
            return true;
        }
    }

    public void getAtributBarang(int kodeBarang, Barang[] barangs) {
        for (int i = 0; i < barangs.length; i++) {
            if (barangs[i].kode == kodeBarang) {
                tempHarga = barangs[i].getHarga();
                tempNama = barangs[i].getNama();
            }
        }
    }

    public void add(int kodeBarang, int jumlah, Barang[] barangs, char inputMember) {
        //if kode barang found
        if (checkKodeBarang(kodeBarang, barangs)) {
            //if not greater than stock
            if (checkStock(kodeBarang, jumlah, barangs)) {
                getAtributBarang(kodeBarang, barangs);
                int hartot = tempHarga * jumlah;

                //disc 5% -> payment > 500k
                if (hartot > 500000) {
                    hartot -= (hartot * 5 / 100);
                }
                //if user is member
                if (inputMember == 'Y' || inputMember == 'y') {
                    hartot -= (hartot * 2 / 100);
                }

                Transaksi transaksi = new Transaksi(kodeBarang, tempNama, tempHarga, jumlah, tempHarga, hartot);
                TransaksiList nodeInput = new TransaksiList(++size, transaksi, null);
                minStock(kodeBarang, jumlah, barangs);
                if (isEmpty()) {
                    head = nodeInput;
                    tail = nodeInput;
                } else {
                    tail.next = nodeInput;
                    tail = nodeInput;
                }
            } else {
                System.out.println("Out of stock!");
            }
        } else {
            System.out.println("Kode Barang Tidak Ditemukan!!");
        }
    }

    public void print() {
        TransaksiList tmp = head;
        while (tmp != null) {
            System.out.println("Kode Transaksi: " + tmp.kodeTransaksi +
                    ", nama barang: " + tmp.transaksi.namaBarang +
                    ", harga satuan: " + tmp.transaksi.hargaSatuan +
                    ", jumlah barang: " + tmp.transaksi.jumlahBarang +
                    ", harga total: " + tmp.transaksi.hargaTotal +
                    ", bayar: " + tmp.transaksi.bayar);
            tmp = tmp.next;
        }
    }
}
