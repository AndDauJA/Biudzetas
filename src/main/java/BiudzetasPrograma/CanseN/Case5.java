package BiudzetasPrograma.CanseN;

import BiudzetasPrograma.Biudzetas;
import BiudzetasPrograma.Failai.WriteFile;
import BiudzetasPrograma.Irasas;
import BiudzetasPrograma.IrasuKeitimas.KeistiDatosIrasa;
import BiudzetasPrograma.IrasuKeitimas.KeistiIndeksoIrasa;
import BiudzetasPrograma.IrasuKeitimas.KeistiSumosIrasa;
import static BiudzetasPrograma.PrintAll.PrintLn.print;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Case5 {

    public static void koreguotiIrasus(List<Irasas> irasai) throws IOException {
        Scanner scanner = new Scanner(System.in);
        print("=== Pasirinkite irasa kuri norite Keisti? === ");
        int irasoId = scanner.nextInt();
        while (true) {
            print("==========Iraso korekcijos MENU==============");
            print("1. Sumoas irasa \n 2.Kategorijos indeksa \n 3.Data \n 4.Papildoma informacija \n " +
                    "5.Iraso suvedimo laikas \n 6.Atsiskaitymo budas \n 7.Exit to main meniu");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    print("======Pajamu iraso keitimas======");
                    Biudzetas biudzetas=new Biudzetas();
                    KeistiSumosIrasa.keiciamasSumosIrasas(irasai,irasoId,scanner, biudzetas);
                    WriteFile.fileOutGoing(biudzetas.getIrasai());
                    break;
                case 2:
                    print("======Islaidu iraso keitimas======");
                    KeistiIndeksoIrasa.keiciamasIndeksoIrasas(irasai, irasoId,scanner);
                    break;
                case 3:
                    print("======Datos iraso keitimas======");
                    KeistiDatosIrasa.keiciamasDatosIrasas(irasai,irasoId,scanner);
                    break;
                case 4:
                        //  papildyti funkcija papildomaInformacija
                case 5:
                        //  papildyti funkcija suvedimoLaikas
                case 6:
                        // papildyti funkcijas atsiskaitymoBudas
                case 7:
                    print("Griztame i pagrindini Meniu >>>>");
                    print("");
                    return;

            }
        }

    }

}


