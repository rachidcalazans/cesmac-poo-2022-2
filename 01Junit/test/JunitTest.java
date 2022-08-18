// Importando classes da biblioteca do JUnit que foi instalada dentro da pasta lib
import org.junit.jupiter.api.Assertions; // Libera métodos para assertividades como `Assertions.assertEquals`
import org.junit.jupiter.api.Test; // Libera métodos gerais para testes, assim como a anotação `@Test`

public class JunitTest {
    @Test // Anotação necessária para poder o método abaixo ser considerado um método de Teste
    void primeiroTesteSucesso() {
        // primeiro é a expectativa
        // segundo é o resultado
        Assertions.assertEquals(true, 1 == 1);
    }

    @Test
    void segundoTesteFalha() {
        Assertions.assertEquals(true, 1 == 2);
    }
}
