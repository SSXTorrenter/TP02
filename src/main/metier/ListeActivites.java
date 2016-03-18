package main.metier;

import main.base.ActiviteDao;
import main.domaine.*;
import java.util.*;

/**
 * 634.1 Programmation - TP P02
 * 
 * @author RODRIGUEZ-VELDHUIS Thomas
 * @version 1.0
*/
public class ListeActivites {
    ArrayList liste;
    
    public ListeActivites(){ liste = ActiviteDao.listeActivites(); }
    
    public ListeActivites(Participant participant){ liste = ActiviteDao.listeActiviteParticipant(participant); }
    
    public int size() { return this.liste.size();}
    
    public void remove(Participant participant, Activite activite){ ActiviteDao.supprimerActiviteParticipant(participant, activite); }
    
    public void add(Participant participant, Activite activite){ ActiviteDao.ajouterActiviteParticipant(participant, activite); }
    
    public Activite get(int pos) { return (Activite)this.liste.get(pos); }
}
