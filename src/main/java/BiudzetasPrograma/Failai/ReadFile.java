package BiudzetasPrograma.Failai;

import BiudzetasPrograma.Irasas;
import BiudzetasPrograma.IslaiduIrasai;
import BiudzetasPrograma.PajamuIrasai;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {

    public static void nuskaitytiIsFailo(ArrayList<Irasas> duomenys) {
        try {
            var reader = new BufferedReader(new FileReader("./src/Irasai.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                Irasas irasas = null;

                if (line != null && line.contains("p")) {
                    irasas = new PajamuIrasai(
                            Float.parseFloat(tokens[1]),
                            tokens[2],
                            tokens[3],
                            tokens[4],
                            tokens[5],
                            tokens[6],
                            tokens[7]
                    );
                } else if (line != null && line.contains("is")) {
                    irasas = new IslaiduIrasai(
                            Float.parseFloat(tokens[1]),
                            tokens[2],
                            tokens[3],
                            tokens[4],
                            tokens[5],
                            tokens[6],
                            tokens[7]
                    );
                }

                if (irasas != null) {
                    duomenys.add(irasas);

                }
            }
            String printOut = reader.lines().toList().toString();
            System.out.println(printOut);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//        } catch (FileNotFoundException ex) {
//            throw new RuntimeException(ex);
//        } catch (IOException ex) {
//            throw new RuntimeException(ex);
//
    }
}



