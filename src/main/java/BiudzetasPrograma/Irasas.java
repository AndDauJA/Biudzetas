package BiudzetasPrograma;

import java.time.LocalDate;

public abstract class Irasas {
    private static int nextId = 0;
    private int id; //ir kitus
    private double piniguSuma;
    private String kategorijosIndeksas; //alga, investicija,
    private LocalDate data; //local date
    private String suvedimoLaikas;
    private String atsiskaitymoBudas;
    private String papildomaInformacija;
    private String kodas;


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPiniguSuma() {

        return piniguSuma;
    }

    public void setPiniguSuma(double piniguSuma) {

        this.piniguSuma = piniguSuma;
    }

    public String getKategorijosIndeksas() {

        return kategorijosIndeksas;
    }

    public void setKategorijosIndeksas(String kategorijosIndeksas) {

        this.kategorijosIndeksas = kategorijosIndeksas;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(String data) {
        this.data = LocalDate.parse(data);
    }

    public String getPapildomaInformacija() {
        return papildomaInformacija;
    }

    public void setPapildomaInformacija(String papildomaInformacija) {
        this.papildomaInformacija = papildomaInformacija;
    }

    public String getSuvedimoLaikas() {
        return suvedimoLaikas;
    }

    public void setSuvedimoLaikas(String suvedimoLaikas) {
        this.suvedimoLaikas = suvedimoLaikas;
    }

    public String getAtsiskaitymoBudas() {
        return atsiskaitymoBudas;
    }

    public void setAtsiskaitymoBudas(String atsiskaitymoBudas) {
        this.atsiskaitymoBudas = atsiskaitymoBudas;
    }

    public String getKodas() {
        return kodas;
    }

    public void setKodas(String kodas) {
        this.kodas = kodas;
    }

    public void setDataIrasas(String data) {
        if (data == null || data.trim().isEmpty()) {
            System.out.println("Warning: Date is empty or null. Setting default date or handling as required.");
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
