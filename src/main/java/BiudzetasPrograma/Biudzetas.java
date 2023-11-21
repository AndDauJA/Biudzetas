package BiudzetasPrograma;

import BiudzetasPrograma.PrintAll.TotalSumsCalculation;

import java.util.ArrayList;

public class Biudzetas {

    private final ArrayList<PajamuIrasai> pajamuIrasai;
    private final ArrayList<IslaiduIrasai> islaiduIrasai;
    private final ArrayList<Irasas> irasai;

    public Biudzetas() {
        this.irasai = new ArrayList<>();
        this.pajamuIrasai = new ArrayList<>();
        this.islaiduIrasai = new ArrayList<>();

    }

    public ArrayList<Irasas> getIrasai() {
        return irasai;
    }

    public void pridetiIrasus(Irasas irasas) {      //bendras metodas prideti irasa

        irasai.add(irasas);

    }

    public void pridetiPajamuIrasus(PajamuIrasai pajamuIrasas) {


        pajamuIrasai.add(pajamuIrasas);

    }

    public void pridetiIslaiduIrasus(IslaiduIrasai islaiduIrasas) {


        islaiduIrasai.add(islaiduIrasas);

    }

    public ArrayList<PajamuIrasai> getPajamuIrasai() {
        // loop +instance of pajamu irasai

        return pajamuIrasai;
    }

    public ArrayList<IslaiduIrasai> getIslaiduIrasai() {
        return islaiduIrasai;
    }

    public double totalPajamos() {
        String papildomasKodas = "p";
        var result = TotalSumsCalculation.totalSum(irasai, papildomasKodas);
        return result;
    }

    public double totalIslaidu() {
        String papildomasKodas = "is";
        var result = TotalSumsCalculation.totalSum(irasai, papildomasKodas);
        return result;
    }

    public double bendrasBalansas() {
        double result;
        result = totalPajamos() + totalIslaidu();
        return result;
    }


    @Override
    public String toString() {
        StringBuilder printResult = new StringBuilder();
        for (Irasas printIrasai : irasai) {
            printResult.append(String.format("%s,%s,%s,%s,%s,%s,%s",
                    printIrasai.getId(),
                    printIrasai.getPiniguSuma(),
                    printIrasai.getKategorijosIndeksas(),
                    printIrasai.getData(),
                    printIrasai.getSuvedimoLaikas(),
                    printIrasai.getAtsiskaitymoBudas(), printIrasai.getKodas()));
        }
        return printResult.toString();
    }

    ;
}

