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
public class Hawaii extends RisicoRijkeAttractie {
    String naam = "Hawaii";
    double oppervlakte;
    double prijs = 2.90;
    double omzet;
    int aantalKaartjes = 0;

    int draaiLimiet = 10;
    
    void draaien() throws DraaiLimietException{
        if(this.opstellingsKeuring()){
        this.omzet += this.prijs;
        aantalKaartjes++;
        Kassa.totaleOmzet  += this.prijs;
        draaiLimiet--;
        System.out.println("De attracie " + naam +  " draait");
        }
        else {
        throw new DraaiLimietException(this);
        }
    }

    public boolean opstellingsKeuring() {
        if (this.draaiLimiet > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    boolean onderhoudsbeurt(){
    this.draaiLimiet = 10;
    return true;
    }
    
    //field return methods here
    int aantalkaartjes() {
        return this.aantalKaartjes;
    }
}
