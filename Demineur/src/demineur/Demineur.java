

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineur;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Gartok
 */
public class Demineur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenue dans le demineur, choisissez votre niveau,"
                + " tapez D (Débutant) ou E (Expert):");
        String str = sc.nextLine();
        if (str.equalsIgnoreCase("D") || str.equalsIgnoreCase("d")) {
           System.out.println("Vous avez choisi le mode débutant."); 
        } else if (str.equalsIgnoreCase("E") || str.equalsIgnoreCase("e")){
           System.out.println("Vous avez choisi le mode expert."); 
        } else {
            System.out.println("Veuillez entrer une lettre valide."); 
        }
        System.out.println("Votre highscore est:"); 
    
        String filePath = "C:\\dev\\git\\demineur\\demineur\\Demineur\\highscore.txt";

       Scanner scanner=new Scanner(new File(filePath));

       // On boucle sur chaque champ detecté
       while (scanner.hasNextLine()) {
           String line = scanner.nextLine();

           System.out.println(line);
               //faites ici votre traitement
       }

       scanner.close();

    }

    
}
