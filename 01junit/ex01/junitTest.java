import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class junitTest {

    @Test
    void primeiroTesteSucesso(){
        String nome = "Gabriel";
        Assertions.assertEquals( "Gabriel", nome);
    }
    @Test
    void segundoTesteFalha(){
        String sobrenome = "Lacerda";
        Assertions.assertEquals( "Gabriel", sobrenome);
    }

}
