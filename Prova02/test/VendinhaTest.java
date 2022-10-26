import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VendinhaTest {
    @Test
    void vendinhaInicial() {
        Vendinha vendinha = new Vendinha();

        Assertions.assertEquals(0, vendinha.saldo());
        Assertions.assertEquals(50, vendinha.estoque().size());
        Assertions.assertEquals(10, vendinha.estoqueDeGoiaba().size());
        Assertions.assertEquals(10, vendinha.estoqueDeMorango().size());
        Assertions.assertEquals(10, vendinha.estoqueDeMacaVerde().size());
        Assertions.assertEquals(10, vendinha.estoqueDeNescauComNutella().size());
        Assertions.assertEquals(10, vendinha.estoqueDeMenta().size());
    }

    @Test
    void vendinhaComVendas() {
        Vendinha vendinha = new Vendinha();

        // Venda para Maria
        vendinha.vender("goiaba");
        vendinha.vender("goiaba");
        vendinha.vender("nescau com nutella");
        vendinha.vender("nescau com nutella");
        vendinha.vender("nescau com nutella");
        vendinha.vender("menta");

        Assertions.assertEquals(4.5, vendinha.saldo());
        Assertions.assertEquals(44, vendinha.estoque().size());
        Assertions.assertEquals(8, vendinha.estoqueDeGoiaba().size());
        Assertions.assertEquals(10, vendinha.estoqueDeMorango().size());
        Assertions.assertEquals(10, vendinha.estoqueDeMacaVerde().size());
        Assertions.assertEquals(7, vendinha.estoqueDeNescauComNutella().size());
        Assertions.assertEquals(9, vendinha.estoqueDeMenta().size());

        // Venda para João
        vendinha.vender("morango");
        vendinha.vender("morango");
        vendinha.vender("morango");
        vendinha.vender("maçã verde");
        vendinha.vender("maçã verde");
        vendinha.vender("maçã verde");
        vendinha.vender("maçã verde");
        vendinha.vender("maçã verde");

        Assertions.assertEquals(10.5, vendinha.saldo());
        Assertions.assertEquals(36, vendinha.estoque().size());
        Assertions.assertEquals(8, vendinha.estoqueDeGoiaba().size());
        Assertions.assertEquals(7, vendinha.estoqueDeMorango().size());
        Assertions.assertEquals(5, vendinha.estoqueDeMacaVerde().size());
        Assertions.assertEquals(7, vendinha.estoqueDeNescauComNutella().size());
        Assertions.assertEquals(9, vendinha.estoqueDeMenta().size());

        // Venda para Pedro
        vendinha.vender("menta");
        vendinha.vender("menta");
        vendinha.vender("maçã verde");
        vendinha.vender("maçã verde");

        Assertions.assertEquals(13.0, vendinha.saldo());
        Assertions.assertEquals(32, vendinha.estoque().size());
        Assertions.assertEquals(8, vendinha.estoqueDeGoiaba().size());
        Assertions.assertEquals(7, vendinha.estoqueDeMorango().size());
        Assertions.assertEquals(3, vendinha.estoqueDeMacaVerde().size());
        Assertions.assertEquals(7, vendinha.estoqueDeNescauComNutella().size());
        Assertions.assertEquals(7, vendinha.estoqueDeMenta().size());
    }
}
