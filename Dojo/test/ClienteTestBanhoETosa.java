import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteTestBanhoETosa {

    @Test
    void exibirNome() {
        Cliente03 cliente03 = new Cliente03();

        Assertions.assertEquals("Olaf", cliente03.exibirNome());
    }

    @Test
    void banhoETosa() {
        Cliente03 cliente03 = new Cliente03();

        Assertions.assertEquals(38.25, cliente03.banhoETosa());
    }

}