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
    
    public LancementPartie() {
        
    }
    
    public void position() {
        String result;
        String x;
        String y;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir des coordoneés (Séparer par un /) :");
        result = sc.nextLine();
        
        x = result.split("\\/")[0];
        y = result.substring(result.lastIndexOf("/" + 1));
        
        //TODO get tableau
        //TODO verifié avec tableau
        
    }
}

