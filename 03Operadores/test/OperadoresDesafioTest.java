import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperadoresDesafioTest {
    // Desafio1
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
        Assertions.assertEquals(0, calculadora(0, 0, "+"));
    }

    @Test
    void subtracao() {
    }

    @Test
    void multiplicacao() {Assertions.assertEquals(0, calculadora(10, 0, "*"));
    }

    @Test
    void potencia() {
    }

    @Test
    void divisao() {Assertions.assertEquals(0, calculadora(1, 2, "/"));
    }

    @Test
    void modulo() {
    }
}
