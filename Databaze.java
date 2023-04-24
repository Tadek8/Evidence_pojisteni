/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecny_projekt;

import java.util.ArrayList;

/**
 *
 * @author Tako
 */
public class Databaze {
    public ArrayList<Pojistenec> databazePojistenych;
    
    public Databaze() {
        databazePojistenych = new ArrayList<>();
    }
    
    public void pridejPojistence(String jmeno, String prijmeni, int vek, int telefon) {
        databazePojistenych.add(new Pojistenec(jmeno, prijmeni, vek, telefon));
    }
    
    public ArrayList<Pojistenec> najdiVsechnyPojistence() {
        ArrayList<Pojistenec> nalezeniPojistenci = new ArrayList<>();
        
        for (Pojistenec pojistenec : databazePojistenych) {
            nalezeniPojistenci.add(pojistenec);
        }
        return nalezeniPojistenci;
    }
    
    public ArrayList<Pojistenec> najdiPojistence(String jmeno, String prijmeni) {
        ArrayList<Pojistenec> nalezeniPojistenci = new ArrayList<>();
        for(Pojistenec pojistenec : databazePojistenych) {
            if(pojistenec.getJmeno().toLowerCase().trim().equals(jmeno)
                    && pojistenec.getPrijmeni().toLowerCase().trim().equals(prijmeni)) {
            nalezeniPojistenci.add(pojistenec);
            }
        }
        return nalezeniPojistenci;
    }
    
    public ArrayList<Pojistenec> getdatabazePojistenych() {
        return this.databazePojistenych;
    }
    
    public void setdatabazePojistenych(ArrayList<Pojistenec> databazePojistenych) {
        this.databazePojistenych = databazePojistenych;
    }
    
    @Override
    public String toString() {
        String s = "";
        for (Pojistenec pojistenec : databazePojistenych) {
            s += pojistenec.textovyVypis() + " \n";
            }
        return s;
    }
}
