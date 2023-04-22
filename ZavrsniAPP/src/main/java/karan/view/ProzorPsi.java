/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package karan.view;

import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import karan.controller.ObradaPas;
import karan.controller.ObradaTransakcija;
import karan.controller.ObradaVrstaTransakcije;
import karan.model.Pas;
import karan.model.Transakcija;
import karan.model.VrstaTransakcije;
import karan.util.Aplikacija;
import karan.util.EdunovaException;

/**
 *
 * @author WinUSER
 */
public class ProzorPsi extends javax.swing.JFrame {
private ObradaPas obrada;
private ObradaTransakcija obradaTransakcija;

  private DecimalFormat df;
    /**
     * Creates new form ProzorPsi
     */
    public ProzorPsi() {
        initComponents();
        obrada = new ObradaPas();
        obradaTransakcija=new ObradaTransakcija();
         DecimalFormatSymbols dfs = 
                new DecimalFormatSymbols(
                        new Locale("hr", "HR"));
        df = new DecimalFormat("###,##0.00",dfs);
        setTitle(Aplikacija.NAZIV_APP + ": " + Aplikacija.OPERATER.getImePrezime() + ": Psi");
       
        ucitaj();
    }
    
    
    
     public void ucitaj(){
        DefaultListModel<Pas> m = 
                new DefaultListModel<>();
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
        lblCrtica1 = new javax.swing.JLabel();
        lblCrtica2 = new javax.swing.JLabel();
        lblCrtica3 = new javax.swing.JLabel();
        lblCrtica4 = new javax.swing.JLabel();
        chbMjesanac = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPol = new javax.swing.JTextField();
        txtKilaza = new javax.swing.JTextField();
        txtIme = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstTransakcijePasa = new javax.swing.JList<>();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstSveTransakcije = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        btnDodajTransakciju = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(89, 138, 224));
        jPanel1.setPreferredSize(new java.awt.Dimension(760, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCrtica1.setForeground(new java.awt.Color(255, 255, 255));
        lblCrtica1.setText("____________________________________________");
        jPanel1.add(lblCrtica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 214, -1));

        lblCrtica2.setForeground(new java.awt.Color(255, 255, 255));
        lblCrtica2.setText("____________________________________________");
        jPanel1.add(lblCrtica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 214, -1));

        lblCrtica3.setForeground(new java.awt.Color(255, 255, 255));
        lblCrtica3.setText("____________________________________________");
        jPanel1.add(lblCrtica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 214, -1));

        lblCrtica4.setForeground(new java.awt.Color(255, 255, 255));
        lblCrtica4.setText("____________________________________________");
        jPanel1.add(lblCrtica4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 214, 30));

        chbMjesanac.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chbMjesanac.setForeground(new java.awt.Color(255, 255, 255));
        chbMjesanac.setText("Mješanac");
        jPanel1.add(chbMjesanac, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ime");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 40, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pol");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 40, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dob");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 40, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kilaža");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 80, -1));

        txtPol.setBackground(new java.awt.Color(89, 138, 224));
        txtPol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPol.setForeground(new java.awt.Color(255, 255, 255));
        txtPol.setBorder(null);
        jPanel1.add(txtPol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 210, 30));

        txtKilaza.setBackground(new java.awt.Color(89, 138, 224));
        txtKilaza.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtKilaza.setForeground(new java.awt.Color(255, 255, 255));
        txtKilaza.setBorder(null);
        jPanel1.add(txtKilaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 210, 30));

        txtIme.setBackground(new java.awt.Color(89, 138, 224));
        txtIme.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIme.setForeground(new java.awt.Color(255, 255, 255));
        txtIme.setBorder(null);
        jPanel1.add(txtIme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 210, 30));

        txtDob.setBackground(new java.awt.Color(89, 138, 224));
        txtDob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDob.setForeground(new java.awt.Color(255, 255, 255));
        txtDob.setBorder(null);
        jPanel1.add(txtDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 210, 30));

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
        jPanel1.add(btnDodaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 90, 40));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 220, 140));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SVI PSI U APLIKACIJI");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lstTransakcijePasa.setForeground(new java.awt.Color(89, 138, 224));
        jScrollPane2.setViewportView(lstTransakcijePasa);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 440, 140));

        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUvjetKeyPressed(evt);
            }
        });
        jPanel1.add(txtUvjet, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 190, -1));

        btnTrazi.setText("🔍");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });
        jPanel1.add(btnTrazi, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 30, -1));

        lstSveTransakcije.setForeground(new java.awt.Color(89, 138, 224));
        jScrollPane3.setViewportView(lstSveTransakcije);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 430, 100));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("INFORMACIJE O IZABRANOM PSU");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        btnDodajTransakciju.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDodajTransakciju.setForeground(new java.awt.Color(89, 138, 224));
        btnDodajTransakciju.setText("^^");
        btnDodajTransakciju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajTransakcijuActionPerformed(evt);
            }
        });
        jPanel1.add(btnDodajTransakciju, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Pas());
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

    private void txtUvjetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ucitajTransakcije();
        }
    }//GEN-LAST:event_txtUvjetKeyPressed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        ucitajTransakcije();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void btnDodajTransakcijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajTransakcijuActionPerformed
        if(lstSveTransakcije.getSelectedValuesList()==null || lstSveTransakcije.getSelectedValuesList().isEmpty()){
            JOptionPane.showMessageDialog(getRootPane(), "Prvo pronađite transakciju");
            return;
        }
        
        if(lstTransakcijePasa.getModel()==null || !(lstTransakcijePasa.getModel() instanceof DefaultListModel<Transakcija>)){
            lstTransakcijePasa.setModel(new DefaultListModel<Transakcija>());
        }
        
       // DefaultListModel<Transakcija> m=(DefaultListModel<Transakcija>)lstTransakcijePasa.getModel();
       // m.addAll(lstSveTransakcije.getSelectedValuesList());
        DefaultListModel<Transakcija> m = 
                (DefaultListModel<Transakcija>) lstTransakcijePasa.getModel();
        
        DefaultListModel<Transakcija> t = 
                (DefaultListModel<Transakcija>) lstTransakcijePasa.getModel();
        boolean postoji;
        for(Transakcija tr : lstSveTransakcije.getSelectedValuesList()){
            postoji=false;
            for(int i=0;i<t.getSize();i++){
                if(tr.getSifra()==t.get(i).getSifra()){
                    postoji=true;
                    break;
                }
            }
            if(!postoji){
                 t.addElement(tr);
            }
        }
        lstTransakcijePasa.repaint();
        
        
        
        
    }//GEN-LAST:event_btnDodajTransakcijuActionPerformed

    
    public void ucitajTransakcije(){
        DefaultListModel<Transakcija> m=new DefaultListModel<>();
        m.addAll(obradaTransakcija.read(txtUvjet.getText().trim()));
        lstSveTransakcije.setModel(m);
        lstSveTransakcije.repaint();
        
    }
    
    public void napuniView(){
        var p = obrada.getEntitet();
        txtIme.setText(p.getIme());
        txtDob.setText(p.getDob());
        txtPol.setText(p.getPol());
         try {
            txtKilaza.setText(df.format(p.getKilaza()));
        } catch (Exception e) {
            txtKilaza.setText("");
        }
        chbMjesanac.setSelected(p.isMjesavina());
        
        DefaultListModel<Transakcija> m=new DefaultListModel<>();
        if(p.getTransakcije()!=null){
            m.addAll(p.getTransakcije());
        }
        lstTransakcijePasa.setModel(m);
        lstTransakcijePasa.repaint();
        
    }
    
    
    public void napuniModel(){
         var p = obrada.getEntitet();
        p.setIme(txtIme.getText());
        p.setDob(txtDob.getText());
        p.setPol(txtPol.getText());
         try {
            p.setKilaza(BigDecimal.valueOf(df.parse(txtKilaza.getText()).doubleValue()));
        } catch (Exception e) {
            p.setKilaza(BigDecimal.ZERO);
        }
          p.setMjesavina(chbMjesanac.isSelected());
          
          List<Transakcija> t = new ArrayList<>();
        try {
            DefaultListModel<Transakcija> m = (DefaultListModel<Transakcija>) lstTransakcijePasa.getModel();
            for(int i=0;i<m.getSize();i++){
                t.add(m.getElementAt(i));
            }
        } catch (Exception ex) {
            
        }
        p.setTransakcije(t);
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDodajTransakciju;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JCheckBox chbMjesanac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCrtica1;
    private javax.swing.JLabel lblCrtica2;
    private javax.swing.JLabel lblCrtica3;
    private javax.swing.JLabel lblCrtica4;
    private javax.swing.JList<Pas> lstPodaci;
    private javax.swing.JList<Transakcija> lstSveTransakcije;
    private javax.swing.JList<Transakcija> lstTransakcijePasa;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtKilaza;
    private javax.swing.JTextField txtPol;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables
}