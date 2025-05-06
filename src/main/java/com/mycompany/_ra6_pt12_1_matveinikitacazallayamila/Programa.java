package com.mycompany._ra6_pt12_1_matveinikitacazallayamila;

import java.util.Scanner;

/**
 * En aquesta pràctica has de validar utilitzant expressions regulars:
 * - Un data del tipus dd/mm/yy o dd/mm/yyyy.
 * - Un correu electrònic.
 * - Format hora 24 hores. Per exemples 22:54 és correcte i 22:65 és incorrecte.
 * - Contrasenya forta: ha de tenir mínim una lletra minúscula, una lletra
 *   majúscula, un número, un caràcter especial y mínim 8 dígits. (Utilitza ?=)
 * <b>MOLT IMPORTANT: Has d'explicar com has construït cada expressió regular.</b>
 * 
 * @author Nikita i Yamila
 */
public class Programa {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String dataUsuari;
        
        System.out.print("--- Hores ---"
                + "\nIntrodueix una data amb el següent format:"
                + "\n\t- dd/mm/yy"
                + "\n\t- dd/mm/yyyy"
                + "\nResposta: ");
        dataUsuari = sc.nextLine();
        
        if (validacioData(dataUsuari)) {
            System.out.println("Format vàlid.");
        } else {
            System.out.println("Format invàlid.");
        }
        
    }
    
    public static boolean validacioData(String data) {
        /**
         * ^ – Inici de la cadena
         * (0[1-9]|[12][0-9]|3[01]) – Dies vàlids: 01 a 31
         * / – Separador
         * (0[1-9]|1[0-2]) – Mesos vàlids: 01 a 12
         * / – Separador
         * \\d{2}|d{4} – Any: de 2 o 4 dígits
         * $ – Fi de la cadena
         */
        return data.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((\\d{2})|(\\d{4}))$");
    }
    
    public static boolean validacioMail(String mail) {
        return false;
    }
    
    public static boolean validacioHora(String hora) {
        return false;
    }
    
    public static boolean validacioContrasenya(String contrasenya) {
        return false;
    }
    
}
