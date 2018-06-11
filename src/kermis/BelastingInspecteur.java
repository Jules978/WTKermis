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
public class BelastingInspecteur {

    double belastingOpgehaald;
    int langsgekomen;

    void inspectie(ArrayList<Attractie> attracties, Kassa kassa) {
        double nieuweOmzet = 0;
        for (Attractie a : attracties) {

            if (a instanceof GokAttractie) {
                System.out.println(a.naam() + " is een gokattractie, er wordt 30% van de omzet opgehaald");
                double indivOmzet = a.omzet() * 0.6;
                nieuweOmzet += indivOmzet;

            } else {

                nieuweOmzet += a.omzet();
            }

        }
        kassa.belastingInspectie(nieuweOmzet);
        System.out.println("Omzet na belasting is: " + kassa.setOmzet(nieuweOmzet));

    }
;

}
