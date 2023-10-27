package BiudzetasPrograma.CanseN;

import BiudzetasPrograma.*;
import BiudzetasPrograma.PrintAll.PrintDuomenys;
import BiudzetasPrograma.PrintAll.PrintIslaiduIrasai;
import BiudzetasPrograma.PrintAll.PrintPajamuIrasai;
import static BiudzetasPrograma.PrintAll.PrintLn.print;
import java.util.ArrayList;
import java.util.Scanner;

public class Case3 {


    public static void case3(Biudzetas biudzetas, Scanner scanner, ArrayList<Irasas> irasas) {
        //ArrayList<PajamuIrasai> pajamuIrasaiArrayList = new ArrayList<>();
        System.out.println("======== Pasirinkite is meniu ========");


        while (true) {
            print(" Pasirinkimas spausdinti: \n" +
                    "[1] Pajamu irasai, \n" +
                    "[2] Islaidu irasai, \n" +
                    "[3] Bendras informacija apie saskaitas \n" +
                    "[4] Exit");
            int choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    print("======Pajamu irasai======");
                    PrintPajamuIrasai.printPajamos(biudzetas.getIrasai());
                    print("");

                    break;
                case 2:
                    print("======Islaidu irasai======");
                    PrintIslaiduIrasai.printIslaidos(biudzetas.getIrasai());
                    print("");
                    break;
                case 3:
                    print("=======Bendra informacija saskaitoje========");
                    PrintDuomenys.printBendraInfoSaskaitoje(biudzetas.getIrasai());
                    print("");
                    break;
                case 4:
                    print("Griztame i pagrindini Meniu >>>>");
                    print("");
                    return;
            }
        }
    }
}
