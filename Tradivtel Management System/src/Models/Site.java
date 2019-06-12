/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author hp
 */
public class Site {
    private String Code_Site;
    private String Client;
    private String Farend;
    private String Azimut;
    private String Adress;
    private String Longitude; //coordinates to be modified
    private String Latitude;
    private String Site_Type; //to be modified into enum later
    private double Site_Metrage;
    private String Technology; //to be modified into enum
    private String Missing_Data; // do not know if it has to be there
    private Travaux Travaux;
    private Integration Integration;
    private Acceptance Acceptance;
    
    public Site(String Code_Site, String Client, String Farend, String Azimut, String Adress, String Longitude, String Latitude, String Site_Type, double Site_Metrage, String Technology, String Missing_Data, Travaux Travaux, Integration Integration, Acceptance Acceptance) {
        this.Code_Site = Code_Site;
        this.Client = Client;
        this.Farend = Farend;
        this.Azimut = Azimut;
        this.Adress = Adress;
        this.Longitude = Longitude;
        this.Latitude = Latitude;
        this.Site_Type = Site_Type;
        this.Site_Metrage = Site_Metrage;
        this.Technology = Technology;
        this.Missing_Data = Missing_Data;
        this.Travaux = Travaux;
        this.Integration = Integration;
        this.Acceptance = Acceptance;
    }

    public String getCode_Site() {
        return Code_Site;
    }

    public void setCode_Site(String Code_Site) {
        this.Code_Site = Code_Site;
    }

    public String getClient() {
        return Client;
    }

    public void setClient(String Client) {
        this.Client = Client;
    }

    public String getFarend() {
        return Farend;
    }

    public void setFarend(String Farend) {
        this.Farend = Farend;
    }

    public String getAzimut() {
        return Azimut;
    }

    public void setAzimut(String Azimut) {
        this.Azimut = Azimut;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    public String getSite_Type() {
        return Site_Type;
    }

    public void setSite_Type(String Site_Type) {
        this.Site_Type = Site_Type;
    }

    public double getSite_Metrage() {
        return Site_Metrage;
    }

    public void setSite_Metrage(double Site_Metrage) {
        this.Site_Metrage = Site_Metrage;
    }

    public String getTechnology() {
        return Technology;
    }

    public void setTechnology(String Technology) {
        this.Technology = Technology;
    }

    public String getMissing_Data() {
        return Missing_Data;
    }

    public void setMissing_Data(String Missing_Data) {
        this.Missing_Data = Missing_Data;
    }

    public Travaux getTravaux() {
        return Travaux;
    }

    public void setTravaux(Travaux Travaux) {
        this.Travaux = Travaux;
    }

    public Integration getIntegration() {
        return Integration;
    }

    public void setIntegration(Integration Integration) {
        this.Integration = Integration;
    }

    public Acceptance getAcceptance() {
        return Acceptance;
    }

    public void setAcceptance(Acceptance Acceptance) {
        this.Acceptance = Acceptance;
    }

    @Override
    public String toString() {
        return "Site{" + "Code_Site=" + Code_Site + ", Client=" + Client + ", Farend=" + Farend + ", Azimut=" + Azimut + ", Adress=" + Adress + ", Longitude=" + Longitude + ", Latitude=" + Latitude + ", Site_Type=" + Site_Type + ", Site_Metrage=" + Site_Metrage + ", Technology=" + Technology + ", Missing_Data=" + Missing_Data + ", Travaux=" + Travaux + ", Integration=" + Integration + ", Acceptance=" + Acceptance + '}';
    }
    
        
}
