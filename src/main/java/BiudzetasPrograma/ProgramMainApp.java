package BiudzetasPrograma;

import BiudzetasPrograma.CanseN.Case1;
import BiudzetasPrograma.CanseN.Case2;
import BiudzetasPrograma.CanseN.Case3;
import BiudzetasPrograma.CanseN.Case4;
import BiudzetasPrograma.Failai.ReadFile;
import BiudzetasPrograma.Failai.WriteFile;
import BiudzetasPrograma.CanseN.Case5;
import BiudzetasPrograma.PrintAll.PrintBalansas;
import BiudzetasPrograma.PrintAll.PrintDuomenys;

import static BiudzetasPrograma.PrintAll.PrintLn.print;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramMainApp {

    public static void main(String[] args) throws IOException {

        Biudzetas biudzetas = new Biudzetas();
        ArrayList<Irasas> irasas = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            print("========Pasirinkite ka norite daryti========");
            print("[1] Ivesti pajamas,\n" +
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

                    break;
                case 4:
                    Case4.deleteEnteredData(biudzetas, scanner);
                    break;
                case 5:
                    PrintDuomenys.printBendraInfoSaskaitoje(biudzetas.getIrasai());
                    Case5.koreguotiIrasus(biudzetas.getIrasai());
                    WriteFile.fileOutGoing(biudzetas.getIrasai());

                    break;
                case 6:
                    ReadFile.nuskaitytiIsFailo(biudzetas.getIrasai());
                    print("------Duomenys perkelti------");
                    print("");
                    print("");
                    break;
                case 7:
                    //System.out.println(biudzetas.bendrasBalansas());
                    PrintBalansas.printBalansoduomenys(biudzetas);
                    break;
                case 8:

                    print("================================");
                    print("======= Programa baigiama ======");
                    print("");
                    print("Exiting ......");
                    return;

                case 9:
                    WriteFile.fileOutGoing(biudzetas.getIrasai());


            }
        }
    }
}

