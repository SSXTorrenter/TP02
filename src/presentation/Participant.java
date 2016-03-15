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


public class Participant {
    private int noPart;
    private String nom;
    private String prenom;
    private String telephone;
    
    public Participant(int noPart, String nom, String prenom, String telephone){
        this.noPart = noPart;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }
    
    public String toString() {
        return this.nom + " " + this.prenom;
    }
    
    public int CompareTo(String nomPrenom){
        if (nomPrenom.equals(this.toString())) {
            return this.noPart;
        }else{
            return -1;
        }
    }
    
}
