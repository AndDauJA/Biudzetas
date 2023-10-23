package BiudzetasPrograma;

import BiudzetasPrograma.CanseN.*;

import BiudzetasPrograma.Failai.PakeistiWriteToFile;
import BiudzetasPrograma.Failai.ReadFile;
import BiudzetasPrograma.Failai.WriteFile;
import BiudzetasPrograma.IrasuKeitimas.KeistiIrasus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramMainApp {

    public static void main(String[] args) {
        Biudzetas biudzetas = new Biudzetas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("========Pasirinkite ka norite daryti========");
            System.out.println("""
                     1.Ivesti pajamas,\s
                     2.Ivesti islaidas,\s
                     3.Irasu perziura,\s
                     4.Trinti irasa, \s
                     5.Keisti irasus \s
                     6.Paimti is failo informacija\s
                     7. Balansas
                     8.Pabaigti programa\
                    """);
            int choice = scanner.nextInt();
            switch (choice) {

                case 1:
                    Case1.case1(biudzetas, scanner);

                    break;
                case 2:
                    Case2.case2(biudzetas, scanner);
                    break;
                case 3:
                    Case3.case3(biudzetas, scanner);
                    break;
                case 4:
                    System.out.println(biudzetas);
                    System.out.println();
                    System.out.println("=== Pasirinkite irasa kuri norite trinti? === ");
                    int idToDelete = scanner.nextInt();
                    Case4.deleteEnteredData(biudzetas.getIrasai(), idToDelete);
                    WriteFile.fileOutGoing(biudzetas.getIrasai());
                    System.out.println("Irasas " + "idToDelete" + " istrintas");
                    System.out.println();
                    break;
                case 5:
                    PrintDuomenys.printBendraInfoSaskaitoje(biudzetas.getIrasai());
                    KeistiIrasus.koreguotiIrasus(biudzetas.getIrasai());
                    WriteFile.fileOutGoing(biudzetas.getIrasai());
                    break;
                case 6:
                    ReadFile.nuskaitytiIsFailo(biudzetas.getIrasai(),
                            biudzetas.getPajamuIrasai(),
                            biudzetas.getIslaiduIrasai());
                    System.out.println("------Duomenys perkelti------");
                    System.out.println();
                    System.out.println();

                    break;
                case 7:
                    System.out.println(biudzetas.bendrasBalansas());
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

