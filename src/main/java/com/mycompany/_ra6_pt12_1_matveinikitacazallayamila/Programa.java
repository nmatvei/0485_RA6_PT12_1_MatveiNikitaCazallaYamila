package com.mycompany._ra6_pt12_1_matveinikitacazallayamila;

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
        
        System.out.println("PROVES PER VEURE LES EXPRESSIONS REGULARS");
        
        // Comprovació de les dates
        String data1 = "20/04/2003";    // vàlid
        String data2 = "31/04/06";      // vàlid
        String data3 = "33/07/2009";    // invàlid
        String data4 = "15/12/013";     // invàlid
        String data5 = "16/9/2013";     // invàlid
        System.out.println("\nProvem si les següents dates tenen un format correcte:");
        System.out.println(data1 + "? " + validacioData(data1));
        System.out.println(data2 + "? " + validacioData(data2));
        System.out.println(data3 + "? " + validacioData(data3));
        System.out.println(data4 + "? " + validacioData(data4));
        System.out.println(data5 + "? " + validacioData(data5));
        
        // Comprovació dels correus electrònics
        String mail1 = "josep.garcia@example.com";     // vàlid
        String mail2 = "anna-marti_89@correu.cat";     // vàlid
        String mail3 = "usuari123@domini.net";         // vàlid
        String mail4 = "usuari@empresa.tech";          // vàlid
        String mail5 = "josep.garcia@";                // invàlid
        String mail6 = "@example.com";                 // invàlid
        String mail7 = "nom@domini";                   // invàlid
        String mail8 = "nom@domini.c";                 // invàlid
        String mail9 = "usuari@@domini.com";           // invàlid
        String mail10 = "nom amb espai@domini.com";    // invàlid

        System.out.println("\nComprovació dels correus electrònics:");
        System.out.println(mail1 + " ? " + validacioMail(mail1));
        System.out.println(mail2 + " ? " + validacioMail(mail2));
        System.out.println(mail3 + " ? " + validacioMail(mail3));
        System.out.println(mail4 + " ? " + validacioMail(mail4));
        System.out.println(mail5 + " ? " + validacioMail(mail5));
        System.out.println(mail6 + " ? " + validacioMail(mail6));
        System.out.println(mail7 + " ? " + validacioMail(mail7));
        System.out.println(mail8 + " ? " + validacioMail(mail8));
        System.out.println(mail9 + " ? " + validacioMail(mail9));
        System.out.println(mail10 + " ? " + validacioMail(mail10));

        // Comprovació de les hores
        String hora1 = "00:00";    // vàlida
        String hora2 = "12:30";    // vàlida
        String hora3 = "23:59";    // vàlida
        String hora4 = "07:05";    // vàlida
        String hora5 = "24:00";    // invàlida
        String hora6 = "12:60";    // invàlida
        String hora7 = "3:15";     // invàlida
        String hora8 = "15:5";     // invàlida
        String hora9 = "25:00";    // invàlida
        String hora10 = "12-30";   // invàlida

        System.out.println("\nComprovació de les hores:");
        System.out.println(hora1 + " ? " + validacioHora(hora1));
        System.out.println(hora2 + " ? " + validacioHora(hora2));
        System.out.println(hora3 + " ? " + validacioHora(hora3));
        System.out.println(hora4 + " ? " + validacioHora(hora4));
        System.out.println(hora5 + " ? " + validacioHora(hora5));
        System.out.println(hora6 + " ? " + validacioHora(hora6));
        System.out.println(hora7 + " ? " + validacioHora(hora7));
        System.out.println(hora8 + " ? " + validacioHora(hora8));
        System.out.println(hora9 + " ? " + validacioHora(hora9));
        System.out.println(hora10 + " ? " + validacioHora(hora10));

        // Comprovació de les contrasenyes
        String pass1 = "Abcdef1!";       // vàlida
        String pass2 = "Hola1234@";      // vàlida
        String pass3 = "A1b2c3d4!";      // vàlida
        String pass4 = "1234abcdE*";     // vàlida
        String pass5 = "abcdefg1!";      // invàlida
        String pass6 = "ABCDEFG1!";      // invàlida
        String pass7 = "Abcdefgh!";      // invàlida
        String pass8 = "Abcdefg1";       // invàlida
        String pass9 = "A1b!";           // invàlida
        String pass10 = "12345678";      // invàlida

        System.out.println("\nComprovació de les contrasenyes:");
        System.out.println(pass1 + " ? " + validacioContrasenya(pass1));
        System.out.println(pass2 + " ? " + validacioContrasenya(pass2));
        System.out.println(pass3 + " ? " + validacioContrasenya(pass3));
        System.out.println(pass4 + " ? " + validacioContrasenya(pass4));
        System.out.println(pass5 + " ? " + validacioContrasenya(pass5));
        System.out.println(pass6 + " ? " + validacioContrasenya(pass6));
        System.out.println(pass7 + " ? " + validacioContrasenya(pass7));
        System.out.println(pass8 + " ? " + validacioContrasenya(pass8));
        System.out.println(pass9 + " ? " + validacioContrasenya(pass9));
        System.out.println(pass10 + " ? " + validacioContrasenya(pass10));

        
    }
    
    /**
     * Mètode per comprovar si la data introduida és vàlida o no
     * 
     * @param data
     * @return si la data és vàlida o no
     */
    public static boolean validacioData(String data) {
        /**
         * Explicació:
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
    
    /**
     * Mètode per saber si el format del email introduït és vàlid.
     * 
     * @param mail
     * @return si l'email és vàlid o no
     */
    public static boolean validacioMail(String mail) {
        
        /**
         * Explicació:
         * ^ – Inici de la cadena.
         * [\\w.-]+ – Són vàlids tot tipus de caràcters alfenumèrics més punts
         *            i guions. El més es per indicar que pot haver-hi més d'un.
         * @ – Caràcter literal d'arroba.
         * [\\w.-]+ – El mateix que la primera part després de l'@.
         * \\. – És literalment un punt.
         * [a-zA-Z]{2,} – Són vàlids només caràcters de l'abecedari anglès, tant
         *                en majúscules com en minúscules. Han de ser mínim dos
         *                caràcters.
         * $ – Fi de la cadena.
         */
        return mail.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }
    
    /**
     * Mètode per saber si el format de l'hora introduida és vàlida.
     * 
     * @param hora
     * @return si l'hora introduida és vàlida o no
     */
    public static boolean validacioHora(String hora) {
        /**
        * Explicació:
        * ^ – Inici de la cadena.
        * ([0-1][0-9]|2[0-3]) – Les hores vàlides van de 00 a 23
        * : – Caràcter literal pels minuts.
        * [0-5][0-9] – Minuts vàlids, de 00 a 59.
        * $ – Fi de la cadena.
        */
        return hora.matches("^([0-1][0-9]|2[0-3]):([0-5][0-9])$");
    }
    
    /**
     * Mètode per saber que la contrasenya introduida és vàlida.
     * 
     * @param contrasenya
     * @return si la contrasenya és vàlida o no
     */
    public static boolean validacioContrasenya(String contrasenya) {
        /**
        * Explicació:
        * ^ – Inici de la cadena.
        * (?=.*[a-z]) – Almenys una lletra minúscula.
        * (?=.*[A-Z]) – Almenys una lletra majúscula.
        * (?=.*\\d) – Almenys un dígit numèric.
        * (?=.*[^a-zA-Z0-9]) – Almenys un caràcter especial (no alfanumèric).
        * .{8,} – Mínim 8 caràcters de longitud.
        * $ – Fi de la cadena.
        */
        return contrasenya.matches("^(?=^.*[a-z])(?=^.*[A-Z])(?=^.*\\d)(?=^.*[^a-zA-Z0-9]).{8,}$");
    }
}