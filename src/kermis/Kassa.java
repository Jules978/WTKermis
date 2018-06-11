/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kermis;

import java.util.ArrayList;

/**
 *
 * @author Julia
 */
public class Kassa {

    static double totaleOmzet;
    static double OmzetNaBelasting;

    double setOmzet(double nieuweOmzet) {
        this.totaleOmzet = nieuweOmzet;
        return this.totaleOmzet;
    }

    void omzet(ArrayList<Attractie> attracties) {
        double nieuweOmzet = 0;
        for (Attractie a : attracties) {
              nieuweOmzet += a.omzet();
        }
        totaleOmzet = nieuweOmzet;
        System.out.println("Totale omzet = " + totaleOmzet + " euro");
        System.out.println("Omzet an belasting = " + OmzetNaBelasting + " euro");

    }
    
    void belastingInspectie(double omzet) {
    OmzetNaBelasting = omzet;
    }

    int aantalKaartjes(ArrayList<Attractie> attracties) {
        
        int totaleKaartVerkoop = 0;
         for (Attractie a : attracties) {
              totaleKaartVerkoop += a.aantalKaartjes();
              System.out.println(a.naam() + ": " + a.aantalKaartjes() + " kaartjes");
        }
        return totaleKaartVerkoop;

    }

}
