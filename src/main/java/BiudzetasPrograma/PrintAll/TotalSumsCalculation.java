package BiudzetasPrograma.PrintAll;

import BiudzetasPrograma.Irasas;
import BiudzetasPrograma.PajamuIrasai;

import java.util.List;

public class TotalSumsCalculation {
    public static double totalSum(List<Irasas> irasai) {

        double sum = irasai.stream()
                .mapToDouble(Irasas::getPiniguSuma)
                .sum();
        return sum;
    }
}
