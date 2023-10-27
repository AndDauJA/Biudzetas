package BiudzetasPrograma.CanseN;

import BiudzetasPrograma.Biudzetas;
import BiudzetasPrograma.Failai.WriteFile;
import BiudzetasPrograma.Irasas;
import BiudzetasPrograma.PrintAll.PrintDeleteDuomenys;
import BiudzetasPrograma.PrintAll.PrintLn;
import BiudzetasPrograma.ProgramMainApp;
import static BiudzetasPrograma.PrintAll.PrintLn.print;
import java.util.Scanner;
public class Case4 {

    public static void deleteEnteredData(Biudzetas biudzetas, Scanner scanner) {
        print("");
        print("=== Pasirinkite irasa kuri norite trinti? === ");
        PrintDeleteDuomenys.printDeleteData(biudzetas.getIrasai());
        int idToDelete = scanner.nextInt();
        System.out.print("Irasas Nr.: ");
        print("Irasas " + idToDelete + " istrintas");
        print("");

        var gautiIasai = biudzetas.getIrasai();
        Irasas irasas = null;
        for (int i = 0; i < gautiIasai.size(); i++) {
            irasas = gautiIasai.get(i);
            if (irasas.getId() == idToDelete) {
                gautiIasai.remove(i);

            }
        }

        WriteFile.fileOutGoing(biudzetas.getIrasai());

    }

}
