/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecny_projekt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TaKo
 */
public class EvidencePojisteni {
    private Databaze databaze;
    private Scanner sc = new Scanner(System.in,"Windows-1250");
    
    public EvidencePojisteni() {
        databaze = new Databaze();
    }
    
    //hlavička evidence pojištěných
    public void uvodniVypis() {
        System.out.println("--------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("--------------------");
    }
    
    //Výpis všech pojištěných v evidenci
    public void vypisVsechnyPojistence() {
        ArrayList<Pojistenec> zaznamy = databaze.najdiVsechnyPojistence();
        if(zaznamy.isEmpty()) {
            System.out.println("Nebyli nalezeni žádní evidovaní pojištenci.");
        }
        for (Pojistenec pojistenec : zaznamy) {
            System.out.println(pojistenec);
        }
    }
    
    //Přidání pojištěnce
    public void pridejPojistence() {
        String jmeno = zadejJmeno();
        String prijmeni = zadejPrijmeni();
        int vek = zadejVek();
        int telefon = zadejTelefon();
        databaze.pridejPojistence(jmeno, prijmeni, vek, telefon);
        System.out.println("Pojištěnec byl úspěšně vložen.");
    }
    
    //Vyhledání pojištěnce
    public void vyhledejPojistence() {
        String jmeno = zadejJmeno();
        String prijmeni = zadejPrijmeni();
        ArrayList<Pojistenec> databazePojistenych = databaze.najdiPojistence(jmeno.toLowerCase(), prijmeni.toLowerCase());
        if (!databazePojistenych.isEmpty()) {
            System.out.println("\nByli nalezeni tito pojištěnci: ");
            for (Pojistenec pojistenec : databazePojistenych) {
                System.out.println(pojistenec);
            }
        } else {
            System.out.println("Nebyli nalezeni žádní pojištěnci.");
        }
    }
    
    public String textovySeznam() {
        String textovyVypis = databaze.toString();
        return textovyVypis;
    }
    
    //Jméno
    private String zadejJmeno() {
        System.out.println("Zadejte křestní jméno: ");
        String jmeno = sc.nextLine().trim();
        while (jmeno.length() > 20 || jmeno.length() < 2) {
            System.out.println("Vaše jméno je příliš krátké nebo dlouhé. Zadejte ho znovu.");
            jmeno = sc.nextLine().trim();
        }
        return jmeno;
    }
        
    //Příjmení
    private String zadejPrijmeni() {
        System.out.println("Zadejte příjmení: ");
        String prijmeni = sc.nextLine().trim();
        while (prijmeni.length() > 30 || prijmeni.length() < 2) {
            System.out.println("Vaše příjmení je příliš krátké nebo dlouhé. Zadejte ho znovu.");
            prijmeni = sc.nextLine().trim();
        }
        return prijmeni;
    }
    
    //Věk
    private int zadejVek() {
        System.out.println("Zadejte věk: ");
        int vek = 0;
        while (vek == 0) {
            try {
                vek = Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Zadali jste neplatný formát. Zadejte věk čísly.");
            }
        }
        return vek;
    }
    
    //Telefonní číslo
    private int zadejTelefon() {
        System.out.println("Zadejte telefonní číslo: ");
        int telefon = 0;
        while (telefon == 0 || telefon < 100000000 || telefon > 999999999) {
            try {
                telefon = Integer.parseInt(sc.nextLine().trim());            
            } catch (Exception e) {
                System.out.println("Telefonní číslo je naplatné. Zadejte ho znovu.");
                continue;
            }
            if(telefon < 100000000 || telefon > 999999999)
                System.out.println("Zadali jste příliš krátké nebo dlouhé telefonní číslo. Zadejte ho znovu.");
        }
        return telefon;
    }
}
