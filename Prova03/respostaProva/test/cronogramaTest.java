import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.Tracks;

public class cronogramaTest {
    @Test
    void lists(){
        Tracks generator = new Tracks();
        generator.printTracks();
        Assertions.assertEquals("Diminuindo tempo de execução de testes em aplicações Rails enterprise 60min", generator);
    }
}
