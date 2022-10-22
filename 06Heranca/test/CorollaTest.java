import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CorollaTest {
    Corolla corolla = new Corolla();
    @Test
    void modeloTest(){
        Assertions.assertEquals("Corolla", corolla.getModelo());
    }
    @Test
    void anoFabricacaoTest(){
        Assertions.assertEquals(1966, corolla.getAnoFabricacao());
    }
    @Test
    void corTest(){
        Assertions.assertEquals("Preto", corolla.getCor());
    }
    @Test
    void fabricateTest(){
        Assertions.assertEquals("Toyota", corolla.getFabricante());
    }
}
