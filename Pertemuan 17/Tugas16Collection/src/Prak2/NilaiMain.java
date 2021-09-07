/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prak2;

/**
 *
 * @author asus
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class NilaiMain {
    List<Mahasiswa> mhs = new ArrayList<>();
    List<MataKuliah> mk = new ArrayList<>();
    List<Nilai> nli = new ArrayList<>();
    static Scanner sclia = new Scanner(System.in);

    public static void main(String[] args) {
        NilaiMain obj = new NilaiMain();
        int pilih;
        obj.setDataMHSdanMatkul();
        do {
            System.out.println("***********************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("***********************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.println("***********************************************");
            System.out.print("Pilih : ");
            pilih = sclia.nextInt();
            switch (pilih) {
                case 1:
                    obj.menusatu();
                    break;
                case 2:
                    obj.menudua();
                    break;
                case 3:
                    obj.menutiga();
                    break;
                case 4:
                    obj.menuempat();
                    break;
                default:
                    System.out.println("Good Bye!!!");
                    break;
            }
            System.out.println("");
        } while (pilih >= 1 && pilih <= 4);
    }

    void setDataMHSdanMatkul() {
        mhs.add(new Mahasiswa("20001", "Thalhah", "021xxx"));
        mhs.add(new Mahasiswa("20002", "Zubair", "021xxx"));
        mhs.add(new Mahasiswa("20003", "Abdur-Rahman","021xxx"));
        mhs.add(new Mahasiswa("20004", "Sa'ad", "021xxx"));
        mhs.add(new Mahasiswa("20005", "Sa'id", "021xxx"));
        mhs.add(new Mahasiswa("20006", "Ubaidah", "021xxx"));
        mk.add(new MataKuliah("00001", "Internet of Things", "3"));
        mk.add(new MataKuliah("00002", "Algoritma dan Struktur Data", "2"));
        mk.add(new MataKuliah("00003", "Algoritma dan Pemrograman", "2"));
        mk.add(new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data",
                "3"));
        mk.add(new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman",
                "3"));
    }

    void menusatu() {
        sclia.nextLine();
        System.out.println("Masukkan Data ");
        System.out.print("Kode : ");
        String kode = sclia.next();
        System.out.print("Nilai : ");
        float nilai = sclia.nextFloat();
        System.out.println("\nDAFTAR MAHASISWA");
        System.out.println("*****************");
        System.out.println("NIM\tNama\t\tTelf");
        mhs.forEach((mahasiswa) -> {
            System.out.println(mahasiswa.nim + "\t" + mahasiswa.nama + "\t\t" + mahasiswa.notelp);
        });
        boolean ketemu = true;
        String pilihmahasiswa;
        int konfirmasi2 = 0;
        do {
            System.out.print("Pilih Mahasiswa by NIM : ");
            pilihmahasiswa = sclia.next();
            for (Mahasiswa mahasiswa : mhs) {
                if (pilihmahasiswa.equals(mahasiswa.nim)) {
                    ketemu = false;
                    konfirmasi2++;
                }
            }
            if (konfirmasi2 == 0) {
                System.out.println("Data Kode NIM Tidak Ditemukan");
            }
        } while (ketemu);
        System.out.println("\nDAFTAR MATA KULIAH");
        System.out.println("*****************");
        System.out.println("Kode\tMata Kuliah\t\t\t\t   SKS");
        mk.forEach((matakuliah) -> {
            System.out.println(matakuliah.kode + "\t" + matakuliah.matakuliah + "\t\t" + matakuliah.sks);
        });
        boolean ketemu2 = true;
        String pilihmatakuliah;
        int konfirmasi = 0;
        do {
            System.out.print("Pilih MK by Kode : ");
            pilihmatakuliah = sclia.next();
            for (MataKuliah mklh : mk) {
                if (pilihmatakuliah.equals(mklh.kode)) {
                    ketemu2 = false;
                    konfirmasi++;
                }
            }
            if (konfirmasi == 0) {
                System.out.println("Data Kode Matakuliah Tidak Ditemukan");
            }
        } while (ketemu2);
        nli.add(new Nilai(kode, nilai, pilihmatakuliah, pilihmahasiswa));
    }

    void menudua() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("*****************");
        System.out.println("NIM\tNama Mahasiswa\t\tMata Kuliah\t\t\tSKS\tNilai");
        nli.forEach((Nilai nilaisatuan) -> {
            System.out.print(nilaisatuan.nimmhs + "\t");
            mhs.stream().filter((mahasiswa) -> (mahasiswa.nim.equals(nilaisatuan.nimmhs))).forEachOrdered((mahasiswa) -> {
                System.out.print(mahasiswa.nama + "\t\t\t");
            });
            mk.stream().filter((matkul) -> (matkul.kode.equals(nilaisatuan.kodematakuliah))).forEachOrdered((matkul) -> {
                System.out.print(matkul.matakuliah + "\t" + matkul.sks + "\t");
            });
            System.out.println(nilaisatuan.nilai);
        });
    }

    void menutiga() {
        menudua();
        System.out.print("Masukkan Data Mahasiswa[nim] : ");
        String caridata = sclia.next();
        int konfirmasi3 = 0;
        konfirmasi3 = nli.stream().filter((carinilai) -> (carinilai.nimmhs.equals(caridata))).map((Nilai carinilai) -> {
            System.out.print(carinilai.nimmhs + "\t");
            return carinilai;
        }).map((Nilai carinilai) -> {
            mhs.stream().filter((mahasiswa) -> (mahasiswa.nim.equals(carinilai.nimmhs))).forEachOrdered((mahasiswa) -> {
                System.out.print(mahasiswa.nama + "\t");
            });
            return carinilai;
        }).map((Nilai carinilai) -> {
            mk.stream().filter((matkul) -> (matkul.kode.equals(carinilai.kodematakuliah))).forEachOrdered((matkul) -> {
                System.out.print(matkul.matakuliah + "\t" + matkul.sks + "\t");
            });
            return carinilai;
        }).map((carinilai) -> {
            System.out.println(carinilai.nilai);
            return carinilai;
        }).map((_item) -> 1).reduce(konfirmasi3, Integer::sum);
        if (konfirmasi3 == 0) {
            System.out.println("Data Dengan NIM " + caridata + " Tidak Ditemukan");
        }
    }

    void menuempat() {
        for (int i = 0; i < nli.size() - 1; i++) {
            for (int j = 0; j < nli.size() - i - 1; j++) {
                if (nli.get(j).nilai > nli.get(j + 1).nilai) {
                    float swap = nli.get(j).nilai;
                    nli.get(j).nilai = nli.get(j + 1).nilai;
                    nli.get(j + 1).nilai = swap;
                }
            }
        }
        menudua();
    }
}
