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
public class Spookhuis extends Attractie {

    String naam = "Spookhuis";
    double oppervlakte;
    double prijs = 3.20;
    double omzet = 0;
    int aantalKaartjes = 0;

    void draaien() {
        this.omzet += this.prijs;
        aantalKaartjes++;

        System.out.println("De attracie " + naam + " draait");

    }

    //field return methods here
    int aantalkaartjes() {
        return this.aantalKaartjes;
    }

    String naam() {
        return this.naam;
    }

    double omzet() {
        return this.omzet;
    }

    int aantalKaartjes() {
        return this.aantalKaartjes;
    }
}
