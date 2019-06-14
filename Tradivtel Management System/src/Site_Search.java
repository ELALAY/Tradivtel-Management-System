
import Models.Site;
import Models.SiteCollection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class Site_Search extends javax.swing.JFrame {

    private Site current_site;

    /**
     * Creates new form SiteInfo
     */
    public Site_Search() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        Main_Title_Label = new javax.swing.JLabel();
        Code_Site_TextField = new javax.swing.JTextField();
        Code_Site_Label = new javax.swing.JLabel();
        Adress_Label = new javax.swing.JLabel();
        Adress_TextField = new javax.swing.JTextField();
        Longitude_Label = new javax.swing.JLabel();
        Longitude_TextField = new javax.swing.JTextField();
        Latitude_Label = new javax.swing.JLabel();
        Latitude_TextField = new javax.swing.JTextField();
        Client_Lable = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Client_TextFlied = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Code_Site_Label2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        Farend_Label = new javax.swing.JLabel();
        Farend__TextFlied = new javax.swing.JTextField();
        Azimut_Label = new javax.swing.JLabel();
        Azimut_TextFlied = new javax.swing.JTextField();
        Save_Button = new javax.swing.JButton();
        Clear_Button = new javax.swing.JButton();
        Adress_Label1 = new javax.swing.JLabel();
        Adress_TextField1 = new javax.swing.JTextField();
        Metrage_label = new javax.swing.JLabel();
        Metrage_TextFlied = new javax.swing.JTextField();
        Dislay_Button = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main_Title_Label.setFont(new java.awt.Font("Gill Sans MT", 3, 24)); // NOI18N
        Main_Title_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Main_Title_Label.setText("Informations Relatives au Site");
        Main_Title_Label.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        Code_Site_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Code_Site_TextFieldActionPerformed(evt);
            }
        });

        Code_Site_Label.setText("Code du Site");

        Adress_Label.setText("Ville");

        Longitude_Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Longitude_Label.setText("Longitude");

        Latitude_Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Latitude_Label.setText("Latitude");

        Client_Lable.setText("Client");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Client_TextFlied.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Client_TextFliedActionPerformed(evt);
            }
        });

        jLabel5.setText("Type de Site");

        Code_Site_Label2.setText("Technology");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        Farend_Label.setText("Farend");

        Azimut_Label.setText("Azimut");

        Save_Button.setText("Enregistrer");

        Clear_Button.setText("Effacer");

        Adress_Label1.setText("Adress");

        Metrage_label.setText("Metrage");

        Dislay_Button.setText("Display");
        Dislay_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dislay_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Azimut_Label)
                        .addGap(403, 403, 403))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Code_Site_Label)
                            .addComponent(Adress_Label)
                            .addComponent(jLabel5)
                            .addComponent(Adress_Label1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Save_Button)
                                        .addGap(18, 18, 18)
                                        .addComponent(Clear_Button)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Dislay_Button)
                                        .addGap(61, 61, 61))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Adress_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Code_Site_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Adress_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(47, 47, 47)
                                                        .addComponent(Client_Lable))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(45, 45, 45)
                                                        .addComponent(Longitude_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(Client_TextFlied, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                    .addComponent(Longitude_TextField)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Latitude_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Code_Site_Label2)
                                                    .addComponent(Farend_Label)
                                                    .addComponent(Metrage_label))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Latitude_TextField)
                                                    .addComponent(jComboBox2, 0, 140, Short.MAX_VALUE)
                                                    .addComponent(Farend__TextFlied))))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Azimut_TextFlied, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Main_Title_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Metrage_TextFlied, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Main_Title_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Code_Site_Label)
                    .addComponent(Client_Lable)
                    .addComponent(Client_TextFlied, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Code_Site_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Longitude_Label)
                    .addComponent(Longitude_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Adress_TextField1)
                    .addComponent(Adress_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Latitude_Label)
                    .addComponent(Latitude_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Adress_TextField)
                    .addComponent(Adress_Label1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Code_Site_Label2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Azimut_Label)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Farend__TextFlied, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Farend_Label))
                    .addComponent(Azimut_TextFlied, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Metrage_TextFlied, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Metrage_label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear_Button)
                    .addComponent(Save_Button)
                    .addComponent(Dislay_Button))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Code_Site_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Code_Site_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Code_Site_TextFieldActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void Dislay_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dislay_ButtonActionPerformed
        // TODO add your handling code here:
        Dislay_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String code_site_temp = Code_Site_TextField.getText();

                SiteCollection site_c = new SiteCollection();
                ResultSet rs = site_c.getSingleSiteInfo_CodeSiteSearch(code_site_temp);

                try {
                    while (rs.next()) {
                        String cde_site = rs.getString("Code_Site");
                        String client = rs.getString("Client");

                        Code_Site_TextField.setText(cde_site);
                        Client_TextFlied.setText(client);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SiteInfo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }//GEN-LAST:event_Dislay_ButtonActionPerformed

    private void Client_TextFliedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Client_TextFliedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Client_TextFliedActionPerformed

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
            java.util.logging.Logger.getLogger(SiteInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiteInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiteInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiteInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SiteInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adress_Label;
    private javax.swing.JLabel Adress_Label1;
    private javax.swing.JTextField Adress_TextField;
    private javax.swing.JTextField Adress_TextField1;
    private javax.swing.JLabel Azimut_Label;
    private javax.swing.JTextField Azimut_TextFlied;
    private javax.swing.JButton Clear_Button;
    private javax.swing.JLabel Client_Lable;
    private javax.swing.JTextField Client_TextFlied;
    private javax.swing.JLabel Code_Site_Label;
    private javax.swing.JLabel Code_Site_Label2;
    private javax.swing.JTextField Code_Site_TextField;
    private javax.swing.JButton Dislay_Button;
    private javax.swing.JLabel Farend_Label;
    private javax.swing.JTextField Farend__TextFlied;
    private javax.swing.JLabel Latitude_Label;
    private javax.swing.JTextField Latitude_TextField;
    private javax.swing.JLabel Longitude_Label;
    private javax.swing.JTextField Longitude_TextField;
    private javax.swing.JLabel Main_Title_Label;
    private javax.swing.JTextField Metrage_TextFlied;
    private javax.swing.JLabel Metrage_label;
    private javax.swing.JButton Save_Button;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
