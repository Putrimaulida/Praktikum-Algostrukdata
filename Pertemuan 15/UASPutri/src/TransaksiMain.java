
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class TransaksiMain {
    static Barang[] barangs = new Barang[6];

    static void setDataBarang() {
        barangs[0] = new Barang(1, "Kulkas", 612000, 5);
        barangs[1] = new Barang(2, "Kompor", 1300000, 7);
        barangs[2] = new Barang(3, "Kipas Angin", 350000, 15);
        barangs[3] = new Barang(4, "Magicom", 600000, 12);
        barangs[4] = new Barang(5, "Televisi", 800000, 14);
        barangs[5] = new Barang(6, "AC", 1800000, 4);
    }

    static void printBarang() {
        System.out.println("===================================================");
        System.out.printf("%-3s %-20s %-8s %-3s\n", "No", "Nama Barang", "Harga", "Stock");
        for (Barang barang:
             barangs) {
            System.out.printf("%-3d %-20s %-8d %-3d\n", barang.kode, barang.nama, barang.harga, barang.stok);
        }
        System.out.println("===================================================");
    }

    static void mainMenu() {
        System.out.print("1. Input Transaksi\n" +
                "2. Print Transaksi\n" +
                "> ");
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //set data barang statis
        setDataBarang();

        LinkedListTransaksi ll = new LinkedListTransaksi();

        int input;
        do {
            //show barang
            mainMenu();
            input = userInput.nextInt();

            switch (input) {
                case 1:
                    printBarang();
                    System.out.print("Input kode barang: ");
                    int kodeBarang = userInput.nextInt();
                    System.out.print("Input jumlah barang: ");
                    int jumlahBeli = userInput.nextInt();
                    System.out.print("Apakah member?[Y/G] ");
                    char inputMember = userInput.next().charAt(0);

                    ll.add(kodeBarang, jumlahBeli, barangs, inputMember);
                    break;
                case 2:
                    ll.print();
                    break;
            }
        } while(input < 3);

    }
}
