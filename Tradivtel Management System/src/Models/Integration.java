/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Integration {
    private String Supervieur;
    private Date Date_Mise_Service;
    private Date Date_Mise_Air;
    private Boolean Ping;
    private String Supervision_RD;
    private String Supervision_TX;
    private Date Date_Acceptation;

    public Integration(String Supervieur, Date Date_Mise_Service, Date Date_Mise_Air, Boolean Ping, String Supervision_RD, String Supervision_TX, Date Date_Acceptation) {
        this.Supervieur = Supervieur;
        this.Date_Mise_Service = Date_Mise_Service;
        this.Date_Mise_Air = Date_Mise_Air;
        this.Ping = Ping;
        this.Supervision_RD = Supervision_RD;
        this.Supervision_TX = Supervision_TX;
        this.Date_Acceptation = Date_Acceptation;
    }

    public String getSupervieur() {
        return Supervieur;
    }

    public void setSupervieur(String Supervieur) {
        this.Supervieur = Supervieur;
    }

    public Date getDate_Mise_Service() {
        return Date_Mise_Service;
    }

    public void setDate_Mise_Service(Date Date_Mise_Service) {
        this.Date_Mise_Service = Date_Mise_Service;
    }

    public Date getDate_Mise_Air() {
        return Date_Mise_Air;
    }

    public void setDate_Mise_Air(Date Date_Mise_Air) {
        this.Date_Mise_Air = Date_Mise_Air;
    }

    public Boolean getPing() {
        return Ping;
    }

    public void setPing(Boolean Ping) {
        this.Ping = Ping;
    }

    public String getSupervision_RD() {
        return Supervision_RD;
    }

    public void setSupervision_RD(String Supervision_RD) {
        this.Supervision_RD = Supervision_RD;
    }

    public String getSupervision_TX() {
        return Supervision_TX;
    }

    public void setSupervision_TX(String Supervision_TX) {
        this.Supervision_TX = Supervision_TX;
    }

    public Date getDate_Acceptation() {
        return Date_Acceptation;
    }

    public void setDate_Acceptation(Date Date_Acceptation) {
        this.Date_Acceptation = Date_Acceptation;
    }

    @Override
    public String toString() {
        return "Integration{" + "Supervieur=" + Supervieur + ", Date_Mise_Service=" + Date_Mise_Service + ", Date_Mise_Air=" + Date_Mise_Air + ", Ping=" + Ping + ", Supervision_RD=" + Supervision_RD + ", Supervision_TX=" + Supervision_TX + ", Date_Acceptation=" + Date_Acceptation + '}';
    }
    
    
}
