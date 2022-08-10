import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JuniteTest {

    @Test
    void primeiroTesteSucesso(){
        String nome = "Thiago";
        Assertions.assertEquals("Thiago", nome);

    }
    @Test
    void segundoTesteFalho(){
        String nome = "Tpericles";
        Assertions.assertEquals("Thiago", nome);
    }
}
