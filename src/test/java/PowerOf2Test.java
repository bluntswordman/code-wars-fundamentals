import org.junit.Test;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertArrayEquals;

import org.example.PowerOf2;

public class PowerOf2Test {
    @Test
    public void testSomething() {
        assertArrayEquals(new long[]{1}, PowerOf2.powersOfTwo(0));
        assertArrayEquals(new long[]{1, 2}, PowerOf2.powersOfTwo(1));
        assertArrayEquals(new long[]{1, 2, 4, 8, 16}, PowerOf2.powersOfTwo(4));
    }
}
