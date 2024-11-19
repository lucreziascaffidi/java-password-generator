package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome:");
        String nameUser = input.nextLine();

        System.out.println("Inserisci il tuo cognome:");
        String lastNameUser = input.nextLine();

        System.out.println("Inserisci il tuo colore preferito:");
        String colorUser = input.nextLine();

        System.out.println("Inserisci il tuo giorno di nascita:");
        int birtDayhUser = input.nextInt();

        System.out.println("Inserisci il tuo mese di nascita:");
        int birtMonthhUser = input.nextInt();

        System.out.println("Inserisci il tuo anno di nascita:");
        int birtYearhUser = input.nextInt();

        int sumDate = birtDayhUser + birtMonthhUser + birtYearhUser;

        String passwordGenetator = nameUser + "-" + lastNameUser + "-" + colorUser + "-" + sumDate;

        System.out.println("La password generata è: " + passwordGenetator);

        input.close();
    }
}
