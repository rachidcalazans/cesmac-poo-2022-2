import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VerificaEstoqueTest {
    @Test
    void testando(){
        Flau flau = new Flau("Goiaba", 2.00);
        Assertions.assertEquals("Goiaba", flau.getSabor());

        //Assertions.assertEquals(2, flau.getValor());
    }
}
