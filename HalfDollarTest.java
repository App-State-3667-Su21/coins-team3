/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HalfDollarTest{
    
    @Test
    public void testConstructor(){
        HalfDollar n = new HalfDollar();
        assertTrue(true);
    }
    @Test
    public void testConstructorSetValues(){
        HalfDollar n = new HalfDollar();
        String expectedCC = "USD";
        String actualCC = n.getCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 0.5;
        double actualVal = n.getVal();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}