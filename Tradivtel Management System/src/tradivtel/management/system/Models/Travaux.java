/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradivtel.management.system.Models;

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
    private String Client_de_Grue;//to be modified into enum with depense
    private Double Depense_Grue;
    private String Periode_Journee; //to be modified into enum
    private String intervenant;
}
