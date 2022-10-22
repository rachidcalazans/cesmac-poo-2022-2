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
        Assertions.assertEquals(2000, celta.getAnoFabricacao());
    }
    @Test
    void corTest(){
        Assertions.assertEquals("Vermelho", celta.getCor());
    }
    @Test
    void fabricateTest(){
        Assertions.assertEquals("Chevrolet", celta.getFabricante());
    }

}