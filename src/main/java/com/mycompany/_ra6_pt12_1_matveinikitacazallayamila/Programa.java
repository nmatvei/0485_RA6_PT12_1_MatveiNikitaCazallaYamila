package com.mycompany._ra6_pt12_1_matveinikitacazallayamila;

import java.util.Scanner;

/**
 * <h2>Expressions regulars.</h2>
 * <p>En aquesta pràctica has de validar utilitzant expressions regulars:</p>
 * <ul>
 *  <li>Un data del tipus dd/mm/yy o dd/mm/yyyy.</li>
 *  <li>Un correu electrònic.</li>
 *  <li>Format hora 24 hores. Per exemples 22:54 és correcte i 22:65 és
 *      incorrecte.</li>
 *  <li>Contrasenya forta: ha de tenir mínim una lletra minúscula, una lletra
 *      majúscula, un número, un caràcter especial y mínim 8 dígits.
 *      (Utilitza ?=)</li>
 * </ul>
 * <p><b>MOLT IMPORTANT: Has d'explicar com has construït cada expressió regular.</b></p>
 * 
 * @author Nikita i Yamila
 */
public class Programa {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String data = "20/04/2003";
        String mail = "ycazalla1@gmail.com";
        String hora = "26:00";
        String contrasenya = "";
        
        if (validacioHora(hora)) {
            System.out.println("Format vàlid.");
        } else {
            System.out.println("Format invàlid.");
        }
        
    }
    
    public static boolean validacioData(String data) {
        /**
         * Explicació.
         * ^ – Inici de la cadena.
         * (0[1-9]|[12][0-9]|3[01]) – Dies vàlids: 01 a 31.
         * / – Separador.
         * (0[1-9]|1[0-2]) – Mesos vàlids: 01 a 12.
         * / – Separador.
         * \\d{2}|d{4} – Any: de 2 o 4 dígits.
         * $ – Fi de la cadena.
         */
        return data.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((\\d{2})|(\\d{4}))$");
    }
    
    public static boolean validacioMail(String mail) {
        
        /**
         * Explicació.
         * ^ – Inici de la cadena.
         * [\\w.-]+ – Són vàlids tot tipus de caràcters alfenumèrics més punts
         *            i guions. El més es per indicar que pot haver-hi més d'un.
         * @ – És literalment el caràcter d'arroba.
         * [\\w.-]+ – El mateix que la primera part després de l'@.
         * \\. – És literalment un punt.
         * [a-zA-Z]{2,} – Són vàlids només caràcters de l'abecedari anglès, tant
         *                en majúscules com en minúscules. Han de ser mínim dos
         *                caràcters.
         * $ – Fi de la cadena.
         */
        return mail.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }
    
    public static boolean validacioHora(String hora) {
        return hora.matches("^([0-1][0-9]|2[0-3]):([0-5][0-9])$");
    }
    
    public static boolean validacioContrasenya(String contrasenya) {
        return contrasenya.matches("^([a-z](?=[\\w.-])|[A-Z](?=)){8,}$");
    }
    
}
