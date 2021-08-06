/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoonieTest{
    
    @Test
    public void testConstructor(){
        Loonie n = new Loonie();
        assertTrue(true);
    }
    @Test
    public void testConstructorSetValues(){
        Loonie n = new Loonie();
        String expectedCC = "CAD";
        String actualCC = n.getCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 1.0;
        double actualVal = n.getVal();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}