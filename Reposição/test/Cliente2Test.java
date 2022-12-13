import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class Cliente2Test {

    @Test
    void exibirNome() {
        Cliente2 cliente2 = new Cliente2();

        Assertions.assertEquals("Lucy", cliente2.exibirNome());
    }

    @Test
    void tosa() {
        Cliente2 cliente2 = new Cliente2();

        Assertions.assertEquals(25.00, cliente2.tosa());
    }

}