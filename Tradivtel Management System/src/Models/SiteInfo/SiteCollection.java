/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.SiteInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Models.SiteInfo.Site;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class SiteCollection {

    ArrayList<Site> sites;
    private String path;
    Statement myStmt;
    Connection myCon;
    ResultSet rs;

    public static SiteCollection obj = null;

    public SiteCollection() {
        this.sites = new ArrayList<>();
    }

    public static SiteCollection getObj() {
        if (obj == null) {
            obj = new SiteCollection();
        }
        return obj;
    }

    public Site getSingleSiteInfo_CodeSiteSearch(String code_site) {
        Site site_temp = null;
        try {

            myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/testtradivtel", "root", "");
            myStmt = myCon.createStatement();

            String query = "SELECT * FROM `sites` WHERE Code_Site = '" + code_site + "'";
            rs = myStmt.executeQuery(query);
            System.out.println("Recods from db: ");

            while (rs.next()) {
                String cde_site = rs.getString("Code_Site");
                String client = rs.getString("Client");
                System.out.println("Code Site: " + cde_site + "\nClient: " + client);

                site_temp = new Site(code_site, client);
            }

        } catch (SQLException e) {
            System.out.print("here error: " + e);
        }
        return site_temp;
    }

    public ResultSet SearchSites(String searchQuery, String searchParam) {
        ResultSet rs = null;

        try {

            myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/testtradivtel", "root", "");
            myStmt = myCon.createStatement();

            String query = "SELECT * FROM 'sites' WHERE " + searchParam + " = '" + searchQuery + "'";
            rs = myStmt.executeQuery(query);
            if (!rs.next()) {
                System.out.println("Empty Result");
            } else {
                System.out.println("result returned");
            }

        } catch (SQLException e) {
            System.out.print("here error: " + e);
        }
        return rs;
    }

}
