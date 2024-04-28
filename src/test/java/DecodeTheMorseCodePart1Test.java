import org.example.DecodeTheMorseCodePart1;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class DecodeTheMorseCodePart1Test {
    @Test
    public void testExampleFromDescription() {
        assertThat(DecodeTheMorseCodePart1.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    }
}
