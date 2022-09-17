import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    void construtor() {
        Pessoa pessoa = new Pessoa("Gabriel", "Rosendo");

        Assertions.assertEquals("Gabriel", pessoa.getNome());
        Assertions.assertEquals("Rosendo", pessoa.getSobrenome());
        String nomeCompleto = pessoa.getNomeCompleto();
        Assertions.assertEquals("Gabriel Rosendo", nomeCompleto);
    }

}

