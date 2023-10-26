package BiudzetasPrograma.IrasuKeitimas;

import BiudzetasPrograma.Irasas;

import java.util.List;
import java.util.Scanner;

public class KeistiIndeksoIrasa {
    public static void keiciamasIndeksoIrasas(List<Irasas> irasai, int irasoId, Scanner scanner) {
        for (int i = 0; i < irasai.size(); i++) {
            Irasas irasas = irasai.get(i); //irasas susikure naujas oblektas
            if (irasas.getId() == irasoId) {
                System.out.print("Koreguojamas kategorijos indeksas \n Iveskite indeksa:");
                String correct = scanner.next();
                irasas.setKategorijosIndeksas(correct);
            }
        }
    }
}
