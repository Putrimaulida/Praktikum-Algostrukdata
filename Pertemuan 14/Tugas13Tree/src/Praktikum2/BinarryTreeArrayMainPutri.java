/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author asus
 */
public class BinarryTreeArrayMainPutri {
    public static void main(String[] args) {
        BinaryTreeArrayPutri btad = new BinaryTreeArrayPutri();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        btad.populateData(data, idxLast);
        btad.traverseInOrder(0);
        System.out.println("");
        btad.traversePostOrder(0);
        System.out.println("");
        btad.traversePreOrder(0);
        System.out.println("");
        btad.add(2, 3);
        btad.traverseInOrder(0);
        System.out.println("");
    }
}
