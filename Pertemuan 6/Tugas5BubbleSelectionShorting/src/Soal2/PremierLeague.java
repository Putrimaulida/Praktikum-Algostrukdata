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
public class PremierLeague {
    public String team;
    public int play, goal, points;

    PremierLeague(String t, int p, int g, int pt){
        team = t;
        play = p;
        goal = g;
        points = pt;
    } 
    
    void tampilPremier(){
        System.out.println("|\t" + team + "\t|\t" + play + "\t|\t" + + goal + "\t|\t" + points + "\t|");
    }
}
