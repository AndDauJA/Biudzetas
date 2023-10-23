package BiudzetasPrograma.CanseN;

import BiudzetasPrograma.Biudzetas;
import BiudzetasPrograma.Failai.WriteFile;
import BiudzetasPrograma.Irasas;

import java.util.ArrayList;
import java.util.List;

public class Case4 {

    public static void deleteEnteredData(List<Irasas> irasai, int id) {

        for (int i = 0; i < irasai.size(); i++) {
            Irasas irasas = irasai.get(i);
            if (irasas.getId() == id) {
                irasai.remove(i);

            }
        }

    }

}
