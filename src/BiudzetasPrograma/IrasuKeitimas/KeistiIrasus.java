package BiudzetasPrograma.IrasuKeitimas;

import BiudzetasPrograma.Irasas;

import java.util.List;
import java.util.Scanner;

public class KeistiIrasus {

    public static void koreguotiIrasus(List<Irasas> irasai) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Pasirinkite irasa kuri norite Keisti? === ");
        int irasoId = scanner.nextInt();
        while (true) {
            System.out.println("==========Iraso korekcijos MENU==============");
            System.out.println("1. Sumoas irasa \n 2.Kategorijos indeksa \n 3.Data \n 4.Papildoma informacija \n " +
                    "5.Iraso suvedimo laikas \n 6.Atsiskaitymo budas \n 7.Exit to main meniu");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    KeistiSumosIrasa.keiciamasSumosIrasas(irasai,irasoId,scanner);
                    break;
                case 2:
                    KeistiIndeksoIrasa.keiciamasIndeksoIrasas(irasai, irasoId,scanner);
                    break;
                case 3:
                    KeistiDatosIrasa.keiciamasDatosIrasas(irasai,irasoId,scanner);
                    break;
                case 4:
                        //  papildyti funkcija papildomaInformacija
                case 5:
                        //  papildyti funkcija suvedimoLaikas
                case 6:
                        // papildyti funkcijas atsiskaitymoBudas
                case 7:
                    System.out.println("Griztame i pagrindini Meniu >>>>");
                    System.out.println();
                    return;

            }
        }

    }
}


