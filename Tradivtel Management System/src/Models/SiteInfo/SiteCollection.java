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

import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class SiteCollection {

    ArrayList<Site> sites;
    Statement myStmt;
    Connection myCon;
    ResultSet rs;

    public static SiteCollection obj = null;

    public SiteCollection() {
        this.sites = new ArrayList<>();
    }

    public SiteCollection(ArrayList<Site> sites) {
        this.sites = sites;
    }

    public ResultSet SearchSites(String searchQuery, String searchParam) {
        
        try {

            myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/testtradivtel", "root", "");
            myStmt = myCon.createStatement();

            String query = "SELECT * FROM sites WHERE " + searchParam + " = '" + searchQuery + "'";
            rs = myStmt.executeQuery(query);

        } catch (SQLException e) {
            System.out.print("here error: " + e);
        }
        return rs;
    }

    public ResultSet getAllSitesData() throws SQLException {

        System.out.println("begin the func allsites data");
        
            myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/testtradivtel", "root", "");
            myStmt = myCon.createStatement();

            System.out.println("in func allsites data, after establishing connexion");
            String query = "SELECT * FROM sites";
            this.rs = myStmt.executeQuery(query);
            System.out.println("executing query, rs to list");
            /*while (rs.next()) {
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
                sites.add(site_temp);
            }*/

        
        return this.rs;
    }

}
