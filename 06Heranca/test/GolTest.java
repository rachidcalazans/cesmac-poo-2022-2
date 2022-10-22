import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GolTest {

    Gol gol = new Gol();
    @Test
    void modeloTest(){
        Assertions.assertEquals("Gol", gol.getModelo());
    }
    @Test
    void anoFabricacaoTest(){
        Assertions.assertEquals(2016, gol.getAnoFabricacao());
    }
    @Test
    void corTest(){
        Assertions.assertEquals("Vermelho", gol.getCor());
    }
    @Test
    void fabricateTest(){
        Assertions.assertEquals("Wolkswagen", gol.getFabricate());
    }

}
