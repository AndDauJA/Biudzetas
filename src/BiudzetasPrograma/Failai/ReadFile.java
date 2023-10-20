package BiudzetasPrograma.Failai;

import BiudzetasPrograma.Biudzetas;
import BiudzetasPrograma.Irasas;
import BiudzetasPrograma.IslaiduIrasai;
import BiudzetasPrograma.PajamuIrasai;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

    public static void nuskaitytiIsFailo(List<Irasas> duomenys,
                                         ArrayList<PajamuIrasai> pajamDuomenys,
                                         ArrayList<IslaiduIrasai> islaidDuomenys) {
        try (var reader = new BufferedReader(new FileReader("./src/Irasai.txt"))) {
            String line;
            String lastline = null;

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                Irasas irasas = new Irasas(
                        Integer.parseInt(tokens[0]),
                        Float.parseFloat(tokens[1]),
                        tokens[2],
                        tokens[3],
                        tokens[4],
                        tokens[5],
                        tokens[6],
                        tokens[7]
                );
                duomenys.add(irasas);
                lastline = line;
                String kodas = "p";
                if (lastline != null && lastline.contains("p")) {

                    PajamuIrasai pajamuIrasas = new PajamuIrasai(
                            irasas.getId(),
                            irasas.getPiniguSuma(),
                            irasas.getKategorijosIndeksas(),
                            irasas.getData(),
                            irasas.getPapildomaInformacija(),
                            irasas.getSuvedimoLaikas(),
                            irasas.getAtsiskaitymoBudas(),
                            irasas.getKodas()
                    );
                    pajamDuomenys.add(pajamuIrasas);
                } else if (lastline != null && lastline.contains("is")) {
                    IslaiduIrasai islaiduIrasai = new IslaiduIrasai(
                            irasas.getId(),
                            irasas.getPiniguSuma(),
                            irasas.getKategorijosIndeksas(),
                            irasas.getData(),
                            irasas.getPapildomaInformacija(),
                            irasas.getSuvedimoLaikas(),
                            irasas.getAtsiskaitymoBudas(),
                            irasas.getKodas()
                    );
                    islaidDuomenys.add(islaiduIrasai);

                    System.out.println("tokio kodo nera");
                }
            }
            String printOut = reader.lines().toList().toString();
            System.out.println(printOut);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
