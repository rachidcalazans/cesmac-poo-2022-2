import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperadoresDesafioTest {
    // Desafio
    // Vale 1.5 pontos válido se criar PR até 17/08/2022 23:59:59
    // Implementar o método #calculadora
    // Adicionar assert_equal para cada método de teste com seu respectivo operador
    Integer calculadora(Integer valorA, Integer valorB, String operador) {
        return 0;
    }

    Double calculadora(Double valorA, Double valorB, String operador) {
        return 0.0;
    }

    @Test
    void soma() {
        Assertions.assertEquals(2, calculadora(1, 1, "+"));
    }

    @Test
    void subtracao() { {Assertions.assertEquals(0, calculadora(10, 0, "*"));
    } }

    @Test
    void multiplicacao() {
    }

    @Test
    void potencia() { {Assertions.assertEquals(0, calculadora(0, 1, "**"));}
    }

    @Test
    void divisao() {
    }

    @Test
    void modulo() { {Assertions.assertEquals(0, calculadora(2, 1, "+"));}
    }
}
