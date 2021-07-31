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
        dummyCoin coin = new dummyCoin();

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
        dummyCoin coin2 = new dummyCoin();
        String expectedOutput = "Smelting dummyCoin...completed.\n";
        coin2.smelt();
        System.out.flush();
        String actualOutput = baos.toString();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void inspect_test(){
        
    }

    @Test
    public void smooth_test(){
        
    }

    @Test
    public void polish_test(){
        
    }

    @Test
    public void mint_test(){
        
    }


}
