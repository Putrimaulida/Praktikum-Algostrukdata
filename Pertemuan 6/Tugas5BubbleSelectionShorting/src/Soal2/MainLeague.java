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
public class MainLeague {
    public static void main(String[] args) {
        boolean asc = true;
        boolean desc = true;
        
        PremierLeagueService list = new PremierLeagueService();
        PremierLeague p1 = new PremierLeague("Liverpool                     ", 29, 45, 82);
        PremierLeague p2 = new PremierLeague("Manchester City               ", 27, 39, 57);
        PremierLeague p3 = new PremierLeague("Leicester                     ", 28, 26, 50);
        PremierLeague p4 = new PremierLeague("Chelsea                       ", 29, 9, 48);
        PremierLeague p5 = new PremierLeague("Wolverhampton Wanderers       ", 29, 7, 43);
        PremierLeague p6 = new PremierLeague("Sheffield United              ", 29, 5, 43);
        PremierLeague p7 = new PremierLeague("Manchester United             ", 29, 12, 42);
        PremierLeague p8 = new PremierLeague("Tottenham Hotspur             ", 29, 7, 41);
        PremierLeague p9 = new PremierLeague("Arsenal                       ", 29, 4, 40);
        PremierLeague p10 = new PremierLeague("Burnley                      ", 29, -6, 39);
        PremierLeague p11 = new PremierLeague("Crystal Palace               ", 29, -6, 39);
        PremierLeague p12 = new PremierLeague("Everton                      ", 29, -6, 37);
        PremierLeague p13 = new PremierLeague("Newcastle United             ", 29, -16, 35);
        PremierLeague p14 = new PremierLeague("Southampion                  ", 29, -17, 34);
        PremierLeague p15 = new PremierLeague("Brighton & Hove Albion       ", 29, -8, 29);
        PremierLeague p16 = new PremierLeague("West Ham United              ", 29, -15, 27);
        PremierLeague p17 = new PremierLeague("Watford                      ", 29, -17, 27);
        PremierLeague p18 = new PremierLeague("AFC Bournemouth              ", 29, -18, 27);
        PremierLeague p19 = new PremierLeague("Aston Villa                  ", 29, -18, 25);
        PremierLeague p20 = new PremierLeague("Norwich City                 ", 29, -27, 21);
        
        list.tambah(p1);
        list.tambah(p2);
        list.tambah(p3);
        list.tambah(p4);
        list.tambah(p5);
        list.tambah(p6);
        list.tambah(p7);
        list.tambah(p8);
        list.tambah(p9);
        list.tambah(p10);
        list.tambah(p11);
        list.tambah(p12);
        list.tambah(p13);
        list.tambah(p14);
        list.tambah(p15);
        list.tambah(p16);
        list.tambah(p17);
        list.tambah(p18);
        list.tambah(p19);
        list.tambah(p20);
        
        System.out.println("\n=====================\t Data Premier League sebelum shorting\t=========================");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("|            Premier League            |        P       |       GD      |      PTS      |");
        System.out.println("-----------------------------------------------------------------------------------------");
        list.tampilA11();
        
        System.out.println("\n========\t Data Premier League setelah shorting asc berdasarkan point\t=========");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("|             Premier League           |        P       |       GD      |      PTS      |");
        System.out.println("-----------------------------------------------------------------------------------------");
        list.insertionShort(asc);
        list.tampilA11();
        
        System.out.println("\n========\t Data Premier League setelah shorting desc berdasarkan point\t=========");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("|             Premier League           |        P       |       GD      |       PTS     |");
        System.out.println("-----------------------------------------------------------------------------------------");
        list.insertionShortdesc(desc);
        list.tampilA11();
        
    }
}
