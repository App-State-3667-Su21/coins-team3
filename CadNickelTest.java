/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CadNickelTest{
    
    @Test
    public void testConstructor(){
        CadNickle n = new CadNickle();
        assertTrue(true);
    }
    @Test
    public void testConstructorSetValues(){
        CadNickle n = new CadNickle();
        String expectedCC = "CAD";
        String actualCC = n.getCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 0.05;
        double actualVal = n.getVal();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}