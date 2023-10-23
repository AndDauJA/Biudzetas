package BiudzetasPrograma;

public class Balansas {


    private double balansinePajamuSuma;
    private double balansineIslaiduSuma;

    private double bendrasBalansas;

    public Balansas(double balansinePajamuSuma, double balansineIslaiduSuma, double bendrasBalansas) {
        this.balansinePajamuSuma = balansinePajamuSuma;
        this.balansineIslaiduSuma = balansineIslaiduSuma;
        this.bendrasBalansas = bendrasBalansas;
    }

    public double getBalansinePajamuSuma() {
        return balansinePajamuSuma;
    }

    public void setBalansinePajamuSuma(double balansinePajamuSuma) {
        this.balansinePajamuSuma = balansinePajamuSuma;
    }

    public double getBalansineIslaiduSuma() {
        return balansineIslaiduSuma;
    }

    public void setBalansineIslaiduSuma(double balansineIslaiduSuma) {
        this.balansineIslaiduSuma = balansineIslaiduSuma;
    }

    public double getBendrasBalansas() {
        return bendrasBalansas;
    }

    public void setBendrasBalansas(double bendrasBalansas) {
        this.bendrasBalansas = bendrasBalansas;
    }


    @Override
    public String toString() {
        Balansas balansas=new Balansas(balansinePajamuSuma, balansineIslaiduSuma, bendrasBalansas);
        final double result = bendrasBalansas;
        final String formattedResult = String.format("%.2f", result);
        return String.format(" Bendras Islaidu balansas: %s", formattedResult); //isbadyti
    }
}
