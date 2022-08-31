import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperadoresDesafioTest {
    // Desafio
    // Vale 1.5 pontos válido se criar PR até 17/08/2022 23:59:59
    // Implementar o método #calculadora
    // Adicionar assert_equal para cada método de
    // teste com seu respectivo operador
    Integer calculadora(Integer valorA, Integer valorB, String operador) {
        if (operador.equals("+")) {
            return valorA + valorB;
        } else if (operador.equals("-")) {
            return valorA - valorB;
        } else if (operador.equals("*")) {
            return valorA * valorB;
        } else if (operador.equals("**")) {
            return (int)Math.pow(valorA, valorB);
        } else if (operador.equals("/")) {
            return valorA / valorB;
        } else if (operador.equals("%")) {
            return valorA % valorB;
        }
        return 0;
    }

    Double calculadora(Double valorA, Double valorB, String operador) {
        if (operador.equals("/")) {
            return valorA / valorB;
        }
        return 0.0;
    }

    @Test
    void soma() {
        Assertions.assertEquals(2, calculadora(1, 1, "+"));
    }

    @Test
    void subtracao() {
        Assertions.assertEquals(1, calculadora(2, 1, "-"));
    }

    @Test
    void multiplicacao() {
        Assertions.assertEquals(2, calculadora(2, 1, "*"));
    }

    @Test
    void potencia() {
        Assertions.assertEquals(4, calculadora(2, 2, "**"));
    }

    @Test
    void divisao() {
        Assertions.assertEquals(1, calculadora(2, 2, "/"));
        Assertions.assertEquals(0.5, calculadora(1.0, 2.0, "/"));
    }

    @Test
    void modulo() {
        Assertions.assertEquals(1, calculadora(5, 2, "%"));
    }
}
