import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Evento {
    public static void main(String[] args) {
        try {

            // Lê o arquivo
            FileReader ler = new FileReader("Prova03/proposals.txt");
            BufferedReader reader = new BufferedReader(ler);
            String linha;
            while( (linha = reader.readLine()) != null ){
                System.out.println(linha);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}