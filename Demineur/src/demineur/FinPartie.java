/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineur;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BenBen
 */
public class FinPartie {
    public FinPartie(int score, java.util.Date date) {
        String filePath =  new java.io.File("").getAbsolutePath() + "\\highscore.txt";
        
        try {
        Scanner scanner = new Scanner(new File(filePath));


        String line = null;
        
        while (scanner.hasNextLine()) {
             line = scanner.nextLine();
        }
        
        int highscore;
        highscore = Integer.parseInt(line); 
        
        scanner.close();
                
        if (highscore < score) {
        
            //on va chercher le chemin et le nom du fichier et on me tout ca dans un String
            String adressedufichier = new java.io.File("").getAbsolutePath() + "\\highscore.txt";

            //on met try si jamais il y a une exception
            try
            {
                FileWriter fw = new FileWriter(adressedufichier, true);
                BufferedWriter output = new BufferedWriter(fw);
                
                output.write(score);
                output.flush();
                output.close();
                
                System.out.println("Félicitation, vous avez fait le meilleur score: " + score + "\n");
            }
            catch(IOException ioe){
                System.out.print("Erreur : Votre score n'a pas pu être enregistré.\n");
                ioe.printStackTrace();
            }
        } else {
            System.out.print("Vous avez perdu.\n");
            System.out.println("Votre meilleur score est: " + line + "\n");
        }
        java.util.Date nDate = new java.util.Date();
        
        System.out.println("Heure de début: " + date + ".\nHeure de fin: " + nDate + ".");
                }
        catch (FileNotFoundException e) {
            System.out.print("Erreur : Problème de fin de partie.\n");
        }
        
    }
}
