/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradivtel.management.system.Models;

/**
 *
 * @author hp
 */
public class Acceptance {
    private Boolean Genie_Civil;
    private Boolean RD;
    private Boolean TX;
    private Boolean Power;
    private Boolean BOQ;
    private Boolean Finition;

    public Acceptance(Boolean Genie_Civil, Boolean RD, Boolean TX, Boolean Power, Boolean BOQ, Boolean Finition) {
        this.Genie_Civil = Genie_Civil;
        this.RD = RD;
        this.TX = TX;
        this.Power = Power;
        this.BOQ = BOQ;
        this.Finition = Finition;
    }

    public Boolean getGenie_Civil() {
        return Genie_Civil;
    }

    public void setGenie_Civil(Boolean Genie_Civil) {
        this.Genie_Civil = Genie_Civil;
    }

    public Boolean getRD() {
        return RD;
    }

    public void setRD(Boolean RD) {
        this.RD = RD;
    }

    public Boolean getTX() {
        return TX;
    }

    public void setTX(Boolean TX) {
        this.TX = TX;
    }

    public Boolean getPower() {
        return Power;
    }

    public void setPower(Boolean Power) {
        this.Power = Power;
    }

    public Boolean getBOQ() {
        return BOQ;
    }

    public void setBOQ(Boolean BOQ) {
        this.BOQ = BOQ;
    }

    public Boolean getFinition() {
        return Finition;
    }

    public void setFinition(Boolean Finition) {
        this.Finition = Finition;
    }

    @Override
    public String toString() {
        return "Acceptance{" + "Genie_Civil=" + Genie_Civil + ", RD=" + RD + ", TX=" + TX + ", Power=" + Power + ", BOQ=" + BOQ + ", Finition=" + Finition + '}';
    }
    
    
}