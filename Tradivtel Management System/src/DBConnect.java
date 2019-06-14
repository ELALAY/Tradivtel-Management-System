/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 * 
 */

import java.sql.*;

public class DBConnect {
    private Connection mycon;
    private Statement st;
    
    public DBConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/sites", "root", "");
            st = mycon.createStatement();
            
        } catch(ClassNotFoundException | SQLException e){
            System.out.print("error: " + e);
        }
    }
}
