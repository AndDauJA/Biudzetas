package BiudzetasPrograma.Failai;

import BiudzetasPrograma.Irasas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFile {
    public static void fileOutGoing(ArrayList<Irasas> irasas) {

        try {
            var writer = new BufferedWriter(new FileWriter("./src/Irasai.txt", false));
//
            for (Irasas enterLine : irasas) {
                writer.write(enterLine.toString());
                writer.newLine();
            }
            writer.flush();
            writer.close();
            System.out.println();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}








