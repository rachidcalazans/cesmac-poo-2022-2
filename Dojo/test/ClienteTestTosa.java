import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteTestTosa {

    @Test
    void exibirNome() {
        Cliente02 cliente02 = new Cliente02();

        Assertions.assertEquals("Mel", cliente02.exibirNome());
    }

    @Test
    void tosa() {
        Cliente02 cliente02 = new Cliente02();

        Assertions.assertEquals(25.00, cliente02.tosa());
    }

}