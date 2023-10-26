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

    public static void nuskaitytiIsFailo(ArrayList<Irasas> duomenys,
                                         ArrayList<PajamuIrasai> pajamDuomenys,
                                         ArrayList<IslaiduIrasai> islaidDuomenys) {
        try {
            var reader = new BufferedReader(new FileReader("./src/Irasai.txt"));

            String line;
            String lastline = null;

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                Irasas irasas = null;
//                if (line != null && line.contains("p")) {
//                    irasas = new PajamuIrasai();
//                } else if (line != null && line.contains("is")) {
//                    irasas = new IslaiduIrasai();
//                }

                if (irasas != null) {
                    irasas.setId(Integer.parseInt(tokens[0]));
                    //ir kiti setteriai
                    irasas.setPiniguSuma(Float.parseFloat(tokens[1]));
                    irasas.setKategorijosIndeksas(tokens[2]);
                    irasas.setData(tokens[3]);
                    irasas.setPapildomaInformacija(tokens[4]);
                    irasas.setSuvedimoLaikas(tokens[5]);
                    irasas.setAtsiskaitymoBudas(tokens[6]);
                    irasas.setKodas(tokens[7]);
                }

                duomenys.add(irasas);
                lastline = line;
                String kodas = "p";
                if (lastline != null && lastline.contains("p")) {

                    PajamuIrasai pajamuIrasas = new PajamuIrasai(
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
