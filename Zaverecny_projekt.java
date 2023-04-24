/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecny_projekt;

import java.util.Scanner;

/**
 *
 * @author TaKo
 */
public class Zaverecny_projekt {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in,"Windows-1250");
        EvidencePojisteni evidencePojisteni = new EvidencePojisteni();
        
        //Vstup od uživatele k cyklu
        String volba = "";
        String pokracovat = "";
        
        //Cyklus
        while (!volba.equals("4")) {
            evidencePojisteni.uvodniVypis();
                        
            System.out.println("\nVyberte akci, kterou chcete provést [1-4]: ");
            System.out.println("1 - Přidání pojištěnce");
            System.out.println("2 - Vypsat všechny pojištence");
            System.out.println("3 - Vyhledání pojištěnce");
            System.out.println("4 - Konec");
            
            volba = sc.nextLine().trim().toLowerCase();
            System.out.println();
            
            //Uživatelská volba
            switch(volba) {
                case "1": evidencePojisteni.pridejPojistence();
                    break;
                case "2": evidencePojisteni.vypisVsechnyPojistence();
                    break;
                case "3": evidencePojisteni.vyhledejPojistence();
                    break;
                case "4": System.out.println("Program byl ukončen!");
                    break;
                default: System.out.println("Neplatná volba, zvolte hodnotu z výběru.");
            }
            if(!volba.equals("4")) {
            System.out.println("\nPokračujte libovolnou klávesou...");
            pokracovat = sc.nextLine();
            }
        }
    }
}
