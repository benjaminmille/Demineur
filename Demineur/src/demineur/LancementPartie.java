/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineur;

/**
 * @author Gartok
 */
public class LancementPartie {
    int longueur;
    int largeur;
    int nombreMine;
    String ligne;

    
    public LancementPartie(int longueur, int largeur, int nombreMine) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.nombreMine = nombreMine;
    }
    
    private void affichageGrille() {
        for (int i=0; i >= longueur; i++) {
            ligne = ligne +"#";
            if (i == longueur) {
                ligne = ligne + "\n";
            }
        }
    }
    
    private void generationMine() {
        
    }
}

