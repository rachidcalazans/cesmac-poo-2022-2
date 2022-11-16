import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;

public class PessoaTest {
    @Test

    void nomeCompleto(){
        Pessoa pessoa = new Pessoa("Ian", "Rapini");
        Assertions.assertEquals("Ian Rapini",);
            pessoa.nomeCompleto();
    }
}

