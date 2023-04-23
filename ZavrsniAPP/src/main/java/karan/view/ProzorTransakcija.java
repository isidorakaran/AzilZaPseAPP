/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package karan.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.TimePickerSettings;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import karan.controller.ObradaOsoba;
import karan.controller.ObradaTransakcija;
import karan.controller.ObradaVrstaTransakcije;
import karan.model.Osoba;
import karan.model.Transakcija;
import karan.model.VrstaTransakcije;
import karan.util.Aplikacija;
import karan.util.EdunovaException;

/**
 *
 * @author WinUSER
 */
public class ProzorTransakcija extends javax.swing.JFrame {
    
    private ObradaTransakcija obrada;

    /**
     * Creates new form ProzorTransakcija
     */
    public ProzorTransakcija() {
        initComponents();
        obrada=new ObradaTransakcija();
         setTitle(Aplikacija.NAZIV_APP + ": " + Aplikacija.OPERATER.getImePrezime() + ": Razmjene");
          
         ucitajFilterVrste();
         ucitajVrsteTransakcije();
         ucitajOsobe();
         definirajDatum();
        ucitaj();
    }
    
    private void ucitaj(){
         DefaultListModel<Transakcija> m = new DefaultListModel<>();
        m.addAll(obrada.read((VrstaTransakcije)cmbFilterVrste.getSelectedItem()));
        lstPodaci.setModel(m);
        lstPodaci.repaint();
    }
    
    private void definirajDatum(){
         DatePickerSettings dps = 
                new DatePickerSettings(new Locale("hr","HR"));
       dps.setFormatForDatesCommonEra("dd. MM. YYYY.");
       dps.setTranslationClear("Očisti");
       dps.setTranslationToday("Danas");
   dtpDatum.datePicker.setSettings(dps);
       
       
        TimePickerSettings tps = new TimePickerSettings(new Locale("hr","HR"));
        tps.setFormatForDisplayTime("HH:mm");
      
        dtpDatum.timePicker
                .getSettings()
         
               .use24HourClockFormat();
        
        ArrayList<LocalTime> lista = new ArrayList<>();
        
        for(int j=0;j<24;j++){
        for(int i=0;i<60;i+=5){
            lista.add(LocalTime.of(j, i));
        }
        }
        
        
        dtpDatum.timePicker.getSettings()
                .generatePotentialMenuTimes(lista);
        
    }
    
    private void ucitajVrsteTransakcije(){
        DefaultComboBoxModel<VrstaTransakcije> m=new DefaultComboBoxModel<>();
         VrstaTransakcije vt= new VrstaTransakcije();
         vt.setSifra(0);
         vt.setNaziv("Nije odabrano");
         m.addElement(vt);
        m.addAll(new ObradaVrstaTransakcije().read());
        cmbVrstaTransakcije.setModel(m);
        cmbVrstaTransakcije.repaint();
    }
    
    private void ucitajOsobe(){
         DefaultComboBoxModel<Osoba> m=new DefaultComboBoxModel<>();
         Osoba o= new Osoba();
         o.setSifra(0);
         o.setIme("Nije ");
         o.setPrezime("odabrano");
         m.addElement(o);
        m.addAll(new ObradaOsoba().read());
        cmbOsobe.setModel(m);
        cmbOsobe.repaint();
    }
    private void ucitajFilterVrste(){
        DefaultComboBoxModel<VrstaTransakcije> m=new DefaultComboBoxModel<>();
        m.addAll(new ObradaVrstaTransakcije().read());
        cmbFilterVrste.setModel(m);
        cmbFilterVrste.repaint();
        cmbFilterVrste.setSelectedIndex(0);
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
        txtOpis = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNapomena = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dtpDatum = new com.github.lgooddatepicker.components.DateTimePicker();
        cmbOsobe = new javax.swing.JComboBox<>();
        cmbVrstaTransakcije = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        cmbFilterVrste = new javax.swing.JComboBox<>();
        btnDodaj = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(760, 600));

        jPanel1.setBackground(new java.awt.Color(89, 138, 224));
        jPanel1.setPreferredSize(new java.awt.Dimension(760, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Opis");
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 21, 54, -1));

        txtOpis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtOpis.setForeground(new java.awt.Color(89, 138, 224));
        txtOpis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOpisActionPerformed(evt);
            }
        });
        jPanel1.add(txtOpis, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 52, 236, 55));

        jLabel2.setText("Napomena");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 138, -1, -1));

        txtNapomena.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNapomena.setForeground(new java.awt.Color(89, 138, 224));
        txtNapomena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNapomenaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNapomena, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 172, 236, 54));

        jLabel3.setText("Datum");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 79, -1));
        jPanel1.add(dtpDatum, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 236, -1));

        jPanel1.add(cmbOsobe, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 236, -1));

        jPanel1.add(cmbVrstaTransakcije, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 236, -1));

        lstPodaci.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstPodaci.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lstPodaci.setForeground(new java.awt.Color(89, 138, 224));
        lstPodaci.setSelectionBackground(new java.awt.Color(89, 138, 224));
        lstPodaci.setSelectionForeground(new java.awt.Color(251, 225, 183));
        lstPodaci.setToolTipText("");
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 92, 270, 467));

        cmbFilterVrste.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFilterVrsteItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbFilterVrste, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 52, 270, -1));

        btnDodaj.setText("Dodaj");
        btnDodaj.setBackground(new java.awt.Color(89, 138, 224));
        btnDodaj.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDodaj.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDodaj.setForeground(new java.awt.Color(255, 255, 255));
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });
        jPanel1.add(btnDodaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 78, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vrsta razmjene");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 149, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Osobe");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 103, 35));

        btnPromjeni.setBackground(new java.awt.Color(89, 138, 224));
        btnPromjeni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPromjeni.setForeground(new java.awt.Color(255, 255, 255));
        btnPromjeni.setText("Promjeni");
        btnPromjeni.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });
        jPanel1.add(btnPromjeni, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        btnObrisi.setBackground(new java.awt.Color(89, 138, 224));
        btnObrisi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnObrisi.setForeground(new java.awt.Color(255, 255, 255));
        btnObrisi.setText("Obriši");
        btnObrisi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });
        jPanel1.add(btnObrisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtOpisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOpisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOpisActionPerformed

    private void txtNapomenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNapomenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNapomenaActionPerformed

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

    private void cmbFilterVrsteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFilterVrsteItemStateChanged
        ucitaj();
    }//GEN-LAST:event_cmbFilterVrsteItemStateChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
       obrada.setEntitet(new Transakcija());
       napuniModel();
        try {
            obrada.create();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getParent(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
       if(lstPodaci.getSelectedValue()==null){
              JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite razmjenu");
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
            JOptionPane.showMessageDialog(
                    getRootPane(), 
                    "Prvo odaberite razmjenu");
            return;
        }
        
        if(JOptionPane.showConfirmDialog(
                getRootPane(),
                "Sigurno obrisati " + obrada.getEntitet().getOpis() + "?",
                "Brisanje",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE)==JOptionPane.NO_OPTION){
            return;
        }
        
        try {
            obrada.delete();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(
                    getRootPane(),
                    ex.getPoruka());
        }
        
    }//GEN-LAST:event_btnObrisiActionPerformed

   private void napuniView(){
       
       var e=obrada.getEntitet();
       txtOpis.setText(e.getOpis());
       txtNapomena.setText(e.getNapomena());
       cmbVrstaTransakcije.setSelectedItem(e.getVrstaTransakcije());
       if(e.getOsoba()!=null){
           cmbOsobe.setSelectedItem(e.getOsoba());
       }else{
           cmbOsobe.setSelectedIndex(0);
       }
       if(e.getDatum()!=null){
             LocalDate ld = e.getDatum()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        dtpDatum.datePicker.setDate(ld);
        }else{
            dtpDatum.datePicker.setDate(null);
        }
       
   }

   private void napuniModel(){
        var t = obrada.getEntitet();
        t.setOpis(txtOpis.getText());
        t.setNapomena(txtNapomena.getText());
        t.setOsoba((Osoba) cmbOsobe.getSelectedItem());
        t.setVrstaTransakcije((VrstaTransakcije) cmbVrstaTransakcije.getSelectedItem());
        
        LocalDate ld = dtpDatum.datePicker.getDate();
 
        LocalTime lt = dtpDatum.timePicker.getTime();
   
         LocalDateTime fromDateAndTime = LocalDateTime.of(ld,
                                                           lt);
        
        Date datum = Date.from(fromDateAndTime.atZone(ZoneId.systemDefault()).toInstant());
        
        
        t.setDatum(datum);
       
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JComboBox<VrstaTransakcije> cmbFilterVrste;
    private javax.swing.JComboBox<Osoba> cmbOsobe;
    private javax.swing.JComboBox<VrstaTransakcije> cmbVrstaTransakcije;
    private com.github.lgooddatepicker.components.DateTimePicker dtpDatum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Transakcija> lstPodaci;
    private javax.swing.JTextField txtNapomena;
    private javax.swing.JTextField txtOpis;
    // End of variables declaration//GEN-END:variables
}
