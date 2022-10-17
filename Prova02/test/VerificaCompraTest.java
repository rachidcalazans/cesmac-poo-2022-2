import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VerificaCompraTest {
    Cliente clienteMaria = new Cliente("Maria", "Goiaba", 2);
    @Test
    void VerificaClienteMaria(){
        Assertions.assertEquals(clienteMaria.getNome(), "Maria");
        Assertions.assertEquals(clienteMaria.getCompraSabor(), "Goiaba");
        Assertions.assertEquals(clienteMaria.getCompraQtd(), 2);
    }
    Cliente clienteJoao = new Cliente("Maria", "Goiaba", 2);
    @Test
    void VerificaClienteJoao(){
        Assertions.assertEquals(clienteJoao.getNome(), "Joao");
        Assertions.assertEquals(clienteJoao.getCompraSabor(), "Morango");
        Assertions.assertEquals(clienteJoao.getCompraQtd(), 3);
    }
    Cliente clientePedro= new Cliente("Maria", "Goiaba", 2);
    @Test
    void VerificaClientePedro(){
        Assertions.assertEquals(clientePedro.getNome(), "Pedro");
        Assertions.assertEquals(clientePedro.getCompraSabor(), "Menta");
        Assertions.assertEquals(clientePedro.getCompraQtd(), 2);
    }
    /*void VerificaEstoque(){
        Assertions.assertEquals(cliente.getNome(), "Maria");
    }*/
}
