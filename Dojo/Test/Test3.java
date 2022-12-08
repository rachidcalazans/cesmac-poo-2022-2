import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class Test3 {

    @Test
    void exibirNome() {
        Cliente3 cliente3 = new Cliente3();
        Assertions.assertEquals("Valente", cliente3.exibirNome());
    }

    @Test
    void banhoETosa() {
        Cliente3 cliente3 = new Cliente3();
        Assertions.assertEquals(38.25, cliente3.banhoETosa());
    }
}