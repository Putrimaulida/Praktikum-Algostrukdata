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
public class SLL2 {
    node2 head, tail;
    
    public boolean isEmpty(){
        return head == null;
    }
    public void print(){
        if(!isEmpty()){
            node2 tmp=head;
            System.out.print("Isi Linked List :\t");
            while(tmp!=null){
                System.out.print(tmp.data+"\t");
                tmp=tmp.next;
            }
            System.out.println("");
        } else{
            System.out.println("Linked List kosong!");
        }
    }
    public void addFirst(String input){
        node2 ndInput=new node2(input,null);
        if(isEmpty()){
            head=tail=ndInput;
        } else{
            ndInput.next=head;
            head=ndInput;
        }
    }
    public void addLast(String input){
        node2 ndInput=new node2(input,null);
        if(isEmpty()){
            head=tail=ndInput;
        } else{
            tail.next=ndInput;
            tail=ndInput;
        }
    }
    public void insertAfter(String key, String input){
        node2 ndInput=new node2(input,null);
        node2 tmp=head;
        do{
            if(tmp.data.equals(key)){
                ndInput.next=tmp.next;
                tmp.next=ndInput;
                if(ndInput.next==null) tail=ndInput;
                break;
            }
            tmp=tmp.next;            
        } while(tmp!=null);
    }
    public void insertAt(int index, String input){
        if(index < 0){
            System.out.println("Indeks salah!");
        } else if(index == 0){
            addFirst(input);
        } else{
            node2 tmp=head;
            for(int i = 0; i < index - 1; i++){
                tmp = tmp.next;
            }
            tmp.next = new node2(input,tmp.next);
            if(tmp.next.next == null)tail = tmp.next;
        }
    }
}
