/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

class dummyCoin extends Coin{
    private double val = .1;
    private String code = "USD"; 
    public String getCode(){return code;}  
    public double getVal(){return val;}
    } 



public class CoinTest{

    static dummyCoin coin;
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
    public void smeltTest(){
        dummyCoin coin = new dummyCoin();
        String expectedOutput = "Smelting dummyCoin...completed.\n";
        coin.smelt();
        System.out.flush();
        String actualOutput = baos.toString();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void inspect_test(){
        dummyCoin coin = new dummyCoin();
        String expectedOutput = "Inspecting dummyCoin...completed.\n";
        String expectedOutput2 = "Inspecting dummyCoin...failed.\n";
        coin.inspect();
        System.out.flush();
        String actualOutput = baos.toString();
        if (coin.fail == true) {
            assertEquals(expectedOutput2, actualOutput);
        }
        else {
            assertEquals(expectedOutput, actualOutput);
        }
    }

    @Test
    public void smooth_test(){
        dummyCoin coin = new dummyCoin();
        String expectedOutput = "Smoothing dummyCoin...completed.\n";
        String expectedOutput2 = "Smoothing dummyCoin...failed.\n";
        coin.smooth();
        System.out.flush();
        String actualOutput = baos.toString();
        if (coin.fail == true) {
            assertEquals(expectedOutput2, actualOutput);
        }
        else {
            assertEquals(expectedOutput, actualOutput);
        }
    }

    @Test
    public void polish_test(){
        dummyCoin coin = new dummyCoin();
        String expectedOutput = "Polishing dummyCoin...completed.\n";
        String expectedOutput2 = "Polishing dummyCoin...failed.\n";
        coin.polish();
        System.out.flush();
        String actualOutput = baos.toString();
        if (coin.fail == true) {
            assertEquals(expectedOutput2, actualOutput);
        }
        else {
            assertEquals(expectedOutput, actualOutput);
        }
    }

    @Test
    public void mint_test(){
        dummyCoin coin = new dummyCoin();
        String expectedOutput = "Smelting dummyCoin...completed.\n" +
                                "Inspecting dummyCoin...completed.\n" +
                                "Smoothing dummyCoin...completed.\n" +
                                "Polishing dummyCoin...completed.\n" +
                                "(dummyCoin) $0.1\n";

        String expectedOutput2 = "Smelting dummyCoin...completed.\n" +
                                "Inspecting dummyCoin...failed.\n" +
                                "Failed to manufacture coin.\n";
        
        String expectedOutput3 = "Smelting dummyCoin...completed.\n" +
                                "Inspecting dummyCoin...completed.\n" +
                                "Smoothing dummyCoin...failed.\n" +
                                "Failed to manufacture coin.\n";
        
        String expectedOutput4 = "Smelting dummyCoin...completed.\n" +
                                "Inspecting dummyCoin...completed.\n" +
                                "Smoothing dummyCoin...completed.\n" +
                                "Polishing dummyCoin...failed.\n" +
                                "Failed to manufacture coin.\n";
        coin.mint();
        System.out.flush();
        String actualOutput = baos.toString();
        if (coin.fail == true) {
            if(actualOutput.equals(expectedOutput2) || 
                actualOutput.equals(expectedOutput3) ||
                actualOutput.equals(expectedOutput4)) {
                assertTrue(true);
            }
            else
            {
                assertTrue(false);
        }
        }
        else {
            assertEquals(expectedOutput, actualOutput);
        }

        
    }


}
