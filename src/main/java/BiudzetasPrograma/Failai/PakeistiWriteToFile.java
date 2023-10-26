package BiudzetasPrograma.Failai;

import BiudzetasPrograma.Irasas;

import java.util.ArrayList;

public class PakeistiWriteToFile {
    public static void formatuotasWriteToFile(ArrayList<Irasas> irasas) {

        for (Irasas bendriIrasai : irasas) {
            int id = bendriIrasai.getId();
            double piniguSuma = bendriIrasai.getPiniguSuma();
            String kategorijosIndeksas = bendriIrasai.getKategorijosIndeksas();
            String data = bendriIrasai.getData();
            String suvedimoLaikas = bendriIrasai.getSuvedimoLaikas();
            String papildomaInformacija = bendriIrasai.getPapildomaInformacija();
            String atsiskaitymoBudas = bendriIrasai.getAtsiskaitymoBudas();

            System.out.printf("%s,%s,%s,%s,%s,%s,%s",
                    id, piniguSuma,
                    kategorijosIndeksas,
                    data,
                    suvedimoLaikas,
                    papildomaInformacija,
                    atsiskaitymoBudas);
        }
    }
}
