package BiudzetasPrograma;

import java.util.ArrayList;

public class PrintDuomenys {

    public static void printPajamos(ArrayList<PajamuIrasai> pajamuIrasas) {

        for (PajamuIrasai printPajIrasai : pajamuIrasas) {
            int id = printPajIrasai.id;
            double piniguSuma = printPajIrasai.piniguSuma;
            String kategorijosIndeksas = printPajIrasai.kategorijosIndeksas;
            String data = printPajIrasai.data;
            String suvedimoLaikas = printPajIrasai.suvedimoLaikas;
            String papildomaInformacija = printPajIrasai.papildomaInformacija;
            String atsiskaitymoBudas = printPajIrasai.atsiskaitymoBudas;

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

    public static void printIslaidos(ArrayList<IslaiduIrasai> islaiduIrasai) {

        for (IslaiduIrasai printIslIrasai : islaiduIrasai) {
            int id = printIslIrasai.id;
            double piniguSuma = printIslIrasai.piniguSuma;
            String kategorijosIndeksas = printIslIrasai.kategorijosIndeksas;
            String data = printIslIrasai.data;
            String suvedimoLaikas = printIslIrasai.suvedimoLaikas;
            String papildomaInformacija = printIslIrasai.papildomaInformacija;
            String atsiskaitymoBudas = printIslIrasai.atsiskaitymoBudas;

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

    public static void printBendraInfoSaskaitoje(ArrayList<Irasas> irasas) {

        for (Irasas bendriIrasai : irasas) {
            int id = bendriIrasai.id;
            double piniguSuma = bendriIrasai.piniguSuma;
            String kategorijosIndeksas = bendriIrasai.kategorijosIndeksas;
            String data = bendriIrasai.data;
            String suvedimoLaikas = bendriIrasai.suvedimoLaikas;
            String papildomaInformacija = bendriIrasai.papildomaInformacija;
            String atsiskaitymoBudas = bendriIrasai.atsiskaitymoBudas;

            System.out.printf("iraso id: %s, Suma pinigu: %s\u20AC, kategorija: %s, Data:%s, Suvedimo laikas: %s," +
                            " Papildoma informacija: %s, Atsiskaitymo budas: %s%n",
                    id, piniguSuma,
                    kategorijosIndeksas,
                    data,
                    suvedimoLaikas,
                    papildomaInformacija,
                    atsiskaitymoBudas);
        }
    }
    public static void printKeistiIrasus(ArrayList<Irasas> irasas){
        for (Irasas bendriIrasai : irasas) {
            int id = bendriIrasai.id;
            double piniguSuma = bendriIrasai.piniguSuma;
            String kategorijosIndeksas = bendriIrasai.kategorijosIndeksas;
            String data = bendriIrasai.data;
            String suvedimoLaikas = bendriIrasai.suvedimoLaikas;
            String papildomaInformacija = bendriIrasai.papildomaInformacija;
            String atsiskaitymoBudas = bendriIrasai.atsiskaitymoBudas;

            System.out.printf("iraso id: %s, Pinigu Suma: %s\u20AC, kategorija: %s, Data:%s, Suvedimo laikas: %s," +
                            " Papildoma informacija: %s, Atsiskaitymo budas: %s%n",
                    id, piniguSuma,
                    kategorijosIndeksas,
                    data,
                    suvedimoLaikas,
                    papildomaInformacija,
                    atsiskaitymoBudas);
        }

    }
}
