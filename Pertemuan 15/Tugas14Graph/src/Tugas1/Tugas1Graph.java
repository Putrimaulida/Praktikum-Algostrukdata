/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Tugas1Graph {
    int vertex;
    Tugas1LinkedList list[];
    
    public Tugas1Graph(int vertex){
        this.vertex = vertex;
        list = new Tugas1LinkedList[vertex];
        for(int i = 0; i < vertex; i++){
            list[i] = new Tugas1LinkedList();
        }
    }
    public void addEdge(int source, int destination){
        //add edge
        list[source].addFirst(destination);
        
        //add back edge for udirected
        list[destination].addFirst(source);
    }
    public void degree(int source) throws Exception{
        //degree undirected graph
        System.out.println("Degree vertex "+source+" : "+list[source].size());
        
        //degree directed graph
            //indegree
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++){
            for(int j = 0; j < list[i].size(); j++){
                if(list[i].get(j)==source)
                    ++totalIn;
            }
            //outdegree
            for (k = 0; k < list[source].size(); k++){
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex "+source+" : "+totalIn);
        System.out.println("Outdegree dari vertex "+source+" : "+totalOut);
        System.out.println("Degree vertex "+source+" : "+(totalIn+totalOut));
    }
    public void removeEdge(int source, int destination) throws Exception{
        for (int i = 0; i < vertex; i++){
            if (i==destination){
                list[source].remove(destination);
            }
        }
    }
    public void removeAllEdges(){
        for (int i = 0; i < vertex; i++){
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    public void printGraph() throws Exception{
        for ( int i = 0; i < vertex; i++){
            if(list[i].size() > 0){
                System.out.print("Vertex "+i+" terhubung dengan : ");
                for (int j = 0; j < list[i].size(); j++){
                    System.out.print(list[i].get(j)+" ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
    public static void main(String[] args) throws Exception{
        Scanner ap = new Scanner(System.in);
        
        Tugas1Graph graph1 = new Tugas1Graph(6);
        int a, to, from;
        System.out.print("Masukkan jumlah lintasan graph yang akan diisi : ");
        int grp = ap.nextInt();
        
        System.out.println("Masukkan edges : ");
        int edges = ap.nextInt();
        
        for(a = 1 ; a<=grp ; a++){
            to = ap.nextInt();
            from = ap.nextInt();
            graph1.addEdge(to,from);
        }
        System.out.println("");
        graph1.printGraph();
        graph1.degree(2);
        System.out.println("");
        
        graph1.removeEdge(1,2);
        graph1.printGraph();
    }
}
