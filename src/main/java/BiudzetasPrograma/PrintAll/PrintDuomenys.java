package BiudzetasPrograma.PrintAll;

import BiudzetasPrograma.Irasas;

import java.util.ArrayList;

public class PrintDuomenys {
    public static void printBendraInfoSaskaitoje(ArrayList<Irasas> irasas) {
        //Biudzetas biudzetas=new Biudzetas();
        for (Irasas bendriIrasai : irasas) {
            int id = bendriIrasai.getId();
            double piniguSuma = bendriIrasai.getPiniguSuma();
            String kategorijosIndeksas = bendriIrasai.getKategorijosIndeksas();
            String data = bendriIrasai.getData();
            String suvedimoLaikas = bendriIrasai.getSuvedimoLaikas();
            String papildomaInformacija = bendriIrasai.getPapildomaInformacija();
            String atsiskaitymoBudas = bendriIrasai.getAtsiskaitymoBudas();
            String kodas = bendriIrasai.getKodas();
            if (kodas.equals("p")) {
                System.out.printf("Pajamu irasai \n Iraso id: %s, Suma pinigu: %s\u20AC, kategorija: %s, Data:%s, Suvedimo laikas: %s," +
                                " Papildoma informacija: %s, Atsiskaitymo budas: %s%n",
                        id, piniguSuma,
                        kategorijosIndeksas,
                        data,
                        suvedimoLaikas,
                        papildomaInformacija,
                        atsiskaitymoBudas, kodas);
            } else if (kodas.equals("is")) {
                System.out.printf("Islaidu irasai \n Iraso id: %s, Islaidos: %s\u20AC, kategorija: %s, Data:%s, Suvedimo laikas: %s," +
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

    public static void printKeistiIrasus(ArrayList<Irasas> irasas) {
        for (Irasas bendriIrasai : irasas) {
            int id = bendriIrasai.getId();
            double piniguSuma = bendriIrasai.getPiniguSuma();
            String kategorijosIndeksas = bendriIrasai.getKategorijosIndeksas();
            String data = bendriIrasai.getData();
            String suvedimoLaikas = bendriIrasai.getSuvedimoLaikas();
            String papildomaInformacija = bendriIrasai.getPapildomaInformacija();
            String atsiskaitymoBudas = bendriIrasai.getAtsiskaitymoBudas();

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

