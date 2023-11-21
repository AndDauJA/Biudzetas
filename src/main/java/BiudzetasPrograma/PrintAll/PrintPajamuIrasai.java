package BiudzetasPrograma.PrintAll;

import BiudzetasPrograma.Irasas;

import static BiudzetasPrograma.PrintAll.PrintLn.print;

import java.time.LocalDate;
import java.util.ArrayList;

public class PrintPajamuIrasai {
    public static void printPajamos(ArrayList<Irasas> pajamuIasai) {
        String kodoZenklas = "p";
        for (Irasas printPajIrasai : pajamuIasai) {
            int id = printPajIrasai.getId();
            double piniguSuma = printPajIrasai.getPiniguSuma();
            String kategorijosIndeksas = printPajIrasai.getKategorijosIndeksas();
            LocalDate data = printPajIrasai.getData();
            String suvedimoLaikas = printPajIrasai.getSuvedimoLaikas();
            String papildomaInformacija = printPajIrasai.getPapildomaInformacija();
            String atsiskaitymoBudas = printPajIrasai.getAtsiskaitymoBudas();
            String kodas = printPajIrasai.getKodas();

            if (kodas.equals(kodoZenklas)) {
                System.out.printf("iraso id: %s, Pajamos: %s\u20AC, kategorija: %s, Data:%s, Suvedimo laikas: %s," +
                                " Papildoma informacija: %s, Atsiskaitymo budas: %s%n",
                        id, piniguSuma,
                        kategorijosIndeksas,
                        data,
                        suvedimoLaikas,
                        papildomaInformacija,
                        atsiskaitymoBudas);
            }
        }
        double totalIncome=TotalSumsCalculation.totalSum(pajamuIasai,kodoZenklas);
        print("");
        print("========Viso pajamu suma=========");
        print("Viso pajamu: " + totalIncome + "\u20AC");
        print("=================================");
    }
}
