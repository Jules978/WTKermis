/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kermis;

import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class Kermis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean gameOn = true;

        Kassa kassa = new Kassa();
        Botsauto botsauto = new Botsauto();
        Spin spin = new Spin();
        Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
        Spookhuis spookhuis = new Spookhuis();
        Hawaii hawaii = new Hawaii();
        Ladderklimmen ladderklimmen = new Ladderklimmen();

        Scanner reader = new Scanner(System.in);

        System.out.println("Welkom bij de kermis!");
        System.out.println("type 1 voor de botsauto's;");
        System.out.println("type 2 voor de spin;");
        System.out.println("type 3 voor het spiegelpaleis;");
        System.out.println("type 4 voor het spookhuis;");
        System.out.println("type 5 voor de hawaii;");
        System.out.println("type 6 voor het ladderklimmen");
        System.out.println("type o om de omzet te zien");
        System.out.println("type k om het aantal verkochte kaartjes te zien");
        System.out.println("type o om de totale omzet te zien");
        System.out.println("type q om te stoppen");

        while (gameOn) {

            String input = reader.nextLine();

            switch (input) {
                case "1":
                    botsauto.draaien();
                    break;
                case "2":
                    try {
                        spin.draaien();
                    } catch (DraaiLimietException dle) {
                        System.out.println("Spin heeft de draailimiet bereikt, type o om een onderhoudsbeurt uit te laten voeren");
                        String antwoord = reader.nextLine();
                        if (antwoord.equals("o")) {
                            boolean a = dle.spin.onderhoudsbeurt();
                            if(a)System.out.println("onderhoudsbeurt is uitgevoerd.");
                        };

                    }
                    break;
                case "3":
                    spiegelpaleis.draaien();
                    break;
                case "4":
                    spookhuis.draaien();
                    break;
                case "5":

                    try {
                        hawaii.draaien();
                    } catch (DraaiLimietException dle) {
                        System.out.println("Hawaii heeft de draailimiet bereikt, type o om een onderhoudsbeurt uit te laten voeren");
                        String antwoord = reader.nextLine();
                        if (antwoord.equals("o")) {
                            boolean a = dle.hawaii.onderhoudsbeurt();
                             if(a)System.out.println("onderhoudsbeurt is uitgevoerd.");
                        };

                    }
                    break;
                case "6":
                    ladderklimmen.draaien();
                    break;
                case "q":
                    System.out.println("BYE!!");
                    gameOn = false;
                    break;
                case "k":
                    int kaartVerkoop = kassa.aantalKaartjes(botsauto, hawaii, ladderklimmen, spiegelpaleis, spin, spookhuis);
                    System.out.println("De totale kaartverkoop is " + kaartVerkoop + " kaartjes");
                    break;
                case "o":
                    double omzet = kassa.omzet();
                    System.out.println("De totale omzet is " + omzet + " euro");
                    break;
                default:
                    System.out.println("verkeerde input, probeer het nog een keer");
                    break;

            }
        }

    }
}
