/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Models.Site;

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
    
    public SiteCollection(){
        this.sites = new ArrayList<>();
    }
    
    public static SiteCollection getObj(){
        if(obj == null){
            obj = new SiteCollection();
        }
        return obj;
    }
    
    public void addSiteToDB(Site site, int i){
        sites.add(site);
        
        if(i == 0){
            try{
                myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
                myStmt = myCon.createStatement();
                
                String sql = "insert into Site"
                        +"(Code_Site, Client, ...)"
                        +"values ('" +site.getCode_Site()+"','"+site.getClient()+"','";
                myStmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
                
                rs = myStmt.getGeneratedKeys();
                if(rs.next()){
                }
                
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
