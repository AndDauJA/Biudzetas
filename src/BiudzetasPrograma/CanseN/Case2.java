package BiudzetasPrograma.CanseN;

import BiudzetasPrograma.*;
import BiudzetasPrograma.Failai.WriteFile;

import java.util.ArrayList;
import java.util.Scanner;

public class Case2 {

    public static void case2(Biudzetas biudzetas, Scanner scanner) {
        System.out.println("iveskite islaidas: ");
        int id = 1;
        float islaidos = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("iveskite kategorijos indeksa");
        String kategorijosIndeksas = scanner.nextLine();
        System.out.println("iveskite data");
        String localDate = scanner.nextLine();
        System.out.println("iveskite papildoma info");
        String papildomainfo = scanner.nextLine();
        System.out.println("iveskite suvedimo laika");
        String suvedimoLaikas = scanner.nextLine();
        System.out.println("iveskite atsiskaitymo buda");
        String atsiskaitymoBudas = scanner.nextLine();
        String papildomasDuomuo = "is";

        IslaiduIrasai islaiduIrasai = new IslaiduIrasai(
                id, islaidos,
                kategorijosIndeksas,
                localDate,
                papildomainfo, suvedimoLaikas, atsiskaitymoBudas, papildomasDuomuo);
        biudzetas.pridetiIrasus(islaiduIrasai); //prideda irasus i duombaze ArrayList<Irasai>
        biudzetas.pridetiIslaiduIrasus(islaiduIrasai);
        WriteFile.fileOutGoing(biudzetas.getIrasai());

        System.out.println("Isaugotas irasas: ");
        System.out.println(islaiduIrasai);
        ArrayList<Irasas> irasai = biudzetas.getIrasai(); // Get the list of Irasas objects from your Biudzetas
        double totalExpence = TotalIslaiduSum.islaidosSum(irasai);
        System.out.println("viso islaidu: " + totalExpence);
    }
}
