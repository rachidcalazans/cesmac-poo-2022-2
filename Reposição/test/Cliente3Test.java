import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class Cliente3Test {

    @Test
    void exibirNome() {
        Cliente3 cliente3 = new Cliente3();

        Assertions.assertEquals("Wasalsky", cliente3.exibirNome());
    }

    @Test
    void banhoETosa() {
        Cliente3 cliente3 = new Cliente3();

        Assertions.assertEquals(38.25, cliente3.banhoETosa());
    }

}
