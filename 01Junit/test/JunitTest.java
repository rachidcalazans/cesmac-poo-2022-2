// Importando classes da biblioteca do JUnit que foi instalada dentro da pasta lib
import org.junit.jupiter.api.Assertions; // Libera métodos para assertividades como `Assertions.assertEquals`
import org.junit.jupiter.api.Test; // Libera métodos gerais para testes, assim como a anotação `@Test`

public class JunitTest {
    @Test // Anotação necessária para poder o método abaixo ser considerado um método de Teste
    void primeiroTesteSucesso() {
        // primeiro é a expectativa
        // segundo é o resultado
        String nome = "carlos";
        Assertions.assertEquals(nome, "carlos");
    }

    @Test
    void segundoTesteFalha() {
        String nome = "carlos";
        Assertions.assertEquals(nome, "joao");
    }
}
