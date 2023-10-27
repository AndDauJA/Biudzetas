package BiudzetasPrograma.CanseN;

import BiudzetasPrograma.*;
import BiudzetasPrograma.Failai.WriteFile;
import static BiudzetasPrograma.PrintAll.PrintLn.print;
import java.util.ArrayList;
import java.util.Scanner;

public class Case2 {

    public static void case2(Biudzetas biudzetas, Scanner scanner) {
        System.out.println("iveskite islaidas: ");
        int id = 1;
        float islaidos = scanner.nextFloat();
        scanner.nextLine();
        print("iveskite kategorijos indeksa");
        String kategorijosIndeksas = scanner.nextLine();
        print("iveskite data");
        String localDate = scanner.nextLine();
        print("iveskite papildoma info");
        String papildomainfo = scanner.nextLine();
        print("iveskite suvedimo laika");
        String suvedimoLaikas = scanner.nextLine();
        print("iveskite atsiskaitymo buda");
        String atsiskaitymoBudas = scanner.nextLine();
        String papildomasDuomuo = "is";

        IslaiduIrasai islaiduIrasai = new IslaiduIrasai(
                islaidos,
                kategorijosIndeksas,
                localDate,
                papildomainfo, suvedimoLaikas, atsiskaitymoBudas, papildomasDuomuo);
        biudzetas.pridetiIrasus(islaiduIrasai);
        biudzetas.pridetiIslaiduIrasus(islaiduIrasai);
        WriteFile.fileOutGoing(biudzetas.getIrasai());

        print("Isaugotas irasas: ");
        print("");
        System.out.printf("iraso id: %s, Suman pinigu: %s\u20AC, kategorija: %s, Data:%s, Suvedimo laikas: %s," +
                        " Papildoma informacija: %s, Atsiskaitymo budas: %s%n",
                id, islaidos,
                kategorijosIndeksas,
                localDate,
                suvedimoLaikas,
                papildomainfo,
                atsiskaitymoBudas);

        ArrayList<Irasas> irasai = biudzetas.getIrasai();
        double totalExpencess = TotalIslaiduSum.islaidosSum(irasai);
        print("========Viso islaidu suma========");
        print("Viso islaidu: " + totalExpencess);
        print("=================================");
    }
}
