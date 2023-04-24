/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package karan.view;

import java.io.File;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import karan.util.Aplikacija;

/**
 *
 * @author WinUSER
 */
public class ProzorIzbornik extends javax.swing.JFrame {

    /**
     * Creates new form ProzorIzbornik
     */
    public ProzorIzbornik() {
        initComponents();
        setTitle(Aplikacija.NAZIV_APP + ": " + Aplikacija.OPERATER.getImePrezime());
        showImage(broj);
        pokreniSat();
        setIcon();

    }

    //int broj = 0;
    int broj = 0;
    public String[] getImages() {
        
        File file = new File(getClass().getResource("/karan/util/images").getFile());

        String[] imagesList = file.list();

        return imagesList;
    }

    public void showImage(int index)
    {
        String[] imagesList = getImages();

        String imageName = imagesList[index];

        ImageIcon icon = new ImageIcon(getClass().getResource("/karan/util/images/"+imageName));

        Image image = icon.getImage().getScaledInstance(lblSlike.getWidth(), lblSlike.getHeight(), Image.SCALE_SMOOTH);

        lblSlike.setIcon(new ImageIcon(image));
    }

    private void pokreniSat() {
        new Vrijeme().start();
    }

    private class Vrijeme extends Thread {

        private SimpleDateFormat df = new SimpleDateFormat();

        public Vrijeme() {
            df = new SimpleDateFormat("dd.MM.YYY hh:mm:ss");
        }

        @Override
        public void run() {
            while (true) {
                lblVrijeme.setText(df.format(new Date()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }
        }

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
        jToolBar1 = new javax.swing.JToolBar();
        lblVrijeme = new javax.swing.JLabel();
        lblSlike = new javax.swing.JLabel();
        btnPrvaSlika = new javax.swing.JButton();
        btnSljedeca = new javax.swing.JButton();
        btnPretkodna = new javax.swing.JButton();
        btnPosljednja = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(89, 138, 224));
        jPanel1.setMinimumSize(new java.awt.Dimension(760, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(760, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setBackground(new java.awt.Color(89, 138, 224));
        jToolBar1.setBorder(null);
        jToolBar1.setRollover(true);

        lblVrijeme.setForeground(new java.awt.Color(255, 255, 255));
        lblVrijeme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.png"))); // NOI18N
        lblVrijeme.setToolTipText("");
        jToolBar1.add(lblVrijeme);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 570, 790, 30));
        jPanel1.add(lblSlike, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 390, 400));

        btnPrvaSlika.setText("Prva slika");
        btnPrvaSlika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrvaSlikaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrvaSlika, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        btnSljedeca.setText("Sljedeća");
        btnSljedeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSljedecaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSljedeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, -1, -1));

        btnPretkodna.setText("Prethodna");
        btnPretkodna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretkodnaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPretkodna, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));

        btnPosljednja.setText("Posljednja slika");
        btnPosljednja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosljednjaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPosljednja, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(89, 138, 224));
        jLabel3.setText("FOTO ALBUM");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/okvir4.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 20, 680, 530));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(89, 138, 224));
        jLabel4.setText("GIT");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jLabel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel4KeyPressed(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/White_paw_print.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 310, 420));

        jMenuBar1.setBackground(new java.awt.Color(89, 138, 224));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setOpaque(true);

        jMenu1.setText("Programi");

        jMenuItem1.setText("Psi");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Osobe");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Razmjena");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Vrsta razmjene");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Aplikacija");

        jMenuItem5.setText("O nama");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Izlaz");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new ProzorOsoba().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new ProzorVrstaTransakcije().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new ProzorTransakcija().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        JOptionPane.showMessageDialog(getRootPane(), "Dobrodošli u aplikaciju Azil za pse!\n" + "\n"
        +"Ovdje ćete pronaći sve podatke o osobama koje su učestvovale u razmjenama, \n" + "\n"
                + "sve informacije o psima, sve razmjene uz mogućnost kreiranja nove vrste razmjene.\n"
        +"\n" + "Aplikacija omogućava i unos, brisanje i promjenu postojećih podataka.");
           
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new ProzorPsi().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnPrvaSlikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrvaSlikaActionPerformed
       broj=0;
        showImage(broj);
    }//GEN-LAST:event_btnPrvaSlikaActionPerformed

    private void btnPretkodnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretkodnaActionPerformed
      broj=broj-1;
      if(broj<0){
          broj=0;
      }
        showImage(broj);
    }//GEN-LAST:event_btnPretkodnaActionPerformed

    private void btnSljedecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSljedecaActionPerformed
        broj=broj+1;
      if(broj>=getImages().length){
          broj=getImages().length-1;
      }
        showImage(broj);
    }//GEN-LAST:event_btnSljedecaActionPerformed

    private void btnPosljednjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosljednjaActionPerformed
        broj=getImages().length-1;
        showImage(broj);
    }//GEN-LAST:event_btnPosljednjaActionPerformed

    private void jLabel4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4KeyPressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        try {
            ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "explorer https://github.com/isidorakaran");
            builder.redirectErrorStream(true);
            Process p = builder.start();
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jLabel4MouseClicked
    private void setIcon() {

        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon.png")));
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPosljednja;
    private javax.swing.JButton btnPretkodna;
    private javax.swing.JButton btnPrvaSlika;
    private javax.swing.JButton btnSljedeca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblSlike;
    private javax.swing.JLabel lblVrijeme;
    // End of variables declaration//GEN-END:variables
}
