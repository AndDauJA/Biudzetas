package BiudzetasPrograma.PrintAll;

import BiudzetasPrograma.Irasas;

import static BiudzetasPrograma.PrintAll.PrintLn.print;

import java.time.LocalDate;
import java.util.ArrayList;

public class PrintIslaiduIrasai {
    public static void printIslaidos(ArrayList<Irasas> islaiduIrasas) {
        String kodoZenklas = "is";
        for (Irasas printIslIrasai : islaiduIrasas) {
            int id = printIslIrasai.getId();
            double piniguSuma = printIslIrasai.getPiniguSuma();
            String kategorijosIndeksas = printIslIrasai.getKategorijosIndeksas();
            LocalDate data = printIslIrasai.getData();
            String suvedimoLaikas = printIslIrasai.getSuvedimoLaikas();
            String papildomaInformacija = printIslIrasai.getPapildomaInformacija();
            String atsiskaitymoBudas = printIslIrasai.getAtsiskaitymoBudas();
            String kodas = printIslIrasai.getKodas();

            if (kodas.equals(kodoZenklas)) {
                System.out.printf("iraso id: %s, Islaidos: %s\u20AC, kategorija: %s, Data:%s, Suvedimo laikas: %s," +
                                " Papildoma informacija: %s, Atsiskaitymo budas: %s%n",
                        id, piniguSuma,
                        kategorijosIndeksas,
                        data,
                        suvedimoLaikas,
                        papildomaInformacija,
                        atsiskaitymoBudas);
            }
        }

        double totalExpencess=TotalSumsCalculation.totalSum(islaiduIrasas,kodoZenklas);
        print("");
        print("========Viso islaidu suma========");
        print("Viso islaidu: " + totalExpencess);
        print("=================================");

    }
}