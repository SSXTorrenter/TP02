package main.base;

import java.util.*;
import main.domaine.*;
import java.sql.Connection;     // connexion à la BD
import java.sql.Statement;      // interrogation de la base de données
import java.sql.ResultSet;      // le résultat de la requête
import java.sql.SQLException;   // gestion de l'exception "SQLException"

/**
 * 634.1 Programmation - TP P02
 * 
 * Gestion des accès à la base de données pour l'entité Activite.
 * 
 * @author RODRIGUEZ-VELDHUIS Thomas
 * @version 1.0
*/
public class ActiviteDao {

    public static ArrayList listeActivites(){
        ArrayList liste = new ArrayList();
        try{
            Connection con = ConnexionBase.get();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Activite;");
            while(rs.next()){
                Activite activite = new Activite(rs.getInt("NoAct"), rs.getString("Libelle"));
                liste.add(activite);
            }
        }
        catch(SQLException e){ 
            System.out.println("ActiviteDao.listeActivites(): " + e.getMessage());
            e.printStackTrace();
        }
        return liste;
    }
    
    public static ArrayList listeActiviteParticipant(Participant participant){
        ArrayList liste = new ArrayList();
        int noParticipant = participant.getNoPart();
        try{
            Connection con = ConnexionBase.get();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Activite JOIN PrendPart ON Activite.NoAct = PrendPart.NoAct WHERE noPart = " + noParticipant + ";");
            while(rs.next()){
                Activite activite = new Activite(rs.getInt("NoAct"), rs.getString("Libelle"));
                liste.add(activite);
            }
        }
        catch(SQLException e) {
            System.out.println("ActiviteDao.listeActiviteParticipant(): " + e.getMessage());
            e.printStackTrace();
        }
        return liste;
    }
    
    public static void supprimerActiviteParticipant(Participant participant, Activite activite){
        int noParticipant = participant.getNoPart();
        int noActivite = activite.getNoAct();
        try{
            Connection con = ConnexionBase.get();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM PrendPart WHERE noPart = " + noParticipant + " AND noAct = " + noActivite + ";");
        }
        catch(SQLException e) {
            System.out.println("ActiviteDao.supprimerActiviteParticipant(): " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static void ajouterActiviteParticipant(Participant participant, Activite activite){
        int noParticipant = participant.getNoPart();
        int noActivite = activite.getNoAct();
        try{
            Connection con = ConnexionBase.get();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO PrendPart (NoPart, NoAct) VALUES ('" + noParticipant + "', '" + noActivite + "');");
        }
        catch(SQLException e) {
            System.out.println("ActiviteDao.ajouterActiviteParticipant(): " + e.getMessage());
            e.printStackTrace();
        }
    }
}
