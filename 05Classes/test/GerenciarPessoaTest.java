import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GerenciarPessoaTest {
    @Test
    void pessoas() {
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        GerenciarPessoa gp = new GerenciarPessoa(listaPessoas);

        Assertions.assertEquals(new ArrayList<Pessoa>(),
                gp.pessoas());

        Pessoa pessoa1 = new Pessoa("Rachid", "Calazans");
        ArrayList<Pessoa> listaPessoas2 = new ArrayList<>();
        listaPessoas2.add(pessoa1);

        GerenciarPessoa gp2 = new GerenciarPessoa(listaPessoas2);

        Assertions.assertEquals(1, gp2.pessoas().size());
        Assertions.assertEquals("Rachid Calazans", gp2.pessoas().get(0).nomeCompleto());
    }

    @Test
    void addPessoa() {
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        GerenciarPessoa gp = new GerenciarPessoa(listaPessoas);

        Pessoa pessoa1 = new Pessoa("Rachid", "Calazans");
        gp.addPessoa(pessoa1);

        Assertions.assertEquals(1, gp.pessoas().size());
        Assertions.assertEquals("Rachid Calazans", gp.pessoas().get(0).nomeCompleto());
    }
}
