package BiudzetasPrograma.PrintAll;

import BiudzetasPrograma.Irasas;
import BiudzetasPrograma.IslaiduIrasai;
import BiudzetasPrograma.PajamuIrasai;


import java.util.List;


public class TotalSumsCalculation {
    public static double totalSum(List<Irasas> irasai,String filterCriteria) {
        double sum = irasai.stream()
                .filter(irasas -> irasas instanceof IslaiduIrasai || irasas instanceof PajamuIrasai) // Filter only IslaiduIrasai objects
                .filter(irasas -> irasas.getKodas().contains(filterCriteria))
                .mapToDouble(Irasas::getPiniguSuma)
                .sum();

        return sum;

    }

}