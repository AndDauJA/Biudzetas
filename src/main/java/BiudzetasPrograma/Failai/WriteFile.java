package BiudzetasPrograma.Failai;

import BiudzetasPrograma.Irasas;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.*;
import java.util.ArrayList;

import static BiudzetasPrograma.PrintAll.PrintLn.print;

public class WriteFile implements Serializable {


    public static void fileOutGoing(ArrayList<Irasas> irasas) throws IOException {

       var path="./src/main/files/Irasai.txt";

        //writeToJSONFile(irasas);
        try {
            var writer = new BufferedWriter(new FileWriter(path, false));

            for (Irasas enterLine : irasas) {
                writer.write(enterLine.toString());
                writer.newLine();
            }
            writer.flush();
            writer.close();
            print("");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void writeToJSONFile(ArrayList<Irasas> irasas) throws IOException {
        var jasonPath="./src/main/files/JasonTipoIrasai.json";
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(new FileWriter(new File(jasonPath)), irasas);
    }
}








