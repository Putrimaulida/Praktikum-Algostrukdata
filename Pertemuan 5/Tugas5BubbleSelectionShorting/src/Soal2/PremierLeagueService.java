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
public class PremierLeagueService {
    PremierLeague leagues[] = new PremierLeague[20];
    int index;
    
    //Method tambah
    void tambah(PremierLeague t){
        if (index < leagues.length){
            leagues[index] = t;
            index++;
        } else {
            System.out.println("Data sudah penuh !");
        }
    }
    
    //Method tampilA11
    void tampilA11(){
        for (PremierLeague t : leagues){
            t.tampilPremier();
        }
    }
    
    //Method insertion Sort ascending
    void insertionShort(boolean asc){
        for (int i = 1; i < leagues.length; i++){
            PremierLeague temp = leagues[i];
            int j = i;
            while (j > 0 && leagues[j-1].points > temp.points){
                leagues[j] = leagues[j-1];
                j--;
            }
            if (asc){
            } else {
            }
            leagues[j] = temp;
        }
    }
    
    //Method insertion Sort Descending
    void insertionShortdesc (boolean desc){
        for (int i = 1; i < leagues.length; i++){
            PremierLeague temp = leagues[i];
            int j = i;
            while (j > 0 && leagues[j-1].points < temp.points){
                leagues[j] = leagues[j-1];
                j--;
            }
            if (desc){
                
            } else {
                
            }
            leagues[j] = temp;
        }
    }
}
