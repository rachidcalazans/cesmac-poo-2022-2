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
        Assertions.assertEquals(1980, gol.getAnoFabricacao());
    }
    @Test
    void corTest(){
        Assertions.assertEquals("Vermelho", gol.getCor());
    }
    @Test
    void fabricateTest(){
        Assertions.assertEquals("Volkswagen", gol.getFabricante());
    }

}
