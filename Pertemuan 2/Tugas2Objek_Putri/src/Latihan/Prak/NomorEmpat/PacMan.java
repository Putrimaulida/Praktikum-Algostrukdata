/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Prak.NomorEmpat;

/**
 *
 * @author asus
 */
public class PacMan {
    public static int x = 0, y = 0, width, height;
    
    void moveLeft(){
        x -= 1;
    }
    
    void moveRight(){
        x += 1;
    }
    
    void moveUp(){
        y -= 1;
    }
    
    void moveDown(){
        y += 1;
    }
    
    void printPosition(){
        for(int a = 0; a < width ; a++){
            for(int b = 0; b < height ; b++){
                if ((a == y) && (b == x)){
                    System.out.print(" X ");
                } else {
                    System.out.println(" * ");
                }
            }
            System.out.println();
        }
    }
}
    