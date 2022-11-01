import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CachorroImplementacaoTest {
    @Test
    void emitirSom() {
        CachorroImplementacao cachorro = new CachorroImplementacao();

        Assertions.assertEquals("Au au", cachorro.emitirSom());
    }

    @Test
    void movimentar() {
        CachorroImplementacao cachorro = new CachorroImplementacao();

        Assertions.assertEquals("Correndo...", cachorro.movimentar());
    }
}
