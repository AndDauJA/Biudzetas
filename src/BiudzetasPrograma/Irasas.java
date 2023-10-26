package BiudzetasPrograma;

public abstract class Irasas {

    private int id; //ir kitus
    private double piniguSuma;
    private String kategorijosIndeksas; //alga, investicija,
    private String data; //local date
    private String suvedimoLaikas;
    private  String atsiskaitymoBudas;
    private  String papildomaInformacija;
    private String kodas;

    public String getKodas() {
        return kodas;
    }

    public void setKodas(String kodas) {
        this.kodas = kodas;
    }

    public Irasas(int id, double piniguSuma,
                  String kategorijosIndeksas,
                  String data,
                  String papildomaInformacija,
                  String suvedimoLaikas,
                  String atsiskaitymoBudas,
                  String kodas) {
        this.id = id;
        this.piniguSuma = piniguSuma;
        this.kategorijosIndeksas = kategorijosIndeksas;
        this.data = data;
        this.papildomaInformacija = papildomaInformacija;
        this.suvedimoLaikas = suvedimoLaikas;
        this.atsiskaitymoBudas = atsiskaitymoBudas;
        this.kodas=kodas;
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

        this.kategorijosIndeksas= kategorijosIndeksas;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPapildomaInformacija() {
        return papildomaInformacija;
    }

    public void setPapildomaInformacija (String papildomaInformacija) {
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
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                id, piniguSuma, kategorijosIndeksas, data, papildomaInformacija,
                suvedimoLaikas, atsiskaitymoBudas, kodas);
    }
}
