// Importando classes da biblioteca do JUnit que foi instalada dentro da pasta lib
import org.junit.jupiter.api.Assertions; // Libera métodos para assertividades como `Assertions.assertEquals`
import org.junit.jupiter.api.Test; // Libera métodos gerais para testes, assim como a anotação `@Test`

public class JunitTest {
    @Test
    void primeiroTesteSucesso() {
        String nome = "Gustavo";
        Assertions.assertEquals("Gustavo", nome);
    }

    @Test
    void segundoTesteFalha() {
        String nome = "Gusavo"
        Assertions.assertEquals("Gustavo", nome);
    }
}
