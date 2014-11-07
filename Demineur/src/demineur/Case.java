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
    public int taille;
    public static Object TotalCase[][];
    private String name;
    private boolean isMask;
    private boolean isMine;
    private boolean hasFlag;
    
    public Case(int longueur, int largeur, int nombreMine) {
        this.nombreMine = nombreMine;
        this.longueur = longueur;
        this.largeur = largeur;
        this.taille = longueur * largeur;
        TotalCase = new Object[this.longueur][this.largeur];
    }
    
    public Case(boolean isMine) {
        this.name = "#";
        this.isMask = true;
        this.isMine = isMine;
        this.hasFlag = false;
    }
    
    public void addToArray(int indexLongueur, int indexLargeur, Case objCase) {
        TotalCase[indexLongueur][indexLargeur] = objCase;
    }
    
    public void creationTableau() {
        int mineCreate = 0;
        int indexLongueur = 0;
        int indexLargueur = 0;
        Case addCase;
        for(int i = 1; i < this.taille ; i++) {
            
            if (Math.random() == 1
                    && this.nombreMine >= mineCreate) {
                addCase = new Case(true);
            }
            else {
                addCase = new Case(false);
            }
             
            if (indexLongueur <= this.longueur-1) {
               addToArray(indexLongueur, indexLargueur, addCase);
               indexLongueur++; 
            }
            else {
                indexLongueur=0;
                addToArray(indexLongueur, indexLargueur, addCase);
                indexLargueur++;
                
            }
        }
    }
    
    static public Object[][] getArray() {
        return TotalCase;
    }
    
    public int getInt() {
        return taille;
    }
    
    public void recuperationName() {
        
        int mineCreate = 0;
        int indexLongueur = 0;
        int indexLargueur = 0;
        String line = "";
        for(int i = 1; i < taille ; i++) {
            
            if (indexLongueur <= longueur-1) {
                Object caseTab = TotalCase[indexLongueur][indexLargueur];
                line = line + " " + (((Case)caseTab).name);

                indexLongueur++; 
            }
            else {
                indexLongueur=0;
                
                System.out.println(line + "\n");
                line = "";
                indexLargueur++;
                
            }
        }
    }
}

