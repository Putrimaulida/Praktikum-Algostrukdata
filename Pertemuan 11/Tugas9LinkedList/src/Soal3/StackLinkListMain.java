/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3;

/**
 *
 * @author asus
 */
public class StackLinkListMain {
    public static void main(String[] args) {
        StackLinkList theStack = new StackLinkList();
        System.out.println("Mulai stack...");
        System.out.println("----------------------------");
        theStack.push("Multimedia");
        theStack.push("Statistika");
        theStack.push("Algoritma");
        theStack.push("Matematika");
        theStack.push("Basis Data");
        theStack.push("Komputer");
        theStack.push("Android");
        theStack.push("Bahasa");
        System.out.println("Tampillan dari depan : ");
        theStack.display();
        System.out.println("\nHapus Stack dari Top");
        System.out.println("-----------------------------");
        while (!theStack.isEmpty()){
            nodeStack aLink = theStack.pop();
            System.out.print("");
            aLink.displayLink();
            System.out.println("");
        }
        theStack.display();
    }
}
