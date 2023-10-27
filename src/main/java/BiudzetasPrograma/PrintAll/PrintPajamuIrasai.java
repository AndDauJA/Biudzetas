package BiudzetasPrograma.PrintAll;

import BiudzetasPrograma.Irasas;
import BiudzetasPrograma.TotalPajamuSum;

import static BiudzetasPrograma.PrintAll.PrintLn.print;
import java.util.ArrayList;

public class PrintPajamuIrasai {

    public static void printPajamos(ArrayList<Irasas> irasai) {

        for (Irasas printPajIrasai : irasai) {
            int id = printPajIrasai.getId();
            double piniguSuma = printPajIrasai.getPiniguSuma();
            String kategorijosIndeksas = printPajIrasai.getKategorijosIndeksas();
            String data = printPajIrasai.getData();
            String suvedimoLaikas = printPajIrasai.getSuvedimoLaikas();
            String papildomaInformacija = printPajIrasai.getPapildomaInformacija();
            String atsiskaitymoBudas = printPajIrasai.getAtsiskaitymoBudas();
            String kodas = printPajIrasai.getKodas();
            String kodoZenklas = "p";
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
        double totalIncome = TotalPajamuSum.pajamosSum(irasai);
        System.out.println();
        System.out.println("========Viso pajamu suma=========");
        System.out.println("Viso pajamu: " + totalIncome + "\u20AC");
        System.out.println("=================================");
    }
}
