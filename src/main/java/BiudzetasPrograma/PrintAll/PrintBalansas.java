package BiudzetasPrograma.PrintAll;

import BiudzetasPrograma.Biudzetas;
import BiudzetasPrograma.Irasas;
import BiudzetasPrograma.IslaiduIrasai;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

public class PrintBalansas {

    public static void printBalansoduomenys(Biudzetas biudzetas) {

        var bendraSuma = biudzetas.bendrasBalansas();
        System.out.println("======== Blanso ataskaita========");
        System.out.println("Viso saskaitoje pinigu: " + bendraSuma);
        System.out.println("=================================");
        System.out.println();

    }

}
