package BiudzetasPrograma.Failai;

import BiudzetasPrograma.Biudzetas;
import BiudzetasPrograma.Irasas;
import BiudzetasPrograma.IslaiduIrasai;
import BiudzetasPrograma.PajamuIrasai;
import static BiudzetasPrograma.PrintAll.PrintLn.print;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {

    public static void nuskaitytiIsFailo(ArrayList<Irasas> duomenys) {
        try {
            var reader = new BufferedReader(new FileReader("./src/main/java/BiudzetasPrograma/Irasai.txt")); //1 funkcija

            String line;
            while ((line = reader.readLine()) != null) {// 1 funkcija
                String[] tokens = line.split(",");  // 1 funkcija
                if (tokens.length < 8) {
                    System.err.println("Invalid line: " + line);
                    continue;
                }
                Irasas irasas = null;
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                try {                                                   // 2 funkcija
                    LocalDate date = LocalDate.parse(tokens[3], formatter);

                    if (line != null && line.contains("p")) {
                        irasas = new PajamuIrasai(
                                Double.parseDouble(tokens[1]),
                                tokens[2],
                                date,
                                tokens[3],
                                tokens[5],
                                tokens[6],
                                tokens[7]
                        );
                    } else if (line != null && line.contains("is")) {
                        irasas = new IslaiduIrasai(
                                Double.parseDouble(tokens[1]),
                                tokens[2],
                                date,
                                tokens[3],
                                tokens[5],
                                tokens[6],
                                tokens[7]
                        );
                    }
                }catch (DateTimeException e){
                    print("Neteisingas Datos formatas:"+line);
                }
                if (irasas != null) {
                    duomenys.add(irasas);
                }
            }
            String printOut = reader.lines().toList().toString();
            print(printOut);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}



