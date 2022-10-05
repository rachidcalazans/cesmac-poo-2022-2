import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConcessionariaTest {

    @Test
    void ConcessionariaTest(){
         double Saldo =0;

        Assertions.assertEquals(00,00);
    }
    @Test
    void VendaCarro() {
        Carro carro = new Carro("Corolla", 150.00);
        Assertions.assertEquals("Corolla", carro.getModelo());
        Assertions.assertEquals(150, carro.getPreco());
    }
}