package BiudzetasPrograma.CanseN;

import BiudzetasPrograma.*;
import BiudzetasPrograma.Failai.WriteFile;

import java.util.ArrayList;
import java.util.Scanner;

public class Case1 {

    public static void case1(Biudzetas biudzetas, Scanner scanner) {
        WriteFile faileOut = new WriteFile();
        System.out.println("iveskite pajamas: ");
        int id = 1;
        float pajamos = scanner.nextFloat();
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
        String papildomasDuomuo ="p";

        PajamuIrasai pajamuIrasai = new PajamuIrasai(
                id, pajamos,
                kategorijosIndeksas,
                localDate,
                papildomainfo, suvedimoLaikas, atsiskaitymoBudas,papildomasDuomuo);
        biudzetas.pridetiIrasus(pajamuIrasai); //prideda irasus i duombaze ArrayList<Irasai>
        biudzetas.pridetiPajamuIrasus(pajamuIrasai);
        WriteFile.fileOutGoing(biudzetas.getIrasai());

        System.out.println("Isaugotas irasas: ");
        System.out.println();
        System.out.printf("iraso id: %s, Pajamos: %s\u20AC, kategorija: %s, Data:%s, Suvedimo laikas: %s," +
                        " Papildoma informacija: %s, Atsiskaitymo budas: %s",
                id, pajamos,
                kategorijosIndeksas,
                localDate,
                suvedimoLaikas,
                papildomainfo,
                atsiskaitymoBudas);

        ArrayList<Irasas> irasai = biudzetas.getIrasai();
        double totalIncome = TotalPajamuSum.pajamosSum(irasai);
        System.out.println("viso pajamu: " + totalIncome+"\u20AC");

    }

}
