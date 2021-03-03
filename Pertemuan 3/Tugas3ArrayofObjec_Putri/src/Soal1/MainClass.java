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
public class MainClass {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("\t BALOK");
        System.out.println("-------------------------");
        Balok[] baArray = new Balok[3];
        baArray[0] = new Balok(12, 5, 7);
        baArray[1] = new Balok(6, 4, 10);
        baArray[2] = new Balok(9, 11, 5);
        for (int i = 0; i < 3; i++){
            System.out.println("Luas permukaan ke-" + i + " \t: " + baArray[i].luasPermukaan());
            System.out.println("Volume balok ke-" + i + " \t: " + baArray[i].hitungVolume());
        }
        System.out.println("--------------------------");
        System.out.println("\t BOLA");
        System.out.println("--------------------------");
        Bola[] boArray = new Bola[2];
        boArray[0] = new Bola(3.14, 5);
        boArray[1] = new Bola(3.14, 10);
        for (int j = 0; j < 2; j++){
            System.out.println("Luas permukaan ke-" + j + " \t: " + boArray[j].luasPermukaan());
            System.out.println("Volume bola ke-" + j + " \t: " + boArray[j].hitungVolume());
        }
        System.out.println("---------------------------");
        System.out.println("\t KUBUS");
        System.out.println("---------------------------");
        Kubus[] kbArray = new Kubus[3];
        kbArray[0] = new Kubus(5);
        kbArray[1] = new Kubus(8);
        kbArray[2] = new Kubus(7);
        for (int k = 0; k < 3; k++){
            System.out.println("Luas permukaan ke-" + k + " \t: " + kbArray[k].luasPermukaan());
            System.out.println("Volume kubus ke-" + k + " \t: " + kbArray[k].hitungVolume());
        }
        
    }
}
