package BiudzetasPrograma;

public class IslaiduIrasai extends Irasas {
    String kodasIslaida = "is";
    private static int id;

    public IslaiduIrasai(double piniguSuma,
                         String kategorijosIndeksas,
                         String data,
                         String papildomaInformacija,
                         String suvedimoLaikas,
                         String atsiskaitymoBudas,
                         String kodas) {
        super(id++, piniguSuma, kategorijosIndeksas, data, papildomaInformacija, suvedimoLaikas, atsiskaitymoBudas, kodas);

    }
}

