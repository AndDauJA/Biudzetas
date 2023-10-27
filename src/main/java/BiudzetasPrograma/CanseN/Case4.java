package BiudzetasPrograma.CanseN;

import BiudzetasPrograma.Biudzetas;
import BiudzetasPrograma.Irasas;

public class Case4 {

    public static void deleteEnteredData(Biudzetas biudzetas, int id) {
        var gautiIasai = biudzetas.getIrasai();
        Irasas irasas = null;
        for (int i = 0; i < gautiIasai.size(); i++) {
            irasas = gautiIasai.get(i);
            if (irasas.getId() == id) {
                gautiIasai.remove(i);

            }
        }


    }

}
