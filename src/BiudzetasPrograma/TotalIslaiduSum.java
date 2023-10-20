package BiudzetasPrograma;

import java.util.ArrayList;

public class TotalIslaiduSum {
    public static double islaidosSum(ArrayList<Irasas> irasai) {

        double result = 0.0;
        for (Irasas islaiduSuma : irasai) {
            if (islaiduSuma instanceof IslaiduIrasai) {
                double islaidos = islaiduSuma.getPiniguSuma();
                result += islaidos;
            }
        }
        return result;
    }
}
