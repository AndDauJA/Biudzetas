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
                islaidos,
                kategorijosIndeksas,
                localDate,
                papildomainfo, suvedimoLaikas, atsiskaitymoBudas, papildomasDuomuo);
        biudzetas.pridetiIrasus(islaiduIrasai);
        biudzetas.pridetiIslaiduIrasus(islaiduIrasai);
        WriteFile.fileOutGoing(biudzetas.getIrasai());

        System.out.println("Isaugotas irasas: ");
        System.out.println();
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
        System.out.println("========Viso islaidu suma========");
        System.out.println("Viso islaidu: " + totalExpencess);
        System.out.println("=================================");
    }
}
