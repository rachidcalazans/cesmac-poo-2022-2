import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VerificaEstoqueTest {

    Flau flauGoiaba = new Flau("Goiaba", 0.50, 10);
    @Test
    void VerificaEstoqueGoiaba(){
        Assertions.assertEquals(flauGoiaba.getSabor(), "Goiaba");
        Assertions.assertEquals(flauGoiaba.getValor(), 0.50);
        Assertions.assertEquals(flauGoiaba.getEstoque(), 10);
    }
    Flau flauMorango = new Flau("Morango", 0.75, 10);
    @Test
    void VerificaEstoqueMorango(){
        Assertions.assertEquals(flauMorango.getSabor(), "Morango");
        Assertions.assertEquals(flauMorango.getValor(), 0.75);
        Assertions.assertEquals(flauMorango.getEstoque(), 10);
    }
    Flau flauMacaVerde = new Flau("Maça verde", 0.75, 10);
    @Test
    void VerificaEstoqueMacaVerde(){
        Assertions.assertEquals(flauMacaVerde.getSabor(), "Maça verde");
        Assertions.assertEquals(flauMacaVerde.getValor(), 0.75);
        Assertions.assertEquals(flauMacaVerde.getEstoque(), 10);
    }
    Flau flauNescauNutella = new Flau("Nescau com nutella", 1.00, 10);
    @Test
    void VerificaEstoqueNescauNutella(){
        Assertions.assertEquals(flauNescauNutella.getSabor(), "Nescau com nutella");
        Assertions.assertEquals(flauNescauNutella.getValor(), 1.00);
        Assertions.assertEquals(flauNescauNutella.getEstoque(), 10);
    }
    Flau flauMenta = new Flau("Menta", 0.50, 10);
    @Test
    void VerificaEstoqueMenta(){
        Assertions.assertEquals(flauMenta.getSabor(), "Menta");
        Assertions.assertEquals(flauMenta.getValor(), 0.50);
        Assertions.assertEquals(flauMenta.getEstoque(), 10);
    }
}
