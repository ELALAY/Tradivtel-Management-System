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

        myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/testtradivtel", "root", "");
        myStmt = myCon.createStatement();

        String query = "SELECT * FROM users WHERE Email = '" + email + "'";
        rs = myStmt.executeQuery(query);

        if (!rs.next()) {
            String passTemp = rs.getString(password);
            if (passTemp == password) {
                return true;
            } else {
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Email or Password!");
            return false;
        }

    }

}
