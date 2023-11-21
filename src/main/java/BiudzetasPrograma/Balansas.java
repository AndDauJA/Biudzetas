package BiudzetasPrograma;

import lombok.Setter;

public class Balansas {

    @Setter
    private double balansinePajamuSuma;
    @Setter
    private double balansineIslaiduSuma;
    @Setter
    private double bendrasBalansas;

    public Balansas(double balansinePajamuSuma, double balansineIslaiduSuma, double bendrasBalansas) {
        this.balansinePajamuSuma = balansinePajamuSuma;
        this.balansineIslaiduSuma = balansineIslaiduSuma;
        this.bendrasBalansas = bendrasBalansas;
    }

    public double getBalansinePajamuSuma() {
        return balansinePajamuSuma;
    }


    public double getBalansineIslaiduSuma() {
        return balansineIslaiduSuma;
    }


    public double getBendrasBalansas() {
        return bendrasBalansas;
    }


}
