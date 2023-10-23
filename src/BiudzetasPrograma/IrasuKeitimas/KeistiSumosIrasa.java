package BiudzetasPrograma.IrasuKeitimas;

import BiudzetasPrograma.Biudzetas;
import BiudzetasPrograma.Failai.PakeistiWriteToFile;
import BiudzetasPrograma.Failai.WriteFile;
import BiudzetasPrograma.Irasas;

import java.util.List;
import java.util.Scanner;

public class KeistiSumosIrasa {
    public static void keiciamasSumosIrasas(List<Irasas> irasai,
                                            int irasoId,
                                            Scanner scanner,
                                            Biudzetas biudzetas) {
        for (int i = 0; i < irasai.size(); i++) {
            Irasas irasas = irasai.get(i); //irasas- susikure naujas oblektas
            if (irasas.getId() == irasoId) {
                System.out.print("Koreguojama suma \n Iveskite suma:");
                double correct = scanner.nextDouble();
                irasas.setPiniguSuma(correct);
            }break;
        }
       //WriteFile.fileOutGoing(biudzetas.getIrasai());
    }
}
