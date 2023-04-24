/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecny_projekt;

/**
 *
 * @author TaKo
 */
public class Pojistenec {
    //Veškeré údaje pro zařazení do evidence
    private String jmeno;
    private String prijmeni;
    private int vek;
    private int telefon;
    
    public Pojistenec(String jmeno, String prijmeni, int vek, int telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }
    
    public String getJmeno() {
        return this.jmeno;
    }
    
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    
    public String getPrijmeni() {
        return this.prijmeni;
    }
    
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }
    
    public int getVek() {
        return this.vek;
    }
    
    public void setVek(int vek) {
        this.vek = vek;
    }
    
    public int getTelefon() {
        return this.telefon;
    }
    
    public void setTelefon() {
        this.telefon = telefon;
    }
    
    public String textovyVypis() {
        return getJmeno() + "|" + getPrijmeni() + "|" + getVek() + "|" + getTelefon() + "#";
    }
    
    @Override
    public String toString() {
        return getJmeno() + " " + getPrijmeni() + "\t" + getVek() + "\t" + getTelefon(); 
    }
}
