/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

/**
 *
 * @author thomas
 */
public class Activite {
    
    private int noAct;
    private String libelle;
    
    public Activite(int noAct, String libelle){
        this.noAct = noAct;
        this.libelle = libelle;
    }
    
    public String toString() {
        return this.libelle;
    }
    
    public int CompareTo(String libelle){
        if (libelle.equals(this.toString())) {
            return this.noAct;
        }else{
            return -1;
        }
    }
}
