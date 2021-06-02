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
public class BinaryTreeArrayPutri {
    int[] data;
    int idxLast;

    public BinaryTreeArrayPutri() {
        data = new int[10];
    }

    public void add(int data, int idx) {
        this.data[idx] = data;
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] == 0) {
                System.out.print(idxLast + " ");
            } else {
                System.out.print(data[idxStart] + " ");
            }
            traverseInOrder((2 * idxStart) + 1);
            traverseInOrder((2 * idxStart) + 2);
        }
    }

    public void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder((2 * idxStart) + 1);
            traverseInOrder((2 * idxStart) + 2);
            if (data[idxStart] == 0) {
                System.out.print(idxLast + " ");
            } else {
                System.out.print(data[idxStart] + " ");
            }
        }
    }
}
