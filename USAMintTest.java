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
        usMint = new USAMint("USA", "Captial_Mint");
    }

    void setUpOut(){
        
	    originalOut = System.out;     // save to restore later
	    baos = new ByteArrayOutputStream();
	    newOut = new PrintStream(baos);
	    System.setOut(newOut);
    }

    @Test
    public void usMint_makeCoins() {

        setUpOut();
        usMint.makeCoins();
    }
}
