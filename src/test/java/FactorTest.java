import org.example.Factor;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FactorTest {
    @Test
    public void basicTests() {
        assertTrue(Factor.checkForFactor(10, 2));
        assertTrue(Factor.checkForFactor(63, 7));
        assertTrue(Factor.checkForFactor(2450, 5));
        assertTrue(Factor.checkForFactor(24612, 3));
    }
}
