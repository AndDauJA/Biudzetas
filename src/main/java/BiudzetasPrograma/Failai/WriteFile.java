package BiudzetasPrograma.Failai;

import BiudzetasPrograma.Irasas;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.*;
import java.util.ArrayList;

public class WriteFile implements Serializable {


    public static void fileOutGoing(ArrayList<Irasas> irasas) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(new FileWriter(new File("./src/main/java/BiudzetasPrograma/JasonTipoIrasai.json")), irasas);

        try {
            var writer = new BufferedWriter(new FileWriter("./src/main/java/BiudzetasPrograma/Irasai.txt", false));

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








