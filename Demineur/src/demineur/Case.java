/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineur;
/**
 *
 * @author Gartok
 */
public class Case {
    int nombreMine;
    int longueur;
    int largeur;
    int taille;
    static Object TotalCase[][];
    boolean isMask;
    boolean isMine;
    boolean hasFlag;
    
    public Case(int longueur, int largeur, int nombreMine) {
        this.nombreMine = nombreMine;
        this.longueur = longueur;
        this.largeur = largeur;
        this.taille = longueur * largeur;
        TotalCase = new Object[this.longueur][this.largeur];
    }
    
    public Case(boolean isMine) {
        this.isMask = true;
        this.isMine = isMine;
        this.hasFlag = false;
        
    }
    
    public void addToArray(int indexLongueur, int indexLargeur) {
        TotalCase[indexLongueur][indexLargeur] = this;
    }
    
    public void creationTableau() {
        int mineCreate = 0;
        int indexLongueur = 0;
        int indexLargueur = 0;
        for(int i = 1; i <= this.taille ; i++) {
            
            if (Math.random() == 1
                    && this.nombreMine <= mineCreate) {
               Case addCase = new Case(true);
            }
            else {
               Case addCase = new Case(false);
            }
            
            System.out.println("hello"+indexLongueur + " "+ indexLargueur + " " + i);
            if (indexLongueur <= this.longueur-1) {
               addToArray(indexLongueur, indexLargueur);
               indexLongueur++; 
            }
            else {
                indexLargueur++;
                indexLongueur=0;
                addToArray(indexLongueur, indexLargueur);
            }
        }
    }
}


