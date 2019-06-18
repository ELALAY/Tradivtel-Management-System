package SitesGUI;

import MenueGUI.MainMenue_Admin;
import MenueGUI.MainMenue_Normal;
import Models.SiteInfo.Site;
import Models.SiteInfo.SiteCollection;
import Models.User.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the` template in the editor.
 */
/**
 *
 * @author hp
 */
public class DisplaySites extends javax.swing.JFrame {

    User current_User;
    private SiteCollection sites;
    ResultSet rs;
    Statement myStmt;
    Connection myCon;

    /**
     * Creates new form DisplaySitesInformation
     */
    public DisplaySites() throws SQLException {
        initComponents();
        DisplayAllSites();
        sites = new SiteCollection();
        TableDisplaySites_jTable.setEditingRow(0);
        TableDisplaySites_jTable.setEditingColumn(0);
    }
    
    public DisplaySites(User current_User) throws SQLException {
        initComponents();
        DisplayAllSites();
        sites = new SiteCollection();
        TableDisplaySites_jTable.setEditingRow(0);
        TableDisplaySites_jTable.setEditingColumn(0);
        this.current_User = current_User;
    }

    public DisplaySites(ResultSet rs, User current_User) throws SQLException {
        initComponents();
        DisplaySitesResults(rs);
        sites = new SiteCollection();
        this.rs = rs;
        TableDisplaySites_jTable.setEditingRow(0);
        TableDisplaySites_jTable.setEditingColumn(0);
        this.current_User = current_User;
        UserInfo_Label.setText(current_User.getUsername());
    }

    public void DisplaySitesResults(ResultSet rs) throws SQLException {

        ArrayList<Site> sitesList = new ArrayList<>();
        //rs = sites.getAllSitesData();
        while (rs.next()) {

            String Code_Site = rs.getString("Code_Site");
            String Client = rs.getString("Client");
            String Farend = rs.getString("Farend");
            String Azimut = rs.getString("Azimut");
            String City = rs.getString("Ville");
            String Adress = rs.getString("Adress");
            String Longitude = rs.getString("Longitude");
            String Latitude = rs.getString("Latitude");
            String Site_Type = rs.getString("Type_Site");
            String Technology = rs.getString("Technology");
            String Site_Metrage_String = rs.getString("Metrage");
            double Site_Metrage = Double.parseDouble(Site_Metrage_String);

            Site site_temp = new Site(Code_Site, Client, Azimut, Farend, City, Adress, Longitude, Latitude, Site_Type, Technology, Site_Metrage);
            sitesList.add(site_temp);

        }

        DefaultTableModel model = (DefaultTableModel) TableDisplaySites_jTable.getModel();

        Object[] row = new Object[11];
        for (int i = 0; i < sitesList.size(); ++i) {
            row[0] = sitesList.get(i).getCode_Site();
            row[1] = sitesList.get(i).getClient();
            row[2] = sitesList.get(i).getSite_Type();
            row[3] = sitesList.get(i).getSite_Metrage();
            row[4] = sitesList.get(i).getCity();
            row[5] = sitesList.get(i).getAdress();
            row[6] = sitesList.get(i).getFarend();
            row[7] = sitesList.get(i).getAzimut();
            row[8] = sitesList.get(i).getTechnology();
            row[9] = sitesList.get(i).getLongitude() + " / " + sitesList.get(i).getLatitude();

            model.addRow(row);
        }

    }

    public void DisplayAllSites() throws SQLException {

        myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/testtradivtel", "root", "");
        myStmt = myCon.createStatement();

        String query = "SELECT * FROM sites";
        this.rs = myStmt.executeQuery(query);

        ArrayList<Site> sitesList = new ArrayList<>();
        //rs = sites.getAllSitesData();
        while (rs.next()) {

            String Code_Site = rs.getString("Code_Site");
            String Client = rs.getString("Client");
            String Farend = rs.getString("Farend");
            String Azimut = rs.getString("Azimut");
            String City = rs.getString("Ville");
            String Adress = rs.getString("Adress");
            String Longitude = rs.getString("Longitude");
            String Latitude = rs.getString("Latitude");
            String Site_Type = rs.getString("Type_Site");
            String Technology = rs.getString("Technology");
            String Site_Metrage_String = rs.getString("Metrage");
            double Site_Metrage = Double.parseDouble(Site_Metrage_String);

            Site site_temp = new Site(Code_Site, Client, Azimut, Farend, City, Adress, Longitude, Latitude, Site_Type, Technology, Site_Metrage);
            sitesList.add(site_temp);

        }

        DefaultTableModel model = (DefaultTableModel) TableDisplaySites_jTable.getModel();

        Object[] row = new Object[11];
        for (int i = 0; i < sitesList.size(); ++i) {
            row[0] = sitesList.get(i).getCode_Site();
            row[1] = sitesList.get(i).getClient();
            row[2] = sitesList.get(i).getSite_Type();
            row[3] = sitesList.get(i).getSite_Metrage();
            row[4] = sitesList.get(i).getCity();
            row[5] = sitesList.get(i).getAdress();
            row[6] = sitesList.get(i).getFarend();
            row[7] = sitesList.get(i).getAzimut();
            row[8] = sitesList.get(i).getTechnology();
            row[9] = sitesList.get(i).getLongitude() + " / " + sitesList.get(i).getLatitude();

            model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDisplaySites_jTable = new javax.swing.JTable();
        Home_Button = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        UserInfo_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 3, 36)); // NOI18N
        jLabel1.setText("Tout les Sites");

        TableDisplaySites_jTable.setAutoCreateRowSorter(true);
        TableDisplaySites_jTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TableDisplaySites_jTable.setFont(new java.awt.Font("Gill Sans MT", 3, 18)); // NOI18N
        TableDisplaySites_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code du Site", "Client", "Type de Site", "Metrage", "Ville", "Adress", "Farend", "Azimut", "Technology", "Logitude/Latitude"
            }
        ));
        jScrollPane1.setViewportView(TableDisplaySites_jTable);

        jTabbedPane1.addTab("Info General du Site", jScrollPane1);

        Home_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home.png"))); // NOI18N
        Home_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Home_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 673, Short.MAX_VALUE)
                        .addComponent(UserInfo_Label)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(UserInfo_Label)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Home_Button))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Home_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_ButtonActionPerformed
        // TODO add your handling code here:
        Home_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (current_User.getAccountType().equals("Admin")) {
                    dispose();
                    new MainMenue_Admin(current_User).setVisible(true);
                } else {
                    dispose();
                    new MainMenue_Normal(current_User).setVisible(true);
                }

            }
        });
    }//GEN-LAST:event_Home_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DisplaySites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplaySites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplaySites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplaySites.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new DisplaySites().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DisplaySites.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home_Button;
    private javax.swing.JTable TableDisplaySites_jTable;
    private javax.swing.JLabel UserInfo_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
