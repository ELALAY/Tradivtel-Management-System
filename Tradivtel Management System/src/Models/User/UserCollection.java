/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.User;

import Models.SiteInfo.Site;
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

    public User LogIn(String username, String password) throws SQLException {
        boolean loggedin = false;
        User current_User = null;

        System.out.println("in login");
        myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/testtradivtel", "root", "");
        myStmt = myCon.createStatement();

        String query = "SELECT * FROM users WHERE Username = '" + username + "'";
        rs = myStmt.executeQuery(query);
        System.out.println("after querry");

        if (rs.next()) {
            int UserID = rs.getInt(1);
            System.out.println(UserID);
            //int UserID = Integer.parseInt(UserId_S);
            String Username = rs.getString("Username");
            String FirstName = rs.getString("FirstName");
            String LastName = rs.getString("LastName");
            String Email = rs.getString("Email");
            String phone = rs.getString("Phone");
            String Password = rs.getString("Password");
            String AccountType = rs.getString("AccountType");

            //int UserId, String Username, String Passwrord, String AccountType, String Email, String PhoneNumber, String FirstName, String LastName
            if (Password.equals(password)) {
                current_User = new User(UserID, Username, Password, AccountType, Email, phone, FirstName, LastName);
                loggedin = true;
            } else loggedin = false;
        }

        if (!loggedin) {
            JOptionPane.showMessageDialog(null, "Invalid Email or Password!");
        }
        return current_User;

    }
    
    public ArrayList<Site> getAllUsers() {return null;}
}
