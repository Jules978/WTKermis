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
public class Attractie {

    String naam;
    double oppervlakte;
    double prijs;
    double omzet;
    int aantalKaartjes;

    void draaien() {
        this.omzet += this.prijs;
        aantalKaartjes++;
        System.out.println("De attracie " + naam + " draait");
    }

    String naam() {
        return this.naam;
    }

    double omzet() {

        return this.omzet;
    }
}
