package presentation;

import metier.*;
import domaine.*;

/**
 * 634.1 Programmation - TP P02
 *
 * Fenêtre principale de l'application de gestion des activités
 *
 * @author RODRIGUEZ-VELDHUIS Thomas
 */
public class FrmMain extends java.awt.Frame {
    
  private ListeParticipants listeParticipants; // Modèle : listeParticipants; Vue : lstPart
  private ListeActivites listeActivites; // Modèle : listeActivites; Vue : lstActProposees
  private ListeActivites listeActivitesParticipant; // Modèle : listeActivitesParticipant; Vue : lstActChoisies
  
  /** Constructeur */
  public FrmMain () {
    initComponents();
    listParticipants();
    listActivites();
  } // Constructeur
  
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblListePart = new java.awt.Label();
        lstPart = new java.awt.List();
        lblPartCourant = new java.awt.Label();
        lblNom = new java.awt.Label();
        tfNom = new java.awt.TextField();
        lblPrenom = new java.awt.Label();
        tfPrenom = new java.awt.TextField();
        lblTelephone = new java.awt.Label();
        tfTel = new java.awt.TextField();
        lblActChoisies = new java.awt.Label();
        lstActChoisies = new java.awt.List();
        lblActProposees = new java.awt.Label();
        lstActProposees = new java.awt.List();
        btnSupprimer = new java.awt.Button();
        btnAjouter = new java.awt.Button();

        setResizable(false);
        setTitle("Gestion des activités");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblListePart.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblListePart.setText("Liste des participants");

        lstPart.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lstPartItemStateChanged(evt);
            }
        });

        lblPartCourant.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblPartCourant.setText("Participant courant");

        lblNom.setText("Nom");

        lblPrenom.setText("Prénom");

        lblTelephone.setText("Téléphone");

        lblActChoisies.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblActChoisies.setText("Activités choisies");

        lstActChoisies.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lstActChoisiesItemStateChanged(evt);
            }
        });

        lblActProposees.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblActProposees.setText("Activités proposées");

        lstActProposees.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lstActProposeesItemStateChanged(evt);
            }
        });

        btnSupprimer.setEnabled(false);
        btnSupprimer.setLabel("Supprimer l'activité");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        btnAjouter.setEnabled(false);
        btnAjouter.setLabel("Ajouter l'activité");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblListePart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lstPart, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPartCourant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblActChoisies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lstActChoisies, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfPrenom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfNom, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                    .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblActProposees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(263, 263, 263))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lstActProposees, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblListePart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(lstPart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPartCourant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addComponent(lblActChoisies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(lstActChoisies, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblActProposees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(lstActProposees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  /* Terminaison de l'application */
  private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    System.exit(0);
  }//GEN-LAST:event_formWindowClosing

    private void lstPartItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lstPartItemStateChanged
        if(lstPart.getSelectedIndexes().length > 0 ){
            int index = lstPart.getSelectedIndex();
            tfNom.setText(listeParticipants.get(index).getNom());
            tfPrenom.setText(listeParticipants.get(index).getPrenom());
            tfTel.setText(listeParticipants.get(index).getTelephone());
            listActivitesParticipant(listeParticipants.get(index));
        } else {
            tfNom.setText(null);
            tfPrenom.setText(null);
            tfTel.setText(null);
        }
        if(lstActChoisies.getSelectedIndexes().length > 0 )btnSupprimer.setEnabled(true); 
        else btnSupprimer.setEnabled(false);
    }//GEN-LAST:event_lstPartItemStateChanged

    private void lstActChoisiesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lstActChoisiesItemStateChanged
        btnSupprimer.setEnabled(lstActChoisies.getSelectedIndexes().length > 0);
    }//GEN-LAST:event_lstActChoisiesItemStateChanged

    private void lstActProposeesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lstActProposeesItemStateChanged
        if(lstActProposees.getSelectedIndexes().length > 0){ 
            btnAjouter.setEnabled(true);
            for(int i = 0; i < listeActivitesParticipant.size(); i++){
                Activite activite = listeActivites.get(lstActProposees.getSelectedIndex());
                if(listeActivitesParticipant.get(i).equals(activite)) btnAjouter.setEnabled(false);
            }
        } 
    }//GEN-LAST:event_lstActProposeesItemStateChanged

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        Activite activite = listeActivitesParticipant.get(lstActChoisies.getSelectedIndex());
        Participant participant = listeParticipants.get(lstPart.getSelectedIndex());
        listeActivitesParticipant.remove(participant, activite);
        listActivitesParticipant(participant);
        btnSupprimer.setEnabled(false);
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        Activite activite = listeActivites.get(lstActProposees.getSelectedIndex());
        Participant participant = listeParticipants.get(lstPart.getSelectedIndex());
        listeActivitesParticipant.add(participant, activite);
        listActivitesParticipant(participant);
        btnAjouter.setEnabled(false);
    }//GEN-LAST:event_btnAjouterActionPerformed

    
    private void listParticipants(){
      listeParticipants = new ListeParticipants();
      for (int i = 0; i < listeParticipants.size(); i++){
          lstPart.add(listeParticipants.get(i).toString());
      }
    }
  
    private void listActivites(){
        listeActivites = new ListeActivites();
        for (int i = 0; i < listeActivites.size(); i++){
            lstActProposees.add(listeActivites.get(i).toString());
        }
    }
  
    private void listActivitesParticipant(Participant participant){
        listeActivitesParticipant = new ListeActivites(participant);
        lstActChoisies.removeAll();
        for (int i = 0; i < listeActivitesParticipant.size(); i++){
            lstActChoisies.add(listeActivitesParticipant.get(i).toString());
      }
      
  }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAjouter;
    private java.awt.Button btnSupprimer;
    private java.awt.Label lblActChoisies;
    private java.awt.Label lblActProposees;
    private java.awt.Label lblListePart;
    private java.awt.Label lblNom;
    private java.awt.Label lblPartCourant;
    private java.awt.Label lblPrenom;
    private java.awt.Label lblTelephone;
    private java.awt.List lstActChoisies;
    private java.awt.List lstActProposees;
    private java.awt.List lstPart;
    private java.awt.TextField tfNom;
    private java.awt.TextField tfPrenom;
    private java.awt.TextField tfTel;
    // End of variables declaration//GEN-END:variables

} // FrmMain
