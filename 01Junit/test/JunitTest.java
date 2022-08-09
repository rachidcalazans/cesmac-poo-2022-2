import org.junit.jupiter.api.Test;

public class JunitTest {
    @Test
    void comoDeclarar() {
        // Declare uma variável usando <tipo> <nome>
        int inteiro;

        // Declare múltiplas variáveis em uma única linha
        // <tipo> <nome1>, <nome2>, <nome3>
        int inteiro1, inteiro2, inteiro3;
    }

    @Test
    void comoInicializar() {
        // Inicializa uma variável usando <tipo> <nome> = <val>
        int inteiro = 1;
        Assertions.assertEquals(1, inteiro);

        // Inicializa múltiplas variáveis com mesmo valor
        // declaração <tipo> <nome1>, <nome2>, <nome3>
        // inicialização <name1> = <name2> = <name3> = <val>
        int inteiro1, inteiro2, inteiro3;
        inteiro1 = inteiro2 = inteiro3 = 1;

        Assertions.assertEquals(1, inteiro1);
        Assertions.assertEquals(1, inteiro2);
        Assertions.assertEquals(1, inteiro3);
    }
}
