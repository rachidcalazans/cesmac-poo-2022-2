import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteEstoque {

    Tiproduto.G = new Flau("Goiaba", 0.50, 8, 1.00);
    @Test
    void TesteEstoqueGoiaba(){
        Assertions.assertEquals(Tiproduto.G.retornarNomeProduto(), "Goiaba");
        Assertions.assertEquals(Tiproduto.G.retornarPreco(), 0.50);
        Assertions.assertEquals(Tiproduto.G.retornarQuantidade(), 8);
    }
