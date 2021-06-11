/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

import java.util.Scanner;

/**
 *
 * @author asus
 */
class Tugas2Graph {
    int vertex;
    Tugas2LinkedList list[];
    
    public Tugas2Graph(int vertex, boolean typeGraph){
        this.vertex = vertex;
        list = new Tugas2LinkedList[vertex];
        for(int i = 0; i < vertex; i++){
            list[i] = new Tugas2LinkedList();
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
    boolean graphType(boolean pilih){
        return pilih;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        int a, to, from;
        
        boolean type;
        System.out.println("Pilih Jenis Graph");
        System.out.println("1. Directed");
        System.out.println("2. Undirected");
        System.out.print("Pilih 1/2 jenis graph : ");
        int pilih = sc.nextInt();
        if(pilih==1){
            System.out.println("Menggunakan directed");
            type = true;
        } else {
            System.out.println("Menggunakan undirected");
            type = false;
        }
        System.out.println("");
        Tugas2Graph graph2 = new Tugas2Graph(6,type);
        System.out.print("Masukkan jumlah lintasan : ");
        int grp = sc.nextInt();
        
        System.out.println("Masukkan edges : ");
        int edges = sc.nextInt();
        
        for(a = 1 ; a<=grp ; a++){
            to = sc.nextInt();
            from = sc.nextInt();
            graph2.addEdge(to,from);
        }
        System.out.println("");
        graph2.printGraph();
        graph2.degree(2);
        System.out.println("");
        
        graph2.removeEdge(1,2);
        graph2.printGraph();
    }
}
