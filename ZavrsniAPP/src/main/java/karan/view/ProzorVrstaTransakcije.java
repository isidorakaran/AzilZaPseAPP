/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package karan.view;

import javax.swing.JOptionPane;
import karan.controller.ObradaVrstaTransakcije;
import karan.model.VrstaTransakcije;
import karan.util.EdunovaException;

/**
 *
 * @author WinUSER
 */
public class ProzorVrstaTransakcije extends javax.swing.JFrame {

    private ObradaVrstaTransakcije obrada;

    /**
     * Creates new form ProzorVrstaTransakcije
     */
    public ProzorVrstaTransakcije() {
        initComponents();
        obrada = new ObradaVrstaTransakcije();
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
        jLabel1 = new javax.swing.JLabel();
        txtVrstaTransakcije = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbUlazIzlaz = new javax.swing.JComboBox<>();
        btnDodaj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(89, 138, 224));
        jPanel1.setPreferredSize(new java.awt.Dimension(760, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/White_paw_print.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 6, 285, 625));

        txtVrstaTransakcije.setBackground(new java.awt.Color(89, 138, 224));
        txtVrstaTransakcije.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtVrstaTransakcije.setForeground(new java.awt.Color(255, 255, 255));
        txtVrstaTransakcije.setBorder(null);
        jPanel1.add(txtVrstaTransakcije, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 280, 40));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("____________________________________________________________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vrsta razmjene:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        cmbUlazIzlaz.setBackground(new java.awt.Color(89, 138, 224));
        cmbUlazIzlaz.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbUlazIzlaz.setForeground(new java.awt.Color(255, 255, 255));
        cmbUlazIzlaz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unutar azila", "Van azila" }));
        cmbUlazIzlaz.setBorder(null);
        jPanel1.add(cmbUlazIzlaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 290, -1));

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
        jPanel1.add(btnDodaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 140, 30));

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

        obrada.setEntitet(new VrstaTransakcije());
        napuniModel();
        try {
            obrada.create();

        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }

        obrada.setEntitet(new VrstaTransakcije());
        napuniModel();
       
    }//GEN-LAST:event_btnDodajActionPerformed

    /**
     * @param args the command line arguments
     */
    private void napuniModel() {
        var vt = obrada.getEntitet();
        vt.setNaziv(txtVrstaTransakcije.getText());
         int predznak = 0;

        if (((String) cmbUlazIzlaz.getSelectedItem()).equals("Unutar azila")) {
            predznak = 1;
        } else {
            predznak = -1;
        }
        vt.setPredznak(predznak);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JComboBox<String> cmbUlazIzlaz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtVrstaTransakcije;
    // End of variables declaration//GEN-END:variables
}