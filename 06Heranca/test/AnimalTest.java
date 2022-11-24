import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalTest {
    @Test
    void emitirSom() {
        Animal animal = new Animal();

        Assertions.assertEquals("Emitindo algum som...", animal.emitirSom());
    }

    @Test
    void movimentar() {
        Animal animal = new Animal();

        Assertions.assertEquals("Andando..", animal.movimentar());
    }
}