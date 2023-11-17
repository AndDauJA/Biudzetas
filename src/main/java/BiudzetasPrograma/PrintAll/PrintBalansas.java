package BiudzetasPrograma.PrintAll;

import BiudzetasPrograma.Biudzetas;

import static BiudzetasPrograma.PrintAll.PrintLn.print;

public class PrintBalansas {

    public static void printBalansoduomenys(Biudzetas biudzetas) {

        var bendraSuma = biudzetas.bendrasBalansas();
        print("======== Blanso ataskaita========");
        print("Viso saskaitoje pinigu: " + bendraSuma);
        print("=================================");
        print("");

    }

}
