import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PatoTest {
    @Test
    void emitirSom() {
        Pato pato = new Pato();

        Assertions.assertEquals("quack", pato.emitirSom());
    }

    @Test
    void movimentar() {
        Pato pato = new Pato();

        Assertions.assertEquals("Correndo", pato.movimentar());
    }
}