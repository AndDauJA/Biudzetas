package BiudzetasPrograma;

import java.time.LocalDate;

public class IslaiduIrasai extends Irasas {
    private static LocalDate data;
    String kodasIslaida = "is";

    public IslaiduIrasai(double piniguSuma,
                         String kategorijosIndeksas,
                         LocalDate data,
                         String papildomaInformacija,
                         String suvedimoLaikas,
                         String atsiskaitymoBudas,
                         String kodas) {
        super(piniguSuma,
                kategorijosIndeksas,
                papildomaInformacija,
                data,
                suvedimoLaikas,
                atsiskaitymoBudas, kodas);


    }
}

