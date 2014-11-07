/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineur;

/**
 *
 * @author BenBenCompany
 */
public class Difficult {
    
    /* Constante Largeur / Longueur. */
    private static final int LARGEUR_LONGUEUR = 10;
    
    public void Difficult() {
        
    }
    
    /**
     * Set the difficulty.
     * @param difficulty The string user choose
     */
    public void chooseDifficulty(String difficulty) {    
        int longueur = 0;
        int largeur = 0;
        int nbMines = 0;
        
        if (difficulty.equalsIgnoreCase("d") 
                || difficulty.equalsIgnoreCase("D")) {
            
            longueur = LARGEUR_LONGUEUR;
            largeur = LARGEUR_LONGUEUR;

        } else if (difficulty.equalsIgnoreCase("e")
                || difficulty.equalsIgnoreCase("E")) {

            longueur = LARGEUR_LONGUEUR * 2;
            largeur = LARGEUR_LONGUEUR * 2;
        }
        
    nbMines = this.countMines(longueur, largeur);
    System.out.println("coucou");
    LancementPartie launch = new LancementPartie(longueur, largeur, nbMines);
    launch.affichageGrille();
    //TODO call lancement partie
   }
    
    /**
     * Count the number of mines in the game.
     * @param longueur Longueur of the grid
     * @param largeur Largeur of the grid
     * @return number of Mines
     */
    public int countMines(int longueur, int largeur) {
        int result;
        int nbCases = longueur + largeur;
        
        result = nbCases * (10/100);
        
        return result;
    }
}
