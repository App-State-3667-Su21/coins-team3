/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CadQuarterTest{
    
    @Test
    public void testConstructor(){
        CadQuarter n = new CadQuarter();
        assertTrue(true);
    }
    @Test
    public void testConstructorSetValues(){
        CadQuarter n = new CadQuarter();
        String expectedCC = "CAD";
        String actualCC = n.getCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 0.25;
        double actualVal = n.getVal();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}