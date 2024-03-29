package MenueGUI;

import SitesGUI.DisplaySites;
import SitesGUI.SearchSites;
import SitesGUI.NewSite;
import UsersGUI.NewUser;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Models.User.User;
import UsersGUI.FirstFrame_Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class MainMenue_Admin extends javax.swing.JFrame {

    User current_User;

    /**
     * Creates new form MainHere
     */
    public MainMenue_Admin() {
        initComponents();
    }

    public MainMenue_Admin(User current_User) {
        initComponents();
        this.current_User = current_User;
        UserInfo_Label.setText(current_User.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        SearchSites_Button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        NouveauSite_Button = new javax.swing.JButton();
        AllSites_Button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MyProfile_Button = new javax.swing.JButton();
        CreateProfile_Button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        UserInfo_Label = new javax.swing.JLabel();
        Logout_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 3, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tout les Sites");

        SearchSites_Button.setFont(new java.awt.Font("Gloss And Bloom", 3, 18)); // NOI18N
        SearchSites_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        SearchSites_Button.setText("Search");
        SearchSites_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchSites_ButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 3, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nouveau Site");

        NouveauSite_Button.setFont(new java.awt.Font("Gloss And Bloom", 3, 18)); // NOI18N
        NouveauSite_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/addrug.png"))); // NOI18N
        NouveauSite_Button.setText("Nouveau");
        NouveauSite_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NouveauSite_ButtonActionPerformed(evt);
            }
        });

        AllSites_Button.setFont(new java.awt.Font("Gloss And Bloom", 3, 18)); // NOI18N
        AllSites_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        AllSites_Button.setText("Tout les Sites");
        AllSites_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllSites_ButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 3, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Search Site");

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 3, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mon Profile");

        MyProfile_Button.setFont(new java.awt.Font("Gloss And Bloom", 3, 18)); // NOI18N
        MyProfile_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/addrug.png"))); // NOI18N
        MyProfile_Button.setText("Mon Profile");
        MyProfile_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyProfile_ButtonActionPerformed(evt);
            }
        });

        CreateProfile_Button.setFont(new java.awt.Font("Gloss And Bloom", 3, 18)); // NOI18N
        CreateProfile_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/addrug.png"))); // NOI18N
        CreateProfile_Button.setText("Creer Profile");
        CreateProfile_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateProfile_ButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 3, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Creer un Profile");

        Logout_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/login.png"))); // NOI18N
        Logout_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4)
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SearchSites_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CreateProfile_Button)
                                    .addComponent(MyProfile_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AllSites_Button)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(NouveauSite_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserInfo_Label)))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Logout_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(UserInfo_Label)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchSites_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllSites_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NouveauSite_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MyProfile_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(CreateProfile_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Logout_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NouveauSite_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NouveauSite_ButtonActionPerformed
        // TODO add your handling code here:
        NouveauSite_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    new NewSite(current_User).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MainMenue_Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

    }//GEN-LAST:event_NouveauSite_ButtonActionPerformed

    private void SearchSites_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchSites_ButtonActionPerformed
        // TODO add your handling code here:

        SearchSites_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
                new SearchSites(current_User).setVisible(true);

            }
        });

    }//GEN-LAST:event_SearchSites_ButtonActionPerformed

    private void AllSites_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllSites_ButtonActionPerformed

        AllSites_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    dispose();
                    new DisplaySites(current_User).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MainMenue_Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }//GEN-LAST:event_AllSites_ButtonActionPerformed

    private void MyProfile_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyProfile_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MyProfile_ButtonActionPerformed

    private void CreateProfile_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateProfile_ButtonActionPerformed
        // TODO add your handling code here:

        CreateProfile_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
                new NewUser(current_User).setVisible(true);

            }
        });

    }//GEN-LAST:event_CreateProfile_ButtonActionPerformed

    private void Logout_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_ButtonActionPerformed
        // TODO add your handling code here:
        Logout_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
                new FirstFrame_Login().setVisible(true);

            }
        });
    }//GEN-LAST:event_Logout_ButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenue_Normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenue_Normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenue_Normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenue_Normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenue_Normal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllSites_Button;
    private javax.swing.JButton CreateProfile_Button;
    private javax.swing.JButton Logout_Button;
    private javax.swing.JButton MyProfile_Button;
    private javax.swing.JButton NouveauSite_Button;
    private javax.swing.JButton SearchSites_Button;
    private javax.swing.JLabel UserInfo_Label;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
