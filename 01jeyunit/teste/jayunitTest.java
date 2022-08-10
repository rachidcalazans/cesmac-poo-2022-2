import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class jayunitTest {

    @Test
    void primeiroTesteSucesso(){
        String name = "Arthur";
        Assertions.assertEquals( "Arthur", name);
    }
    @Test
    void segundoTestFalha(){
        String lastname = "Sarmento";
        Assertions.assertEquals( "Arthur", lastname);
    }
    @Test
    void terceiroTest(){
        String name = "Kenzo";
        Assertions.assertEquals( "Kenzo", name);
    }
}
