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

    public ResultSet SearchSites(String searchQuery, String searchParam) {
        ResultSet rs = null;

        try {

            myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/testtradivtel", "root", "");
            myStmt = myCon.createStatement();

            String query = "SELECT * FROM sites WHERE " + searchParam + " = '" + searchQuery + "'";
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

    public ArrayList<Site> getAllSitesData() throws SQLException {
        ArrayList<Site> sitesList = new ArrayList<>();
        System.out.println("in func allsites data");
        myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/testtradivtel", "root", "");
        myStmt = myCon.createStatement();

        String query = "SELECT * FROM sites";
        rs = myStmt.executeQuery(query);
        System.out.println("executing query, rs to list");
        while (rs.next()) {
            String Code_Site = rs.getString("Code_Site");
            String Client = rs.getString("Client");
            String Farend = rs.getString("Farend");
            String Azimut = rs.getString("Azimut");
            String City = rs.getString("City");
            String Adress = rs.getString("Adress");
            String Longitude = rs.getString("Longitude");
            String Latitude = rs.getString("Latitude");
            String Site_Type = rs.getString("Site_Type");
            String Technology = rs.getString("Technology");
            String Site_Metrage_String = rs.getString("Site_Metrage");
            double Site_Metrage = Double.parseDouble(Site_Metrage_String);

            Site site_temp = new Site(Code_Site, Client, Azimut, Farend, City, Adress, Longitude, Latitude, Site_Type, Technology, Site_Metrage);
            sitesList.add(site_temp);
        }

        return sitesList;
    }

    public ArrayList<Site> getSitetResultSetToArrayList(ResultSet rs) throws SQLException {
        ArrayList<Site> listSitesRS;
        
        while (rs.next()) {
            Site site_temp = null;
            
            
            
            site_temp.setCode_Site(rs.getString("Code_Site"));
            
        }
        
        return null;
    }
}
