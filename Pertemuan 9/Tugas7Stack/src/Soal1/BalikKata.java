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
public class BalikKata {
    int n;
    int top;
    char[] stack;
    
    BalikKata(int size){
        n = size;
        stack = new char[size];
        top = -1;
    }
    
     public void push(char c){
        top++;
        stack[top] = c;
    }
    
    public boolean Input(char c){
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') ||
                (c >= '0' && c <= '9') || c == ' ';  
    }
    
    public String membalikkan(String Q){
        String P = "";
        char c;
        for (int i = 0; i < n; i++){
            c = Q.charAt(i);
            if (Input(c)){
                P = P +c;
                push(c);
            }
        }
        System.out.println("Hasil : ");
        for (int i = top; i >= 0; i--){
            System.out.print(stack[i]);
        }
        System.out.println("");
        return P;       
    }
}
