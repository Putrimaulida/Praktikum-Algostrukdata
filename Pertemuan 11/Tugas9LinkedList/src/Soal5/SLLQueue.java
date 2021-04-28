/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal5;

/**
 *
 * @author asus
 */
public class SLLQueue {
    node5 head, tail;
    
    public boolean isEmpty(){
        return head==null;
    }
    public void print(){
        if(!isEmpty()){
            node5 tmp=head;
            System.out.println("DAFTAR NASABAH :\t");
            while(tmp!=null){
                System.out.println("No Rekening\t: "+tmp.norek);
                System.out.println("Nama Nasabah\t: "+tmp.nama);
                System.out.println("Alamat\t\t: "+tmp.alamat);
                System.out.println("");
                tmp=tmp.next;
            }
        } else{
            System.out.println("Linked List kosong!");
        }
    }
    public void addFirst(String norek, String nama, String alamat){
        node5 nsbh=new node5(null,norek,nama,alamat);
        if(isEmpty()){
            head=nsbh;
            tail=nsbh;
        } else{
            nsbh.next=head;
            head=nsbh;
        }
    }
    public void addLast(String norek, String nama, String alamat){
        node5 nsbh=new node5(null,norek,nama,alamat);
        if(isEmpty()){
           addFirst(norek,nama,alamat);
        } else{
            tail.next=nsbh;
            tail=nsbh;
        }
    }
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong!");
        } else if(head==tail){
            head=tail=null;
        } else{
            head=head.next;
        }
    }
    public void getDataHead(){
        node5 tmp=head;
        System.out.println("Antrian terdepan : "+tmp.norek+" "+tmp.nama);
    }
    public void getPosition(String key){
        node5 tmp=head;
        int index=0;
        while(tmp != null && !tmp.nama.equals(key)){
            tmp=tmp.next;
            index++;
        }
        if(tmp==null){
            System.out.println("Antrian nasabah tidak ditemukan!");
        } else{
            System.out.println("Antrian berada pada index ke-"+index+" antrian no "+(index+1));
        }
    }
}
