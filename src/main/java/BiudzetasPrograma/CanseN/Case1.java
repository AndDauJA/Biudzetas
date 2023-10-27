package BiudzetasPrograma.CanseN;

import BiudzetasPrograma.*;
import BiudzetasPrograma.Failai.WriteFile;
import static BiudzetasPrograma.PrintAll.PrintLn.print;
import java.util.ArrayList;
import java.util.Scanner;

public class Case1 {

    public static void case1(Biudzetas biudzetas, Scanner scanner) {
       // WriteFile faileOut = new WriteFile();
        System.out.println("iveskite pajamas: ");
//        int id = 1;
        float pajamos = scanner.nextFloat();
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
        String papildomasDuomuo = "p";

        PajamuIrasai pajamuIrasai = new PajamuIrasai(
                pajamos,
                kategorijosIndeksas,
                localDate,
                papildomainfo, suvedimoLaikas, atsiskaitymoBudas, papildomasDuomuo);
        biudzetas.pridetiIrasus(pajamuIrasai); //prideda irasus i duombaze ArrayList<Irasai>
        biudzetas.pridetiPajamuIrasus(pajamuIrasai);
        WriteFile.fileOutGoing(biudzetas.getIrasai());

        print("Isaugotas irasas: ");
        print("");
        System.out.printf("iraso id:, Pajamos: %s\u20AC, kategorija: %s, Data:%s, Suvedimo laikas: %s," +
                        " Papildoma informacija: %s, Atsiskaitymo budas: %s, domuo %s%n",
                pajamos,
                kategorijosIndeksas,
                localDate,
                suvedimoLaikas,
                papildomainfo,
                atsiskaitymoBudas,"p");

        ArrayList<Irasas> irasai = biudzetas.getIrasai();
        double totalIncome = TotalPajamuSum.pajamosSum(irasai);
        print("========Viso pajamu suma=========");
        print("Viso pajamu: " + totalIncome + "\u20AC");
        print("=================================");

    }

}
