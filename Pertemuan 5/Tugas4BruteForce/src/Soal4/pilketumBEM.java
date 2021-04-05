/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal4;

/**
 *
 * @author asus
 */
public class pilketumBEM {
    
    public int ketuaBEM(int[] a, int b, int c){
        int angka1 = b;
        int angka2 = c;
        
        if (c-b==1){
            if (a[b] == a[c]){
                return a[b];
            } else {
                return 0;
            }
        } else if (c>b){
            int put = (c-b)/2+b;
            int left = ketuaBEM(a, b, put);
            int right = ketuaBEM(a, put+1, c);
            if (left != 0){
                return left;
            } else if (right != 0){
                return right;
            }
            return 0;
        }
        return 0;
    }
}
