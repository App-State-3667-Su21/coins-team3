/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CadDimeTest{
    
    @Test
    public void testConstructor(){
        CadDime n = new CadDime();
        assertTrue(true);
    }
    @Test
    public void testConstructorSetValues(){
        CadDime n = new CadDime();
        String expectedCC = "CAD";
        String actualCC = n.getCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 0.1;
        double actualVal = n.getVal();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}