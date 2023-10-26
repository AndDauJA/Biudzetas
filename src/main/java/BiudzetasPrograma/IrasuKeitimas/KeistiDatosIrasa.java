package BiudzetasPrograma.IrasuKeitimas;

import BiudzetasPrograma.Irasas;

import java.util.List;
import java.util.Scanner;

public class KeistiDatosIrasa {
    public static void keiciamasDatosIrasas(List<Irasas> irasai, int irasoId, Scanner scanner) {
        for (int i = 0; i < irasai.size(); i++) {
            Irasas irasas = irasai.get(i); //irasas susikure naujas oblektas
            if (irasas.getId() == irasoId) {
                System.out.print("Koreguojama data \n Iveskite data:");
                String correct = scanner.next();
                irasas.setData(correct);
            }
        }
    }
}
