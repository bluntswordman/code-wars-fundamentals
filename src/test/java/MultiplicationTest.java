import org.example.Multiply;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {
    @Test
    public void basicTests() {
        assertEquals(1.0, Multiply.multiply(1.0, 1.0), "1.0 * 1.0 == 1.0");
        assertEquals(2.0, Multiply.multiply(2.0, 1.0), "2.0 * 1.0 == 2.0");
        assertEquals(4.0, Multiply.multiply(2.0, 2.0), "2.0 * 2.0 == 4.0");
        assertEquals(15.0, Multiply.multiply(3.0, 5.0), "3.0 * 5.0 == 15.0");
        assertEquals(0.25, Multiply.multiply(0.5, 0.5), "0.5 * 0.5 == 0.25");
        assertEquals(0.0, Multiply.multiply(5.0, 0.0), "5.0 * 0.0 == 0.0");
        assertEquals(0.0, Multiply.multiply(0.0, 5.0), "0.0 * 5.0 == 0.0");
        assertEquals(0.0, Multiply.multiply(0.0, 0.0), "0.0 * 0.0 == 0.0");
    }
}
