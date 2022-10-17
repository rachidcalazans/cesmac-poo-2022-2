import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VerificaLucroTest {

    Flau flauGoiaba = new Flau("Goiaba", 0.50, 8, 1.00);
    @Test
    void VerificaEstoqueGoiaba(){
        Assertions.assertEquals(flauGoiaba.getSabor(), "Goiaba");
        Assertions.assertEquals(flauGoiaba.getValor(), 0.50);
        Assertions.assertEquals(flauGoiaba.getEstoque(), 8);
        Assertions.assertEquals(flauGoiaba.getLucro(), 1.00);
    }
    Flau flauMorango = new Flau("Morango", 0.75, 7, 1.50);
    @Test
    void VerificaEstoqueMorango(){
        Assertions.assertEquals(flauMorango.getSabor(), "Morango");
        Assertions.assertEquals(flauMorango.getValor(), 0.75);
        Assertions.assertEquals(flauMorango.getEstoque(), 7);
        Assertions.assertEquals(flauMorango.getLucro(), 1.50);
    }
    Flau flauMacaVerde = new Flau("Maça verde", 0.75, 3, 5.25);
    @Test
    void VerificaEstoqueMacaVerde(){
        Assertions.assertEquals(flauMacaVerde.getSabor(), "Maça verde");
        Assertions.assertEquals(flauMacaVerde.getValor(), 0.75);
        Assertions.assertEquals(flauMacaVerde.getEstoque(), 3);
        Assertions.assertEquals(flauMacaVerde.getLucro(), 5.25);
    }
    Flau flauNescauNutella = new Flau("Nescau com nutella", 1.00, 7, 3.00);
    @Test
    void VerificaEstoqueNescauNutella(){
        Assertions.assertEquals(flauNescauNutella.getSabor(), "Nescau com nutella");
        Assertions.assertEquals(flauNescauNutella.getValor(), 1.00);
        Assertions.assertEquals(flauNescauNutella.getEstoque(), 7);
        Assertions.assertEquals(flauNescauNutella.getLucro(), 3.00);
    }
    Flau flauMenta = new Flau("Menta", 0.50, 7, 1.50);
    @Test
    void VerificaEstoqueMenta(){
        Assertions.assertEquals(flauMenta.getSabor(), "Menta");
        Assertions.assertEquals(flauMenta.getValor(), 0.50);
        Assertions.assertEquals(flauMenta.getEstoque(), 7);
        Assertions.assertEquals(flauMenta.getLucro(), 1.50);
    }

}
