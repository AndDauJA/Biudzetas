package BiudzetasPrograma;

import BiudzetasPrograma.Failai.WriteFile;

import java.util.ArrayList;

public class AtnaujintiDuomenis {

    public static void atnaujintiDuomenuFaila(ArrayList<Irasas> irasai) {


        WriteFile.fileOutGoing(irasai);
    }
}
