package BiudzetasPrograma.CanseN;

import BiudzetasPrograma.*;
import BiudzetasPrograma.PrintAll.PrintDuomenys;
import BiudzetasPrograma.PrintAll.PrintPiniguIrasai;
import static BiudzetasPrograma.PrintAll.PrintLn.print;
import java.util.ArrayList;
import java.util.Scanner;

public class Case3 {


    public static void case3(Biudzetas biudzetas, Scanner scanner, ArrayList<Irasas> irasas) {
        //ArrayList<PajamuIrasai> pajamuIrasaiArrayList = new ArrayList<>();
        System.out.println("======== Pasirinkite is meniu ========");
        String papildomasPajamuKodas="p";
        String papildomasIslaiduKodas="is";

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
                    PrintPiniguIrasai.printPinuguSuma(biudzetas.getIrasai(),papildomasPajamuKodas);

                    print("");
                    double pajamos = PrintPiniguIrasai.totalIncomeCalculation(biudzetas.getIrasai(),papildomasPajamuKodas);
                    print("========Viso pajamu suma=========");
                    print("Viso pajamu: " + pajamos + "\u20AC");
                    print("=================================");
                    print("");
                    break;
                case 2:
                    print("======Islaidu irasai======");
                    PrintPiniguIrasai.printPinuguSuma(biudzetas.getIrasai(),papildomasIslaiduKodas);
                    print("");
                    double islaidos = PrintPiniguIrasai.totalIncomeCalculation(biudzetas.getIrasai(),papildomasIslaiduKodas);
                    print("========Viso islaidu suma=========");
                    print("Viso islaidu: " + islaidos + "\u20AC");
                    print("=================================");
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
