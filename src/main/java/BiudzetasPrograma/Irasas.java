package BiudzetasPrograma;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import static BiudzetasPrograma.PrintAll.PrintLn.print;
import java.time.LocalDate;
@Getter
@Setter


public abstract class Irasas {
    private static int nextId = 0;

    @Setter
    private int id; //ir kitus
    @Setter
    private double piniguSuma;
    @Setter
    private String kategorijosIndeksas; //alga, investicija,

    private LocalDate data; //local date
    @Setter
    private String suvedimoLaikas;
    @Setter
    private String atsiskaitymoBudas;
    @Setter
    private String papildomaInformacija;
    @Setter
    private String kodas;

    public Irasas(int id) {
        this.id =nextId++;
    }

    public Irasas(double piniguSuma,
                  String kategorijosIndeksas,
                  String papildomaInformacija,
                  LocalDate data,
                  String suvedimoLaikas,
                  String atsiskaitymoBudas,
                  String kodas) {
        this.piniguSuma = piniguSuma;
        this.kategorijosIndeksas = kategorijosIndeksas;
        this.papildomaInformacija = papildomaInformacija;
        this.data = data;
        this.suvedimoLaikas = suvedimoLaikas;
        this.atsiskaitymoBudas = atsiskaitymoBudas;
        this.kodas = kodas;
        this.id = nextId++;
    }

    public void setData(String data) {
        this.data = LocalDate.parse(data);
    }

    public void setDataIrasas(String data) {
        if (data == null || data.trim().isEmpty()) {
            print("Warning: Date is empty or null. Setting default date or handling as required.");
            this.data = LocalDate.now(); // Setting to current date as an example
        } else {
            this.data = LocalDate.parse(data);
        }
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                id, piniguSuma, kategorijosIndeksas, data, papildomaInformacija,
                suvedimoLaikas, atsiskaitymoBudas, kodas);
    }
}
