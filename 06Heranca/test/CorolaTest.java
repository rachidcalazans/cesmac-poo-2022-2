import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CorolaTest {
    Corolla corolla = new Corolla();
    @Test
    void modeloTest(){
        Assertions.assertEquals("Corolla", corolla.getModelo());
    }
    @Test
    void anoFabricacaoTest(){
        Assertions.assertEquals(2017, corolla.getAnoFabricacao());
    }
    @Test
    void corTest(){
        Assertions.assertEquals("Cinza", corolla.getCor());
    }
    @Test
    void fabricateTest(){
        Assertions.assertEquals("Toyota", corolla.getFabricate());
    }
}
