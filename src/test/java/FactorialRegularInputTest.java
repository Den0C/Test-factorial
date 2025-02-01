import org.example.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialRegularInputTest {

    Factorial factorial = new Factorial();

    @Test
    void testFactorial(){
        assertEquals("720",factorial.factorial("6"));
        assertEquals("5040",factorial.factorial("7"));
        assertEquals("87178291200",factorial.factorial("14"));
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial("-n"));
    }

}
