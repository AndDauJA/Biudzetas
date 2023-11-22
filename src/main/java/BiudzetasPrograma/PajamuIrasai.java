package BiudzetasPrograma;

import lombok.Getter;

import java.time.LocalDate;

@Getter

public class PajamuIrasai extends Irasas {
    private final LocalDate data;


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

        this.data = data;
    }


}
