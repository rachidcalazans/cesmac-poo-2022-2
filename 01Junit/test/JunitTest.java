package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitTest {
    @Test
    void primeiroTesteSucesso(){
        String name = "João";
        Assertions.assertEquals("João", name);
    }
    @Test
    void segundoTesteFalho(){
        String lastname = "Victor";
        Assertions.assertEquals("Victor", lastname);
    }
}
