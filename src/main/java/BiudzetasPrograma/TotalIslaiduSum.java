package BiudzetasPrograma;

import java.util.ArrayList;

public class TotalIslaiduSum {
    public static double islaidosSum(ArrayList<Irasas> irasai) {
        return irasai.stream()
                .filter(islaiduSuma -> islaiduSuma instanceof IslaiduIrasai)
                .mapToDouble(Irasas::getPiniguSuma)
                .sum();

/*
        double result = 0.0;
        for (Irasas islaiduSuma : irasai) {
            if (islaiduSuma instanceof IslaiduIrasai) {
                double islaidos = islaiduSuma.getPiniguSuma();
                result += islaidos;
            }
        }
        return result;
*/
    }
}
