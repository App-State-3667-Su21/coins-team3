/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuarterTest{
    
    @Test
    public void testConstructor(){
        Quarter n = new Quarter();
        assertTrue(true);
    }
    @Test
    public void testConstructorSetValues(){
        Quarter n = new Quarter();
        String expectedCC = "USD";
        String actualCC = n.getCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 0.25;
        double actualVal = n.getVal();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}