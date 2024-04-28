import org.example.IsNDivisibleByXAndY;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsNDivisibleByXAndYTest {

    @Test
    public void test1() {
        assertTrue("n = 12, x = 4, y = 3\n", IsNDivisibleByXAndY.isDivisible(12, 4, 3));
    }

    @Test
    public void test2() {
        assertFalse("n = 3, x = 3, y = 4\n", IsNDivisibleByXAndY.isDivisible(3, 3, 4));
    }
}
