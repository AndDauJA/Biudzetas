package BiudzetasPrograma;

import BiudzetasPrograma.Irasas;

public class PajamuIrasai extends Irasas {
    String kodasPajama="p";
    private static int id;

    public PajamuIrasai(double piniguSuma,
                        String kategorijosIndeksas,
                        String data,
                        String papildomaInformacija,
                        String suvedimoLaikas,
                        String atsiskaitymoBudas,
                        String kodas) {
        super(id++, piniguSuma,
                kategorijosIndeksas,
                data,
                papildomaInformacija,
                suvedimoLaikas,
                atsiskaitymoBudas, kodas);



    }

    //@Override
//    public String toString() {
//        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
//                id, piniguSuma,
//                kategorijosIndeksas,
//                data,
//                suvedimoLaikas,
//                papildomaInformacija,
//                atsiskaitymoBudas,kodas);
//    }
}

//    @Override
//    public String toString() {
//
//        return String.format(
//                "{iraso Nr. [%s],  " +
//                        "Pajamu ivesta: %s \u20AC," +
//                        " kategorijos Indeksas: %s," +
//                        " Data: %s,Laikas: %s, " +
//                        "Atsiskaitymo budas %s} \n",
//                id, piniguSuma,
//                kategorijosIndeksas,
//                data,
//                suvedimoLaikas,
//                papildomaInformacija,
//                atsiskaitymoBudas);
//    }

