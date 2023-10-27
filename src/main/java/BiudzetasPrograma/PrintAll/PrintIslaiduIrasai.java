package BiudzetasPrograma.PrintAll;

import BiudzetasPrograma.Irasas;
import BiudzetasPrograma.TotalIslaiduSum;

import java.util.ArrayList;

public class PrintIslaiduIrasai {
    public static void printIslaidos(ArrayList<Irasas> islaiduIrasas) {

        for (Irasas printIslIrasai : islaiduIrasas) {
            int id = printIslIrasai.getId();
            double piniguSuma = printIslIrasai.getPiniguSuma();
            String kategorijosIndeksas = printIslIrasai.getKategorijosIndeksas();
            String data = printIslIrasai.getData();
            String suvedimoLaikas = printIslIrasai.getSuvedimoLaikas();
            String papildomaInformacija = printIslIrasai.getPapildomaInformacija();
            String atsiskaitymoBudas = printIslIrasai.getAtsiskaitymoBudas();
            String kodas = printIslIrasai.getKodas();
            String kodoZenklas = "is";
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
        double totalExpencess = TotalIslaiduSum.islaidosSum(islaiduIrasas);
        System.out.println();
        System.out.println("========Viso islaidu suma========");
        System.out.println("Viso islaidu: " + totalExpencess);
        System.out.println("=================================");

    }
}
