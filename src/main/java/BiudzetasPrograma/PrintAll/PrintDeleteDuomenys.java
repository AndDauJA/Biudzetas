package BiudzetasPrograma.PrintAll;

import BiudzetasPrograma.Irasas;

import java.time.LocalDate;
import java.util.ArrayList;

public class PrintDeleteDuomenys {
    public static void printDeleteData(ArrayList<Irasas> irasas) {

        for (Irasas bendriIrasai : irasas) {
            int id = bendriIrasai.getId();
            double piniguSuma = bendriIrasai.getPiniguSuma();
            String kategorijosIndeksas = bendriIrasai.getKategorijosIndeksas();
            LocalDate data = bendriIrasai.getData();
            String suvedimoLaikas = bendriIrasai.getSuvedimoLaikas();
            String papildomaInformacija = bendriIrasai.getPapildomaInformacija();
            String atsiskaitymoBudas = bendriIrasai.getAtsiskaitymoBudas();
            String kodas = bendriIrasai.getKodas();
            if (kodas.equals("p")) {
                System.out.printf("Irasas==> Iraso id: %s, Suma pinigu: %s\u20AC, kategorija: %s, Data:%s, Suvedimo laikas: %s," +
                                " Papildoma informacija: %s, Atsiskaitymo budas: %s%n",
                        bendriIrasai.getId(),
                        bendriIrasai.getPiniguSuma(),
                        bendriIrasai.getKategorijosIndeksas(),
                        bendriIrasai.getData(),
                        bendriIrasai.getSuvedimoLaikas(),
                        bendriIrasai.getPapildomaInformacija(),
                        bendriIrasai.getAtsiskaitymoBudas(),
                        bendriIrasai.getKodas());

            } else if (kodas.equals("is")) {
                System.out.printf("Irasas==> Iraso id: %s, Islaidos: %s\u20AC, kategorija: %s, Data:%s, Suvedimo laikas: %s," +
                                " Papildoma informacija: %s, Atsiskaitymo budas: %s%n",
                        id, piniguSuma,
                        kategorijosIndeksas,
                        data,
                        suvedimoLaikas,
                        papildomaInformacija,
                        atsiskaitymoBudas, kodas);

            }
        }
    }
}
