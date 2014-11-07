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
    public FinPartie(int score, java.util.Date date) throws FileNotFoundException {
        String filePath =  new java.io.File("").getAbsolutePath() + "\\highscore.txt";

        Scanner scanner = new Scanner(new File(filePath));

        String line = null;
        
        while (scanner.hasNextLine()) {
             line = scanner.nextLine();

            System.out.println(line);
        }
        
        int highscore;
        highscore = Integer.parseInt(line); 
        
        scanner.close();
                
        if (highscore > score) {
        
            //on va chercher le chemin et le nom du fichier et on me tout ca dans un String
            String adressedufichier = new java.io.File("").getAbsolutePath() + "\\highscore.txt";

            //on met try si jamais il y a une exception
            try
            {
                /**
                 * BufferedWriter a besoin d un FileWriter, 
                 * les 2 vont ensemble, on donne comme argument le nom du fichier
                 * true signifie qu on ajoute dans le fichier (append), on ne marque pas par dessus 

                 */
                FileWriter fw = new FileWriter(adressedufichier, true);

                // le BufferedWriter output auquel on donne comme argument le FileWriter fw cree juste au dessus
                BufferedWriter output = new BufferedWriter(fw);

                //on marque dans le fichier ou plutot dans le BufferedWriter qui sert comme un tampon(stream)
                output.write(score);
                //on peut utiliser plusieurs fois methode write

                output.flush();
                //ensuite flush envoie dans le fichier, ne pas oublier cette methode pour le BufferedWriter

                output.close();
                //et on le ferme
                System.out.println("Félicitation, vous avez fait le meilleur score.");
            }
            catch(IOException ioe){
                System.out.print("Erreur : Votre score n'a pas pu être enregistré.");
                ioe.printStackTrace();
            }
        }
        
        java.util.Date nDate = new java.util.Date();
        
        System.out.println("Heure de début: " + date + ". Heure de fin: " + nDate + ".");
        
    }
}
