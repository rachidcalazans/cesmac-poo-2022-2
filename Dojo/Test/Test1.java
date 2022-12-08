import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    void exibirNome() {
        Cliente1 cliente1 = new Cliente1();
        Assertions.assertEquals("Chip", cliente1.exibirNome());
    }

    @Test
    void banho() {
        Cliente1 cliente1 = new Cliente1();
        Assertions.assertEquals(20.00, cliente1.banho());
    }
}