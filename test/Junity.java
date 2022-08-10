import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Junity {
    @Test
    void primeiroTesteSucesso(){
        String name = "Kaylanne";
        Assertions.assertEquals( "Kaylanne", name);
    }

    @Test
    void segundoTesteFalha(){
        String lastname = "Regina";
        Assertions.assertEquals("Kaylanne", lastname);
    }
}
