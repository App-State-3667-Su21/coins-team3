/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FiftyCentTest{
    
    @Test
    public void testConstructor(){
        FiftyCent n = new FiftyCent();
        assertTrue(true);
    }
    @Test
    public void testConstructorSetValues(){
        FiftyCent n = new FiftyCent();
        String expectedCC = "CAD";
        String actualCC = n.getCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 0.50;
        double actualVal = n.getVal();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}