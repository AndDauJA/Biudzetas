package BiudzetasPrograma.CanseN;

import BiudzetasPrograma.Biudzetas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Case5 {

    public static void case5(Biudzetas biudzetas, Scanner scanner) {


        System.out.println();
        System.out.println("======== Pasirinkite juri irasa norite keisti ========");
        while (true) {
            System.out.println(" =====Pasirinkimas spausdinti:===== \n" +
                    "1. Pajamu iraso keitimas \n" +
                    "2. Islaidu iraso keitimas \n" +
                    "3. Bendras informacija apie saskaitas \n" +
                    "4. Exit");
            int choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("======Pajamu iraso keitimas======");
                    break;
                case 2:
                    System.out.println("======Islaidu iraso keitimas======");
                    break;
                case 3:
                    System.out.println("=======Bendra informacija saskaitoje========");
                    System.out.println(biudzetas);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Griztame i pagrindini Meniu >>>>");
                    System.out.println();
                    return;
            }
        }
    }
}

