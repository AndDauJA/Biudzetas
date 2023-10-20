package BiudzetasPrograma;

import BiudzetasPrograma.CanseN.*;

import BiudzetasPrograma.Failai.ReadFile;
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
            System.out.println("\n 1.Ivesti pajamas," +
                    " \n 2.Ivesti islaidas," +
                    " \n 3.Irasu perziura," +
                    " \n 4.Trinti irasa, " +
                    " \n 5.Keisti irasus " +
                    " \n 6.Paimti is failo informacija " +
                    "\n 7.Pabaigti programa");
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
                    System.out.println("Irasas " + "idToDelete" + " istrintas");
                    System.out.println();
                    break;
                case 5:
                    System.out.println(biudzetas);
                    KeistiIrasus.koreguotiIrasus(biudzetas.getIrasai());
                    break;
                case 6:
                    ReadFile.nuskaitytiIsFailo(biudzetas.getIrasai(),
                            biudzetas.getPajamuIrasai(),
                            biudzetas.getIslaiduIrasai());
                    break;
                case 7:
                    //  FileOut.fileOutGoing(biudzetas.getIrasai());
                    System.out.println("================================");
                    System.out.println("======= Programa baigiama ======");
                    System.out.println();
                    System.out.println("Exiting ......");
                    return;

                case 8:
                    AtnaujintiDuomenis.atnaujintiDuomenuFaila(biudzetas.getIrasai());
            }
        }
    }
}

