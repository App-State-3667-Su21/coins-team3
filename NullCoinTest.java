/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

public class NullCoinTest{
    
    static PrintStream originalOut;
    static ByteArrayOutputStream baos;
    static PrintStream newOut;

    @BeforeEach
    public void init() {
        originalOut = System.out;
        baos = new ByteArrayOutputStream();
        newOut = new PrintStream(baos);
        System.setOut(newOut);
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testConstructor(){
        NullCoin frank = new NullCoin();
        assertTrue(true);
    }

    @Test
    public void testConstructorSetValues() {
        NullCoin frank = new NullCoin();
        String expectedCC = null;
        String actualCC = frank.getCode();
        assertEquals(expectedCC, actualCC);
        double expectedVal = 0;
        double actualVal = frank.getVal();
        assertEquals(expectedVal, actualVal, 0.00010);
        }
    
    @Test
    public void testNullSmelt(){
        NullCoin frank = new NullCoin();
        String expectedOutput = "";
        frank.smelt();
        System.out.flush();
        String actualOutput = baos.toString();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testNullInspect(){
        NullCoin frank = new NullCoin();
        String expectedOutput = "";
        frank.inspect();
        System.out.flush();
        String actualOutput = baos.toString();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testNullSmooth(){
        NullCoin frank = new NullCoin();
        String expectedOutput = "";
        frank.smooth();
        System.out.flush();
        String actualOutput = baos.toString();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testNullPolish(){
        NullCoin frank = new NullCoin();
        String expectedOutput = "";
        frank.polish();
        System.out.flush();
        String actualOutput = baos.toString();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testNullMint(){
        NullCoin frank = new NullCoin();
        String expectedOutput = "";
        frank.mint();
        System.out.flush();
        String actualOutput = baos.toString();
        assertEquals(expectedOutput, actualOutput);
    }
}
