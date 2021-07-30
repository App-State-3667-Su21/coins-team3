/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PennyTest{
    
    @Test
    public void testConstructor(){
        Penny p = new Penny();
        assertTrue(true);
    }
    @Test
    public void testConstructorSetValues(){
        Penny p = new Penny();
        String expectedCC = "USD";
        String actualCC = p.getCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 0.01;
        double actualVal = p.getVal();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}