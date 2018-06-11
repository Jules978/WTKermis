/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kermis;

/**
 *
 * @author Julia
 */
public class Kassa {
    static double totaleOmzet;
    
    double omzet(){
    return this.totaleOmzet;
    }
    
    int aantalKaartjes(Botsauto b, Hawaii h, Ladderklimmen l, Spiegelpaleis sp, Spin s, Spookhuis sh ) {
        System.out.println(b.naam + ": " + b.aantalKaartjes);
        System.out.println(h.naam + ": " + h.aantalKaartjes);
        System.out.println(l.naam + ": " + l.aantalKaartjes);
        System.out.println(sp.naam + ": " + sp.aantalKaartjes);
        System.out.println(s.naam + ": " + s.aantalKaartjes);
        System.out.println(sh.naam + ": " + sh.aantalKaartjes);
        int totaleKaartVerkoop = b.aantalKaartjes + h.aantalKaartjes + l.aantalKaartjes + sp.aantalKaartjes + s.aantalKaartjes + sh.aantalKaartjes;
        return totaleKaartVerkoop;
    
    }
    
}
