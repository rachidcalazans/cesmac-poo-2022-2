import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunityTest {
    @Test
    void primeiroTesteSucesso(){
        String name = "Carlos";
        Assertions.assertEquals( "Carlos", name);
    }
    @Test
    void segundoTesteFalha(){
        String lastname = "Sarmento";
        Assertions.assertEquals("Carlos", lastname);
    }

}
