package BiudzetasPrograma.MainMenu;

import BiudzetasPrograma.Biudzetas;
import BiudzetasPrograma.CanseN.*;
import BiudzetasPrograma.Failai.ReadFile;
import BiudzetasPrograma.Failai.WriteFile;
import BiudzetasPrograma.Irasas;
import BiudzetasPrograma.PrintAll.PrintBalansas;
import BiudzetasPrograma.PrintAll.PrintCase;
import BiudzetasPrograma.PrintAll.PrintDuomenys;
import BiudzetasPrograma.PrintAll.PrintMain;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WhileChoice {

    public static void whileForMainManu() throws IOException {
        Biudzetas biudzetas = new Biudzetas();
        ArrayList<Irasas> irasas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            PrintMain.printMainMenu();
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
                    PrintCase.printCase6();
                    break;
                case 7:
                    //System.out.println(biudzetas.bendrasBalansas());
                    PrintBalansas.printBalansoduomenys(biudzetas);
                    break;
                case 8:
                    PrintCase.printCase8();
                    return;
                case 9:
                    WriteFile.fileOutGoing(biudzetas.getIrasai());
            }
        }
    }

}
