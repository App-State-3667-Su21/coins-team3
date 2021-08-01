/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

public class USAMintTest { 

    Mint usMint;
    PrintStream originalOut;
    ByteArrayOutputStream baos;
    PrintStream newOut;

    @BeforeEach
    public void init() {
        System.out.println("USMintTest");
        USAMint.getInstance();
    }
    @Test
    public void testUSAMintLocation() {
        String location = USAMint.getInstance().getLocation();
        assertEquals("USA", location);
    }
    @Test
    public void testUSAMintName() {

        String name = USAMint.getInstance().getName();
        assertEquals("Capitol_Mint", name);
    } 
         
    void setUpOut(){
        System.out.println("Set Up Out?");
	    originalOut = System.out;     // save to restore later
	    //System.out.println("1");
        baos = new ByteArrayOutputStream();
        System.out.println("2");
	    newOut = new PrintStream(baos);
        System.out.println("3");
	    System.setOut(newOut);
    }
    

    /**@Test
    //Need to finish
    public void usMint_makeCoins() {
        System.out.println("make Coins");
        setUpOut();
        //USAMint.getInstance().makeCoins();
        //USAMint.getInstance().<Method> is now how you call methods.

        System.setOut(originalOut);
    }*/

    /**@Test 
    public void usMint_makeCoins(){
        String expectedOutput = "Possible coin factories include: USD, GBP, CAD, EUR\n" +
        "Using USD: Capitol_Mint\n\n" +
        "Enter coin denomination (0.25 = a quarter, 0 to quit): ";
        System.out.println("For the sake test, input .5");
        USAMint.getInstance().makeCoins();
        System.out.flush();
        String actualOutput = baos.toString();
        assertEquals(expectedOutput, actualOutput);
    }*/
}
