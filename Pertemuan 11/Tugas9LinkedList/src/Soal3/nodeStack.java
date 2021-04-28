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
public class nodeStack {
    public String data; 
    public nodeStack next; 
    public nodeStack prev; 

    public nodeStack(String id){ // constructor
        data = id; // initialize data
    } 

    public void displayLink() 
    {
        System.out.println("{" + data + "}");
    }
}
