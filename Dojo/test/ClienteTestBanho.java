import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ClienteTestBanho {

    @Test
    void exibirNome() {
        Cliente01 cliente01 = new Cliente01();

        Assertions.assertEquals("Duck", cliente01.exibirNome());
    }

    @Test
    void banho() {
        Cliente01 cliente01 = new Cliente01();

        Assertions.assertEquals(20.00, cliente01.banho());
    }

}