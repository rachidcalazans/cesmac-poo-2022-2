import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YarisTest {

    Yaris yaris = new Yaris();
    @Test
    void modeloTest(){
        Assertions.assertEquals("Yaris", yaris.getModelo());
    }
    @Test
    void anoFabricacaoTest(){
        Assertions.assertEquals(2013, yaris.getAnoFabricacao());
    }
    @Test
    void corTest(){
        Assertions.assertEquals("Branco", yaris.getCor());
    }
    @Test
    void fabricateTest(){
        Assertions.assertEquals("Toyota", yaris.getFabricante());
    }

}