import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CeltaTest {

    Celta celta = new Celta();
    @Test
    void modeloTest(){
        Assertions.assertEquals("Celta", celta.getModelo());
    }
    @Test
    void anoFabricacaoTest(){
        Assertions.assertEquals(1999, celta.getAnoFabricacao());
    }
    @Test
    void corTest(){
        Assertions.assertEquals("Rosa", celta.getCor());
    }
    @Test
    void fabricateTest(){
        Assertions.assertEquals("Chevrolet", celta.getFabricate());
    }

}
