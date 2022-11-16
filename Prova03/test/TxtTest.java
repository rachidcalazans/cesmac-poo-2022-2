import org.junit.jupiter.api.Test;

import java.io.FileReader;
import  java.io.*;

public class TxtTest {

    @Test
    /*private static*/ void ler() {
        File dir = new File("C:\\Users\\cesmac.ACADEMICO\\IdeaProjects\\aula1\\cesmac-poo-2022-2\\Prova03");
        File arq = new File(dir, "proposals.txt.txt");

        try {
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}