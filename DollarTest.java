/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DollarTest{
    
    @Test
    public void testConstructor(){
        Dollar n = new Dollar();
        assertTrue(true);
    }
    @Test
    public void testConstructorSetValues(){
        Dollar n = new Dollar();
        String expectedCC = "USD";
        String actualCC = n.getCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 1.0;
        double actualVal = n.getVal();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}