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
public class SLL4 {
    node4 head, tail;
    
    public boolean isEmpty(){
        return head==null;
    }
    public void print(){
        if(!isEmpty()){
            node4 tmp=head;
            System.out.println("DAFTAR NASABAH");
            while(tmp!=null){
                System.out.println("No Rekening : "+tmp.norek);
                System.out.println("Nama Nasabah: "+tmp.nama);
                System.out.println("Alamat      : "+tmp.alamat);
                System.out.println("");
                tmp=tmp.next;
            }
        } else{
            System.out.println("Linked List kosong!");
        }
    }
    public void addFirst(String norek, String nama, String alamat){
        node4 nsbh=new node4(null,norek,nama,alamat);
        if(isEmpty()){
            head=nsbh;
            tail=nsbh;
        } else{
            nsbh.next=head;
            head=nsbh;
        }
    }
    public void addLast(String norek, String nama, String alamat){
        node4 nsbh=new node4(null,norek,nama,alamat);
        if(isEmpty()){
           addFirst(norek,nama,alamat);
        } else{
            tail.next=nsbh;
            tail=nsbh;
        }
    }
    public void insertAfter(String key, String norek, String nama, String alamat){
        node4 nsbh=new node4(null,norek,nama,alamat);
        node4 tmp=head;
        do{
            if(tmp.nama.equals(key)||tmp.norek.equals(key)){
                nsbh.next=tmp.next;
                tmp.next=nsbh;
                if(nsbh.next==null) tail=nsbh;
                break;
            }
            tmp=tmp.next;
        } while(tmp!=null);
    }
    public void insertAt(int index, String norek, String nama, String alamat){
       if(index<0){
           System.out.println("Indeks salah!");
       } else if(index==0){
           addFirst(norek,nama,alamat);
       } else{
           node4 tmp=head;
           for(int i=0; i<index-1; i++){
               tmp=tmp.next;
           }
           tmp.next=new node4(tmp.next,norek,nama,alamat);
           if(tmp.next.next==null) tail= tmp.next;
       }  
    }
    public String getData(int index){
        node4 tmp=head;
        for(int i=0 ; i<index; i++){
            tmp=tmp.next;
        }
        return(tmp.norek+tmp.nama+tmp.alamat);
    }
    public int indexOf(String key){
        node4 tmp=head;
        int index=0;
        while(tmp!=null && !tmp.nama.equalsIgnoreCase(key)){
            tmp=tmp.next;
            index++;
        }
        if(tmp==null){
            return (-1);
        } else{
            return index;
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
    public void removeLast(){
        if(isEmpty()){
                System.out.println("Linked List masih kosong!");
        } else if(head==tail){
                head=tail=null;
        } else{
            node4 tmp=head;
            while(tmp.next!=tail){
                tmp=tmp.next;
            }
            tmp.next=null;
            tail=tmp;
        }
    }
    public void remove(String key){
        if(isEmpty()){
            System.out.println("Linked List masih kosong!");
        } else{
            node4 tmp=head;
            while(tmp!=null){
                if((tmp.nama.equalsIgnoreCase(key))||(tmp.norek.equals(key))
                        &&(tmp==head)){
                    this.removeFirst();
                    break;
                } else if(tmp.next.nama.equalsIgnoreCase(key)){
                    tmp.next=tmp.next.next;
                    if(tmp.next==null){
                        tail=tmp;
                    }
                    break;
                }
                tmp=tmp.next;
            }
         }
    }
    public void removeAt(int index){
        if(index==0){
            removeFirst();
        } else{
            node4 tmp=head;
            for(int i=0; i<index-1 ; i++){
            tmp=tmp.next;
            }
            tmp.next=tmp.next.next;
            if(tmp.next==null){
                tail=tmp;
            }
        }
    }
}
