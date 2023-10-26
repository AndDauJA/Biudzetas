package BiudzetasPrograma;

public class PajamuIrasai extends Irasas {
    String kodasPajama = "p";
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


}
