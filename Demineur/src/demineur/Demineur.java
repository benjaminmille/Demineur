

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineur;
import java.util.Scanner;
/**
 *
 * @author Gartok
 */
public class Demineur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenue dans le demineur, choisissez votre niveau,"
                + " tapez D (Débutant) ou E (Expert):");
        String str = sc.nextLine();
        if (str == "D" || str == "d") {
           System.out.println("Vous avez choisi le mode débutant."); 
        } else if (str == "E" || str == "e"){
           System.out.println("Vous avez choisi le mode expert."); 
        } else {
            System.out.println("Veuillez entrer une lettre valide."); 
        }
        System.out.println("Votre highscore est:"); 
    }
    
}
