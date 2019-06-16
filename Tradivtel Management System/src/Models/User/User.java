/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.User;

/**
 *
 * @author hp
 */
public class User {

    private String Username;
    private String Passwrord;
    private String AccountType;
    private String Email;
    private String PhoneNumber;
    private String FirstName;
    private String LastName;

    public User(String Username, String Passwrord, String AccountType, String Email, String PhoneNumber, String FirstName, String LastName) {
        this.Username = Username;
        this.Passwrord = Passwrord;
        this.AccountType = AccountType;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPasswrord() {
        return Passwrord;
    }

    public void setPasswrord(String Passwrord) {
        this.Passwrord = Passwrord;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    @Override
    public String toString() {
        return "User{" + "Username=" + Username + ", Passwrord=" + Passwrord + ", AccountType=" + AccountType + ", Email=" + Email + ", PhoneNumber=" + PhoneNumber + ", FirstName=" + FirstName + ", LastName=" + LastName + '}';
    }

}
