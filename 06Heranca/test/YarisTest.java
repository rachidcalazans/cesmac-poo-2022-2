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
        Assertions.assertEquals(2022, yaris.getAnoFabricacao());
    }
    @Test
    void corTest(){
        Assertions.assertEquals("Preto", yaris.getCor());
    }
    @Test
    void fabricateTest(){
        Assertions.assertEquals("Toyota", yaris.getFabricate());
    }

}
