import org.example.OddCount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class OddCountTest {
    @Test
    public void fixedTests() {
        assertEquals(7, OddCount.oddCount(15));
        assertEquals(7511, OddCount.oddCount(15023));
    }
}
