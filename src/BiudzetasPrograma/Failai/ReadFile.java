package BiudzetasPrograma.Failai;

import BiudzetasPrograma.Irasas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

    public static void nuskaitytiIsFailo(Scanner scanner){

        List<Irasas> duomenys = new ArrayList<>();

        try {
            var reader = new BufferedReader(new FileReader("./src/Irasai.txt"));
            String line;
            scanner.useDelimiter(",");
            //duomenys.add(reader);
            String printOut = reader.lines().toList().toString();

            System.out.println(printOut);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
