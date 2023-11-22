package BiudzetasPrograma.PrintAll;

import BiudzetasPrograma.Irasas;

import java.time.LocalDate;
import java.util.ArrayList;

public class PrintPiniguIrasai {
    public static void printPinuguSuma(ArrayList<Irasas> pajamuIasai, String papildomasKodas) {
//        String kodoZenklas = "p";
        for (Irasas printPajIrasai : pajamuIasai) {
            int id = printPajIrasai.getId();
            double piniguSuma = printPajIrasai.getPiniguSuma();
            String kategorijosIndeksas = printPajIrasai.getKategorijosIndeksas();
            LocalDate data = printPajIrasai.getData();
            String suvedimoLaikas = printPajIrasai.getSuvedimoLaikas();
            String papildomaInformacija = printPajIrasai.getPapildomaInformacija();
            String atsiskaitymoBudas = printPajIrasai.getAtsiskaitymoBudas();
            String kodas = printPajIrasai.getKodas();

            if (kodas.equals(papildomasKodas)) {
                System.out.printf("iraso id: %s, Pajamos/Islaidos: %s\u20AC, kategorija: %s, Data:%s, Suvedimo laikas: %s," +
                                " Papildoma informacija: %s, Atsiskaitymo budas: %s%n",
                        id, piniguSuma,
                        kategorijosIndeksas,
                        data,
                        suvedimoLaikas,
                        papildomaInformacija,
                        atsiskaitymoBudas);
            }
        }

        //totalIncomeCalculation(pajamuIasai, papildomasKodas);
    }

    public static double totalIncomeCalculation(ArrayList<Irasas> pajamuIasai, String papildomasKodas) {
        //        print("");
//        print("========Viso pajamu suma=========");
//        print("Viso pajamu: " + totalIncome + "\u20AC");
//        print("=================================");
        return TotalSumsCalculation.totalSum(pajamuIasai, papildomasKodas);
    }
}
