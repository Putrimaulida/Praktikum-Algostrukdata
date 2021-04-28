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
public class StackLinkList {
    private nodeStack top; // ref to first link on list
    private nodeStack bottom; // ref to last link on list

    public StackLinkList() // constructor
    {
        top = bottom = null; // no items on list yet
    }

    public boolean isEmpty() // true if list is empty
    {
        return (top == null);
    }

    public void push(String id) //node baru selalu di top
    { // make new link
        nodeStack newitem = new nodeStack(id);
        if (top == null) // the first node created
        {
            top = bottom = newitem; // first –> newLink
        } else // the second node and the next node
        {
            top.next = newitem; //next dr top (awal) diarahkan ke node baru
            newitem.prev = top; //prev dr node baru diarahkan ke tail (awal)
            top = newitem; //top (baru) diarahkan ke node baru
        }
    }

    public nodeStack pop() // delete first item
    {
        nodeStack temp = null;
        if (top == null) // stack is empty
        {
            System.out.println("Stack is empty");
        } else if (top == bottom) { // stack is only one data
            temp = top;
            top = bottom = null;
        } else // stack has more than one data
        {
            temp = top; // save reference to link
            top = top.prev; // delete it: first–>old next
        }
        return temp;
    }

    public void display() {
        nodeStack current = bottom; // start from the first data
        while (current != null) // until end of list,
        {
            current.displayLink(); // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }
} // end class LinkList

class StackLinkListApp {

    public static void main(String[] args) {
        StackLinkList theStack = new StackLinkList(); // make new list
        System.out.println("Mulai Stack…");
        System.out.println("---------------------");
        theStack.push("Multimedia"); // insert four items
        theStack.push("Statistika");
        theStack.push("Algoritma");
        theStack.push("Matematika");
        theStack.push("Basis data");
        theStack.push("Komputer");
        theStack.push("Android");
        theStack.push("Bahasa");
        System.out.println("Tampilan dari depan : ");
        theStack.display(); // display list
        System.out.println("\nHapus Stack dari Top");
        System.out.println("------------------------");
        while (!theStack.isEmpty()) // until it’s empty,
        {
            nodeStack aLink = theStack.pop(); // delete link
            System.out.print(""); // display it
            aLink.displayLink();
            System.out.println("");
        }
        theStack.display(); // display list
    } // end main()
}
