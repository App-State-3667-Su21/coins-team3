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
        usMint = new USAMint("USA", "Captial_Mint");
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
    

    @Test
    public void usMint_makeCoins() {
        System.out.println("make Coins");
        setUpOut();
        //usMint.makeCoins();

        System.setOut(originalOut);
    }
}
