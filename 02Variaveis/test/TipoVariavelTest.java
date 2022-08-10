import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TipoVariavelTest {
    @Test
    void booleanos() {
        boolean boolean1 = true;
        Boolean boolean2 = false;

        Assertions.assertEquals(true, boolean1);
        Assertions.assertEquals(false, boolean2);

        Assertions.assertNotEquals(boolean1, boolean2);
    }

    @Test
    void inteiros() {
        int inteiro = 1;
        Integer inteiro2 = 1;

        Assertions.assertEquals(inteiro, inteiro2);
        Assertions.assertEquals(inteiro, inteiro2.intValue());
        Assertions.assertEquals(String.valueOf(inteiro), inteiro2.toString());
    }

    @Test
    void flutuantes() {
        // f ou F é usado para denotar que o valor desta variável é do tipo float;
        // caso contrário, é tratado como double.
        float flutuante = 1.0f;
        Float flutuante2 = 1.0F;

        double flutuante3 = 1.0;
        Double flutuante4 = 1.0;

        Assertions.assertEquals(flutuante, flutuante2);
        Assertions.assertEquals(flutuante, flutuante3);
        Assertions.assertEquals(flutuante, flutuante4);
    }

    @Test
    void strings() {
        String string1 = "Uma nova string";
        String string2 = "Uma outra string" + " com " + "concatenação";

        Assertions.assertEquals("Uma nova string", string1);
        Assertions.assertEquals("Uma outra string com concatenação", string2);
    }

    @Test
    void listas() {
        // O tamanho do array precisa ter o tamanho na inicialização
        int[] intArray = new int[2];

        // Outra maneira de declarar e inicializar
        String nomes[] = {"Zé", "Roberto", "Maria", "Joana"};

        Assertions.assertEquals(2, intArray.length);

        Assertions.assertEquals(4, nomes.length);
        Assertions.assertEquals("Zé", nomes[0]);
        Assertions.assertEquals("Roberto", nomes[1]);
        Assertions.assertEquals("Maria", nomes[2]);
        Assertions.assertEquals("Joana", nomes[3]);

        ArrayList<String> nomes2 = new ArrayList<String>() {
            {
                add("Zé");
                add("Roberto");
            }
        };
        Assertions.assertEquals(2, nomes2.size());
        Assertions.assertEquals("Zé", nomes2.get(0));
        Assertions.assertEquals("Roberto", nomes2.get(1));

        List<String> nomes3 = new ArrayList<String>();
        Assertions.assertEquals(0, nomes3.size());

        nomes3.add("Maria");
        nomes3.add("Joana");

        Assertions.assertEquals(2, nomes3.size());
        Assertions.assertEquals("Maria", nomes3.get(0));
        Assertions.assertEquals("Joana", nomes3.get(1));
    }
}