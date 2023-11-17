package BiudzetasPrograma;

import java.util.List;
import java.util.stream.Collectors;

public class TotalPajamuSum {
    public static double pajamosSum(List<Irasas> irasai) {
        return irasai.stream()
                .filter(pajamosSum -> pajamosSum instanceof PajamuIrasai)
                .mapToDouble(Irasas::getPiniguSuma)
                .sum();
//        double result = 0.0;
//        for (Irasas pajamuSuma : irasai) {
//            if (pajamuSuma instanceof PajamuIrasai) {
//                double pajamos = pajamuSuma.getPiniguSuma();
//                result += pajamos;
//            }
//        }
//        return result;
    }
}

