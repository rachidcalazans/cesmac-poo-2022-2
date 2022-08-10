package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunityTest {
    @Test
    void firstTestSuccess(){
        String name = "Ian";
        Assertions.assertEquals( "Ian", name);
    }
    @Test
    void secondTestFailure(){
        String surname = "Rapini";
        Assertions.assertEquals("Ian", surname);
    }

}
