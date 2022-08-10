import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitTest {

    @Test
    void primeiroTesteSucesso(){
        String nome = "Davi";
        Assertions.assertEquals( "Davi", nome);
    }

    @Test
    void segundoTesteFalha(){
        String sobrenome = "Vieira";
        Assertions.assertEquals( "Davi", sobrenome);
    }
}
