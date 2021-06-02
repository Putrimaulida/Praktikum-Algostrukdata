/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author asus
 */
public class BinaryTreeMainPutri {
    public static void main(String[] args) {
        BinaryTreePutri bt = new BinaryTreePutri();
        bt.insert(6);
        bt.insert(4);
        bt.insert(8);
        bt.insert(3);
        bt.insert(5);
        bt.insert(7);
        bt.insert(9);
        bt.insert(10);
        bt.insert(15);
        
        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("find "+bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("Max = "+bt.findMax(bt.root));                
        System.out.println("Min = "+bt.findMin(bt.root));
        bt.dataLeaf(bt.root);
        System.out.println("");
        bt.jumlahLeaf(bt.root);
        System.out.println("");
    }
}
