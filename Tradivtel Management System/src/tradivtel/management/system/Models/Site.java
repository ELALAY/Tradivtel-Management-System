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
    
}
