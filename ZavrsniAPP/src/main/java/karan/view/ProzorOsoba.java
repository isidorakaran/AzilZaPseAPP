/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package karan.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import karan.controller.ObradaOsoba;
import karan.model.Osoba;
import karan.util.Aplikacija;
import karan.util.EdunovaException;

/**
 *
 * @author WinUSER
 */
public class ProzorOsoba extends javax.swing.JFrame {

    private ObradaOsoba obrada;

    /**
     * Creates new form ProzorOsoba
     */
    public ProzorOsoba() {
        initComponents();
        obrada = new ObradaOsoba();
        setTitle(Aplikacija.NAZIV_APP + ": " + Aplikacija.OPERATER.getImePrezime() + ": Osobe");
        ucitaj();
    }

    private void ucitaj() {

        DefaultListModel<Osoba> m = new DefaultListModel<>();
        m.addAll(obrada.read());
        lstPodaci.setModel(m);
        lstPodaci.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        lblBrTelefona = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        lblCrtica = new javax.swing.JLabel();
        lblCrtica1 = new javax.swing.JLabel();
        lblCrtica2 = new javax.swing.JLabel();
        lblCrtica3 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        lblIme = new javax.swing.JLabel();
        lblPrezime = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtBrTelefona = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(760, 600));

        jPanel1.setBackground(new java.awt.Color(89, 138, 224));
        jPanel1.setPreferredSize(new java.awt.Dimension(760, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstPodaci.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lstPodaci.setForeground(new java.awt.Color(89, 138, 224));
        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.setToolTipText("");
        lstPodaci.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstPodaci.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lstPodaci.setSelectionBackground(new java.awt.Color(89, 138, 224));
        lstPodaci.setSelectionForeground(new java.awt.Color(251, 225, 183));
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 270, 490));

        lblBrTelefona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBrTelefona.setForeground(new java.awt.Color(255, 255, 255));
        lblBrTelefona.setText("Broj telefona");
        jPanel1.add(lblBrTelefona, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 100, -1));

        txtIme.setBackground(new java.awt.Color(89, 138, 224));
        txtIme.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIme.setForeground(new java.awt.Color(255, 255, 255));
        txtIme.setBorder(null);
        jPanel1.add(txtIme, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 230, 30));

        lblCrtica.setForeground(new java.awt.Color(255, 255, 255));
        lblCrtica.setText("____________________________________________");
        jPanel1.add(lblCrtica, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 214, -1));

        lblCrtica1.setForeground(new java.awt.Color(255, 255, 255));
        lblCrtica1.setText("____________________________________________");
        jPanel1.add(lblCrtica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 214, -1));

        lblCrtica2.setForeground(new java.awt.Color(255, 255, 255));
        lblCrtica2.setText("____________________________________________");
        jPanel1.add(lblCrtica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 214, -1));

        lblCrtica3.setForeground(new java.awt.Color(255, 255, 255));
        lblCrtica3.setText("____________________________________________");
        jPanel1.add(lblCrtica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 214, -1));

        txtPrezime.setBackground(new java.awt.Color(89, 138, 224));
        txtPrezime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrezime.setForeground(new java.awt.Color(255, 255, 255));
        txtPrezime.setBorder(null);
        txtPrezime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrezimeActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrezime, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 220, 30));

        lblIme.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIme.setForeground(new java.awt.Color(255, 255, 255));
        lblIme.setText("Ime");
        jPanel1.add(lblIme, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 37, -1));

        lblPrezime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrezime.setForeground(new java.awt.Color(255, 255, 255));
        lblPrezime.setText("Prezime");
        jPanel1.add(lblPrezime, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 60, -1));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("E-mail");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 60, -1));

        txtEmail.setBackground(new java.awt.Color(89, 138, 224));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 210, 30));

        txtBrTelefona.setBackground(new java.awt.Color(89, 138, 224));
        txtBrTelefona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBrTelefona.setForeground(new java.awt.Color(255, 255, 255));
        txtBrTelefona.setBorder(null);
        jPanel1.add(txtBrTelefona, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 210, 30));

        btnDodaj.setBackground(new java.awt.Color(89, 138, 224));
        btnDodaj.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDodaj.setForeground(new java.awt.Color(255, 255, 255));
        btnDodaj.setText("DODAJ");
        btnDodaj.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });
        jPanel1.add(btnDodaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/White_paw_print.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 500, 450));

        btnPromjeni.setBackground(new java.awt.Color(89, 138, 224));
        btnPromjeni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPromjeni.setForeground(new java.awt.Color(255, 255, 255));
        btnPromjeni.setText("PROMJENI");
        btnPromjeni.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });
        jPanel1.add(btnPromjeni, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 100, 40));

        btnObrisi.setBackground(new java.awt.Color(89, 138, 224));
        btnObrisi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnObrisi.setForeground(new java.awt.Color(255, 255, 255));
        btnObrisi.setText("OBRIŠI");
        btnObrisi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });
        jPanel1.add(btnObrisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 160, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("OSOBE U APLIKACIJI");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Osoba());
        napuniModel();
        try {
            obrada.create();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        if (lstPodaci.getSelectedValue() == null) {
            return;
        }
        obrada.setEntitet(lstPodaci.getSelectedValue());
        napuniView();
    }//GEN-LAST:event_lstPodaciValueChanged

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
          if(lstPodaci.getSelectedValue()==null){
              JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite osobu.");
              return;
          }
          napuniModel();
          
          try {
            obrada.update();
              ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        if(lstPodaci.getSelectedValue()==null){
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite osobu.");
            return;
        }
        if(JOptionPane.showConfirmDialog(getRootPane(), "Sigurno obrisati " + obrada.getEntitet().getIme() +"?",
                "Brisanje ",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION){
            return;
        }
        
        try {
            obrada.delete();
            ucitaj();
            
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
        
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtPrezimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrezimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrezimeActionPerformed

    private void napuniView() {
        var o = obrada.getEntitet();

        txtIme.setText(o.getIme());
        txtPrezime.setText(o.getPrezime());
        txtEmail.setText(o.getEmail());
        txtBrTelefona.setText(o.getBrojTelefona());

    }

    private void napuniModel() {
        var o = obrada.getEntitet();
        o.setIme(txtIme.getText());
        o.setPrezime(txtPrezime.getText());
        o.setEmail(txtEmail.getText());
        o.setBrojTelefona(txtBrTelefona.getText());
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBrTelefona;
    private javax.swing.JLabel lblCrtica;
    private javax.swing.JLabel lblCrtica1;
    private javax.swing.JLabel lblCrtica2;
    private javax.swing.JLabel lblCrtica3;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIme;
    private javax.swing.JLabel lblPrezime;
    private javax.swing.JList<Osoba> lstPodaci;
    private javax.swing.JTextField txtBrTelefona;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables

}
