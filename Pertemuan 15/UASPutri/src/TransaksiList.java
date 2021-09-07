/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class TransaksiList {
    int kodeTransaksi;
    Transaksi transaksi;
    TransaksiList next;

    public TransaksiList(int kode, Transaksi transaksi, TransaksiList next) {
        this.kodeTransaksi = kode;
        this.transaksi = transaksi;
        this.next = next;
    }
}
