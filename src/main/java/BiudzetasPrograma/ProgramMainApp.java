package BiudzetasPrograma;

import BiudzetasPrograma.CanseN.Case1;
import BiudzetasPrograma.CanseN.Case2;
import BiudzetasPrograma.CanseN.Case3;
import BiudzetasPrograma.CanseN.Case4;
import BiudzetasPrograma.Failai.ReadFile;
import BiudzetasPrograma.Failai.WriteFile;
import BiudzetasPrograma.IrasuKeitimas.KeistiIrasus;
import BiudzetasPrograma.PrintAll.PrintBalansas;
import BiudzetasPrograma.PrintAll.PrintDeleteDuomenys;
import BiudzetasPrograma.PrintAll.PrintDuomenys;

import java.util.ArrayList;
import java.util.Scanner;

import static BiudzetasPrograma.PrintAll.PrintLn.print;

public class ProgramMainApp {

    public static void main(String[] args) {
        Biudzetas biudzetas = new Biudzetas();
        ArrayList<Irasas> irasas = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("========Pasirinkite ka norite daryti========");
            System.out.println("[1] Ivesti pajamas,\n" +
                    "[2] Ivesti islaidas,\n" +
                    "[3] Irasu perziura,\n" +
                    "[4] Trinti irasa,\n" +
                    "[5] Keisti irasus,\n" +
                    "[6] Paimti is failo informacija,\n" +
                    "[7]  Balansas,\n" +
                    "[8] Pabaigti programa\n");
            int choice = scanner.nextInt();
            switch (choice) {

                case 1:
                    Case1.case1(biudzetas, scanner);

                    break;
                case 2:
                    Case2.case2(biudzetas, scanner);
                    break;
                case 3:
                    Case3.case3(biudzetas, scanner, irasas);
                    print("000");
                    break;
                case 4:

                    System.out.println();
                    System.out.println("=== Pasirinkite irasa kuri norite trinti? === ");
                    PrintDeleteDuomenys.printDeleteData(biudzetas.getIrasai());
                    System.out.print("Irasas Nr.: ");
                    int idToDelete = scanner.nextInt();
                    Case4.deleteEnteredData(biudzetas, idToDelete);
                    WriteFile.fileOutGoing(biudzetas.getIrasai());
                    System.out.println("Irasas " + idToDelete + " istrintas");
                    System.out.println();
                    break;
                case 5:
                    PrintDuomenys.printBendraInfoSaskaitoje(biudzetas.getIrasai());
                    KeistiIrasus.koreguotiIrasus(biudzetas.getIrasai());
                    WriteFile.fileOutGoing(biudzetas.getIrasai());
                    break;
                case 6:
                    ReadFile.nuskaitytiIsFailo(biudzetas.getIrasai());
                    System.out.println("------Duomenys perkelti------");
                    System.out.println();
                    System.out.println();

                    break;
                case 7:
                    //System.out.println(biudzetas.bendrasBalansas());
                    PrintBalansas.printBalansoduomenys(biudzetas);
                    break;
                case 8:

                    System.out.println("================================");
                    System.out.println("======= Programa baigiama ======");
                    System.out.println();
                    System.out.println("Exiting ......");
                    return;

                case 9:
                    WriteFile.fileOutGoing(biudzetas.getIrasai());


            }
        }
    }
}

