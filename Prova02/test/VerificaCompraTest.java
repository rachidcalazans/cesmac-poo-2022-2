import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VerificaCompraTest {
    Cliente cliente = new Cliente("Maria", "Goiaba", 2);
    @Test
    void VerificaNomeCliente(){
        Assertions.assertEquals(cliente.getNome(), "Maria");
        Assertions.assertEquals(cliente.getCompraSabor(), "Goiaba");
        Assertions.assertEquals(cliente.getCompraQtd(), 2);
    }
}
