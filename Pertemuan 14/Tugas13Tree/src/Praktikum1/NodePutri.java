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
public class NodePutri {
    int data;
    NodePutri left;
    NodePutri right;
    
    public NodePutri(){
    }
    
    public NodePutri(int data){
        this.left = null;
        this.data = data;
        this.right = null;
    }
}
