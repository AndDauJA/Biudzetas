package BiudzetasPrograma;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Biudzetas {

    private final ArrayList<PajamuIrasai> pajamuIrasai;
    private final ArrayList<IslaiduIrasai> islaiduIrasai;

    private final ArrayList<Irasas> irasai;
    private int nextId;
    private int nextPId;
    private int nextIId;

    public ArrayList<Irasas> getIrasai() {
        return irasai;
    }

    public Biudzetas() {
        this.irasai = new ArrayList<>();
        this.pajamuIrasai = new ArrayList<>();
        this.islaiduIrasai = new ArrayList<>();
        this.nextId = 1;
        this.nextPId = 1;
        this.nextIId = 1;

    }

    public void setPId(int nextPId) {
        this.nextPId = nextPId;

    }

    public int getPId() {
        return nextPId;
    }

    public void setIId(int nextIId) {
        this.nextIId = nextIId;

    }

    public int getIId() {
        return nextIId;
    }


    public void pridetiIrasus(Irasas irasas) {      //bendras metodas prideti irasa
        irasas.setId(nextId);
        irasai.add(irasas);
        nextId++;
    }

    public void pridetiPajamuIrasus(PajamuIrasai pajamuIrasas) {

        setPId(nextPId);
        pajamuIrasai.add(pajamuIrasas);
        nextPId++;
    }

    public void pridetiIslaiduIrasus(IslaiduIrasai islaiduIrasas) {

        setIId(nextIId);
        islaiduIrasai.add(islaiduIrasas);
        nextIId++;
    }

    public ArrayList<PajamuIrasai> getPajamuIrasai() {
        return pajamuIrasai;
    }

    public ArrayList<IslaiduIrasai> getIslaiduIrasai() {
        return islaiduIrasai;
    }

//    @Override
//    public String toString() {
//        StringBuilder printResult = new StringBuilder();
//        for (Irasas printIrasai : irasai) {
//            printResult.append(String.format("{iraso Nr. %s, Suma Eurais: %s \u20AC, " +
//                            "Kategorijos Indeksas: %s, " +
//                            "Data: %s, " +
//                            "Suvedimo laikas: %s, " +
//                            "Atsiskaitymo budas: %s} \n",
//                    printIrasai.getId(),
//                    printIrasai.getPiniguSuma(),
//                    printIrasai.getKategorijosIndeksas(),
//                    printIrasai.getData(),
//                    printIrasai.getSuvedimoLaikas(),
//                    printIrasai.getAtsiskaitymoBudas()));
//        }
//        return printResult.toString();
//    }
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
                    printIrasai.getAtsiskaitymoBudas(),printIrasai.getKodas()));
        }
        return printResult.toString();
    }
    ;
}

