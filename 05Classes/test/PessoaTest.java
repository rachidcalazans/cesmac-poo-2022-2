import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    @Test
    void nomeCompleto() {
        Pessoa pessoa = new Pessoa("Rachid",
                "Calazans");
        Assertions.assertEquals("Rachid Calazans",
                pessoa.nomeCompleto());

        Pessoa pessoa2 = new Pessoa("Carlos",
                "Jose");
        Assertions.assertEquals("Carlos Jose",
                pessoa2.nomeCompleto());
    }
}
