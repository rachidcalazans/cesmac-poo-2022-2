import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class junitTest {

    @Test
    void primeiroTesteSucesso(){
        String nome = "Victor";
        Assertions.assertEquals("Victor", nome);
    }
    @Test
    void segundoTesteFalha(){
        String sobrenome = "Hugo";
        Assertions.assertEquals("Victor", sobrenome );
    }

}
