import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TipoVariavelExercicioTest {
    @Test
    void exercicio01() {
        boolean boolean1 = false;
        Boolean boolean2 = true;

        Assertions.assertEquals(false, boolean1);
        Assertions.assertEquals(true, boolean2);

        Assertions.assertNotEquals(boolean1, boolean2);
    }

    @Test
    void exercicio02() {
        int inteiro = 2;
        Integer inteiro2 = 3;

        Assertions.assertNotEquals(inteiro, inteiro2);
        Assertions.assertEquals(inteiro2, inteiro2.intValue());
        Assertions.assertNotEquals(String.valueOf(inteiro), inteiro2.toString());
    }

    @Test
    void exercicio03() {
        float flutuante = 1.1f;
        Float flutuante2 = 1.0F;

        double flutuante3 = 1.0;
        Double flutuante4 = 1.1;

        Assertions.assertNotEquals(flutuante, flutuante2);
        Assertions.assertNotEquals(flutuante, flutuante3);
        Assertions.assertNotEquals(flutuante, flutuante4);
    }

    @Test
    void exercicio04() {
        String string1 = "Uma nova string";
        String string2 = "Uma outra string" + "com" + "oncatenação";

        Assertions.assertNotEquals("Uma nova string!", string1);
        Assertions.assertNotEquals("Uma outra string com oncatenação", string2);
    }

    @Test
    void exercicio05() {
        int[] intArray = new int[4];

        String nomes[] = {"Zé", "Roberto", "Maria", "Joana"};

        Assertions.assertEquals(4, intArray.length);

        Assertions.assertEquals(4, nomes.length);
        Assertions.assertEquals("Zé", nomes[0]);
        Assertions.assertEquals("Roberto", nomes[1]);
        Assertions.assertEquals("Maria", nomes[2]);
        Assertions.assertEquals("Joana", nomes[3]);

        List<String> nomes2 = new ArrayList<String>() {
            {
                add("Zé");
                add("Roberto");
            }
        };
        Assertions.assertEquals(2, nomes2.size());
        Assertions.assertEquals("Zé", nomes2.get(0));
        Assertions.assertEquals("Roberto", nomes2.get(1));

        List<String> nomes3 = new ArrayList<String>();
        List<String> nomes4 = new ArrayList<String>();
        nomes3.add("Maria");
        nomes3.add("Joana");

        Assertions.assertEquals(2, nomes3.size());
        Assertions.assertEquals("Maria", nomes3.get(0));
        Assertions.assertEquals("Joana", nomes3.get(1));
    }
}
