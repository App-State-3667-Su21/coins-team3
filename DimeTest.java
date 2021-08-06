/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DimeTest{
    
    @Test
    public void testConstructor(){
        Dime n = new Dime();
        assertTrue(true);
    }
    @Test
    public void testConstructorSetValues(){
        Dime n = new Dime();
        String expectedCC = "USD";
        String actualCC = n.getCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 0.1;
        double actualVal = n.getVal();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}