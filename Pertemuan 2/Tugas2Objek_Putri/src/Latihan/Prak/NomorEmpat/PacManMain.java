/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Prak.NomorEmpat;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class PacManMain {
    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        PacMan p1 = new PacMan();
        
        System.out.print("Masukkan Tinggi: ");
        p1.height = ap.nextInt();
        System.out.print("Masukkan Lebar: ");
        p1.width = ap.nextInt();
        p1.x = 0;
        p1.y = 0;
        p1.printPosition();
        menuPilihan();
        
    } 
    static void menuPilihan(){
        Scanner ap = new Scanner(System.in);
        System.out.println("Langkah pacMan");
        System.out.println("1. Move Left");
        System.out.println("2. Move Right");
        System.out.println("3. Move Up");
        System.out.println("4. Move Down");
        System.out.print("pilih nomer menu langkah o> ");
        int menu = ap.nextInt();
        if(menu == 1){
            p1.moveLeft();
        }else if(menu == 2){
            p1.moveRight();
        }else if(menu == 3){
            p1.moveUp();
        }else if(menu == 4){
            p1.moveDown();
        }else{
            System.out.println("maaf menu yang anda pilih tidak tersedia");
        }
        menuPilihan();

    }
}
