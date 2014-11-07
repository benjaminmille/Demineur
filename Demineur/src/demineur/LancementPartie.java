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
   
    Case initCase;
    
    public LancementPartie(int longueur, int largeur, int nbMines) {
        initCase = new Case(longueur, largeur, nbMines);
        initCase.creationTableau();
    }
    
    public void affichageGrille() {
        initCase.recuperationName();
    }
    
}

