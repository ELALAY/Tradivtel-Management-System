/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class UserCollection {

    ArrayList<User> usersList;
    Statement myStmt;
    Connection myCon;
    ResultSet rs;

    public UserCollection() {
        this.usersList = new ArrayList<>();
    }

    public boolean LogIn(String email, String password) throws SQLException {
        boolean loggedin = false;
        
        System.out.println("in login");
        myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/testtradivtel", "root", "");
        myStmt = myCon.createStatement();

        String query = "SELECT * FROM users WHERE Email = '" + email + "'";
        rs = myStmt.executeQuery(query);
        System.out.println("after querry");
        String passTemp = rs.getString(password);
        
        if (passTemp == null ? password == null : passTemp.equals(password)) 
            loggedin = true;
        if (!rs.next()) {
            loggedin = false;
        } 
        if (!loggedin) {
            JOptionPane.showMessageDialog(null, "Invalid Email or Password!");
            loggedin = false;
        }
        return loggedin;

    }

}
