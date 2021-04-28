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
public class SLLMain2 {
    public static void main(String[] args) {
        SLL2 singLL = new SLL2();
        singLL.addFirst("a");
        singLL.print();
        singLL.addLast("e");
        singLL.print();
        singLL.insertAt(1, "b");
        singLL.print();
        singLL.insertAfter("b", "d");
        singLL.print();
        singLL.insertAt(2, "c");
        singLL.print();
    }
}
