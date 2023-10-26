package BiudzetasPrograma.CanseN;

import BiudzetasPrograma.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Case3 {


    public static void case3(Biudzetas biudzetas, Scanner scanner, ArrayList<Irasas> irasas) {
        System.out.println("======== Pasirinkite is meniu ========");


        while (true) {
            System.out.println(" Pasirinkimas spausdinti: \n" +
                    "1. Pajamu irasai, \n" +
                    "2. Islaidu irasai, \n" +
                    "3. Bendras informacija apie saskaitas \n" +
                    "4. Exit");
            int choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("======Pajamu irasai======");
                    //PrintDuomenys.printPajamos(biudzetas.getPajamuIrasai());
                    PrintDuomenys.printBendraInfoSaskaitoje(irasas);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("======Islaidu irasai======");
                    //PrintDuomenys.printIslaidos(biudzetas.getIslaiduIrasai());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("=======Bendra informacija saskaitoje========");
                    PrintDuomenys.printBendraInfoSaskaitoje(biudzetas.getIrasai());
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
