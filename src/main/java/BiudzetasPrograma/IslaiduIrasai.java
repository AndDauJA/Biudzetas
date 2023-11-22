package BiudzetasPrograma;

import java.time.LocalDate;

public class IslaiduIrasai extends Irasas {
    private final LocalDate data;


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

        this.data = data;
    }
}

