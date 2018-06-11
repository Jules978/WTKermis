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
public class Spin extends RisicoRijkeAttractie {

    String naam = "Spin";
    double oppervlakte;
    double prijs = 2.25;
    double omzet = 0;
    int aantalKaartjes = 0;

    int draaiLimiet = 5;

    void draaien() throws DraaiLimietException {
        if (this.opstellingsKeuring()) {
            this.omzet += this.prijs;
            aantalKaartjes++;
            
            draaiLimiet--;
            System.out.println("De attracie " + naam + " draait");
        } else {
            throw new DraaiLimietException(this);
        }
    }

    ;
    
    public boolean opstellingsKeuring() {
        if (this.draaiLimiet > 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean onderhoudsbeurt() {
        this.draaiLimiet = 5;
        return true;
    }

    //field return methods here
    int aantalkaartjes() {
        return this.aantalKaartjes;
    }
    
     String naam(){ 
          return this.naam;
      }
     
     double omzet() {
        return this.omzet;
    }

}
