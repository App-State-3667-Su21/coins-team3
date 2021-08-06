/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NickelTest{
    
    @Test
    public void testConstructor(){
        Nickle n = new Nickle();
        assertTrue(true);
    }
    @Test
    public void testConstructorSetValues(){
        Nickle n = new Nickle();
        String expectedCC = "USD";
        String actualCC = n.getCode();
        assertEquals(expectedCC, actualCC);

        double expectedVal = 0.05;
        double actualVal = n.getVal();
        assertEquals(expectedVal, actualVal, 0.00010);
    }
}