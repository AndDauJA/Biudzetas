package BiudzetasPrograma;

import java.util.ArrayList;
import java.util.List;

public class TotalPajamuSum {
    public static double pajamosSum(List<Irasas> irasai) {

        double result = 0.0;
        for (Irasas pajamuSuma : irasai) {
            if (pajamuSuma instanceof PajamuIrasai) {
                double pajamos = pajamuSuma.getPiniguSuma();
                result += pajamos;
            }
        }
        return result;
    }
}

