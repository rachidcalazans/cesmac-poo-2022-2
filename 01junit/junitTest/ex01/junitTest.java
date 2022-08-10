import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class junitTest {

    @Test
    void primeiroTesteSucesso(){
        String name = "Heudes";
        Assertions.assertEquals( "Heudes", name);
    }
    @Test
    void segundoTesteFalha(){
        String lastname = "Vinicius";
        Assertions.assertEquals( "Heudes", lastname);
    }
}