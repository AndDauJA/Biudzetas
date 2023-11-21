package BiudzetasPrograma;

import lombok.Getter;

import java.time.LocalDate;
@Getter

public class PajamuIrasai extends Irasas {
    private static  LocalDate data;
    //String kodasPajama = "p";

    public PajamuIrasai(double piniguSuma,
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
