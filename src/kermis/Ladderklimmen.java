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
public class Ladderklimmen extends Attractie implements GokAttractie {
    String naam = "Ladderkllimmen";
    double oppervlakte;
    double prijs = 5.00;
    double omzet;
    int aantalKaartjes = 0;
    
    void draaien(){
        this.omzet += this.prijs;
        aantalKaartjes++;
        System.out.println("De attracie " + naam +  " draait");
    };
    
    public void kansSpelBelasting(){
    //reserves 30% of omzet
    }
    
    //field return methods here
    int aantalkaartjes() {
        return this.aantalKaartjes;
    }
    
}
