/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author asus
 */
public class Rekening {
    public String noRekening;
    public String nama;
    public String namaIbu;
    public String Phone;
    public String Email;
    
    Rekening(){
        
    }
    
    Rekening (String a, String b, String c, String d, String e){
        noRekening = a;
        nama = b;
        namaIbu = c;
        Phone = d;
        Email = e;
    }

    Rekening(String string, String bin_Abdul_Salam, String aruffin, String string0, String ligulaNullamtacitisociosquedu, String string1, String _075442) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void dataRekening(){
        System.out.println("|\t" + noRekening + "\t|\t" + nama + "\t|\t" + namaIbu + "\t|\t" + Phone + "\t|\t" + Email + "\t|");
    }
    
    
}
