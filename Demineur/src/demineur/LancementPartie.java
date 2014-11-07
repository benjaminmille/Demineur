/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demineur;

import java.util.Scanner;

/**
 * @author Gartok
 */
public class LancementPartie {
   
    int longueur;
    int largeur;
    int nombreMine;
    String tableau[][];
    Case initCase;
    boolean End = false;
    int score = 0;
    java.util.Date nDate;
    
    public LancementPartie(int longueur, int largeur, int nbMines) {
        initCase = new Case(longueur, largeur, nbMines);
        initCase.creationTableau();
        nDate = new java.util.Date();
    }
    
    public void partie () {
        while (End != true) {
            position();
        }
        if (End == true) {
            
            FinPartie fp = new FinPartie(score, nDate);
        }
    }
    public void affichageGrille() {
        initCase.recuperationTableau();
        this.partie();
    }
    public void position() {
        String result;
        String x;
        String y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir des coordoneés (Séparer par un /) :");
        result = sc.nextLine();
        
        x = result.split("\\/")[0];
        y = result.split("\\/") [1];
        
        End = initCase.resultCase(Integer.parseInt(x), Integer.parseInt(y));
        if (End != true) {
            score = score + 1000;
        }
        //TODO verifié avec tableau
        
    }
}

