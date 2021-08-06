/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ToonieTest{
    
    @Test
    public void testConstructor(){
        Toonie n = new Toonie();
        assertTrue(true);
    }
    @Test
    public void testConstructorSetValues(){
        Toonie n = new Toonie();
        String expectedCC = "CAD";
        String actualCC = n.getCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 2.0;
        double actualVal = n.getVal();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}