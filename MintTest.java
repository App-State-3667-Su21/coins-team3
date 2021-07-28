/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class MintTest {

    private Mint usMint;
    private Mint cadMint;
    private String location;
    private String name;

    @BeforeEach
    public void init() {
        usMint = new USMint();
    }
    @Test
    public void testEvaluate() {
        //Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
        }
    @Test
    public void testEvaluate2() {
        //Calculator calculator2 = new Calculator();
        String expression = new String("3 + 4 + 5");
        //int sum2 = calculator2.evaluate(expression.replaceAll("\\s", ""));
        int sum2 = calculator.evaluate(expression.replaceAll("\\s", ""));
        assertEquals(12, sum2);
    }

}
