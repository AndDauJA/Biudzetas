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

//    public void setBalansinePajamuSuma(double balansinePajamuSuma) {
//        this.balansinePajamuSuma = balansinePajamuSuma;
//    }

    public double getBalansineIslaiduSuma() {
        return balansineIslaiduSuma;
    }

    //    public void setBalansineIslaiduSuma(double balansineIslaiduSuma) {
//        this.balansineIslaiduSuma = balansineIslaiduSuma;
//    }
    public double getBendrasBalansas() {
        return bendrasBalansas;
    }


//    public void setBendrasBalansas(double bendrasBalansas) {
//        this.bendrasBalansas = bendrasBalansas;
//    }
}
