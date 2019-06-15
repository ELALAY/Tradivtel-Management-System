/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.SitesExtras;


import java.util.Date;

/**
 *
 * @author hp
 */
public class Travaux {
    private Date Date_Fouille;
    private Date Date_Feraillage;
    private Date Date_Coulage;
    private String Betonniere;
    private String Intervenant_Genie_Civile;
    private Date Date_Installation;
    private String Client_de_Grue;//git pusto be modified into enum with depense
    private Double Depense_Grue;
    private String Periode_Journee; //to be modified into enum
    private String intervenant;

    public Travaux(Date Date_Fouille, Date Date_Feraillage, Date Date_Coulage, String Betonniere, String Intervenant_Genie_Civile, Date Date_Installation, String Client_de_Grue, Double Depense_Grue, String Periode_Journee, String intervenant) {
        this.Date_Fouille = Date_Fouille;
        this.Date_Feraillage = Date_Feraillage;
        this.Date_Coulage = Date_Coulage;
        this.Betonniere = Betonniere;
        this.Intervenant_Genie_Civile = Intervenant_Genie_Civile;
        this.Date_Installation = Date_Installation;
        this.Client_de_Grue = Client_de_Grue;
        this.Depense_Grue = Depense_Grue;
        this.Periode_Journee = Periode_Journee;
        this.intervenant = intervenant;
    }

    public Date getDate_Fouille() {
        return Date_Fouille;
    }

    public void setDate_Fouille(Date Date_Fouille) {
        this.Date_Fouille = Date_Fouille;
    }

    public Date getDate_Feraillage() {
        return Date_Feraillage;
    }

    public void setDate_Feraillage(Date Date_Feraillage) {
        this.Date_Feraillage = Date_Feraillage;
    }

    public Date getDate_Coulage() {
        return Date_Coulage;
    }

    public void setDate_Coulage(Date Date_Coulage) {
        this.Date_Coulage = Date_Coulage;
    }

    public String getBetonniere() {
        return Betonniere;
    }

    public void setBetonniere(String Betonniere) {
        this.Betonniere = Betonniere;
    }

    public String getIntervenant_Genie_Civile() {
        return Intervenant_Genie_Civile;
    }

    public void setIntervenant_Genie_Civile(String Intervenant_Genie_Civile) {
        this.Intervenant_Genie_Civile = Intervenant_Genie_Civile;
    }

    public Date getDate_Installation() {
        return Date_Installation;
    }

    public void setDate_Installation(Date Date_Installation) {
        this.Date_Installation = Date_Installation;
    }

    public String getClient_de_Grue() {
        return Client_de_Grue;
    }

    public void setClient_de_Grue(String Client_de_Grue) {
        this.Client_de_Grue = Client_de_Grue;
    }

    public Double getDepense_Grue() {
        return Depense_Grue;
    }

    public void setDepense_Grue(Double Depense_Grue) {
        this.Depense_Grue = Depense_Grue;
    }

    public String getPeriode_Journee() {
        return Periode_Journee;
    }

    public void setPeriode_Journee(String Periode_Journee) {
        this.Periode_Journee = Periode_Journee;
    }

    public String getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(String intervenant) {
        this.intervenant = intervenant;
    }

    @Override
    public String toString() {
        return "Travaux{" + "Date_Fouille=" + Date_Fouille + ", Date_Feraillage=" + Date_Feraillage + ", Date_Coulage=" + Date_Coulage + ", Betonniere=" + Betonniere + ", Intervenant_Genie_Civile=" + Intervenant_Genie_Civile + ", Date_Installation=" + Date_Installation + ", Client_de_Grue=" + Client_de_Grue + ", Depense_Grue=" + Depense_Grue + ", Periode_Journee=" + Periode_Journee + ", intervenant=" + intervenant + '}';
    }
    
    
}
