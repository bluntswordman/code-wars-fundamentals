import org.example.CenturyFromYear;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CenturyFromYearTest {
    @Test
    public void FixedTests() {
        assertEquals(18, CenturyFromYear.century(1705));
        assertEquals(19, CenturyFromYear.century(1900));
        assertEquals(17, CenturyFromYear.century(1601));
        assertEquals(20, CenturyFromYear.century(2000));
        assertEquals(1,  CenturyFromYear.century(89));
    }
}
