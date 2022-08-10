package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class jeyunitTest {
    @Test
    void primeiroTestedeSucesso(){
        String name = "Lucas";
        Assertions.assertEquals("Lucas", name);
    }
    @Test
    void segundoTesteFalho(){
        String lastname = "Fidelis";
        Assertions.assertEquals("Lucas", lastname);
    }
}
