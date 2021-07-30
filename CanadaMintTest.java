/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

public class CanadaMintTest { 

    Mint CADMint;
    PrintStream originalOut;
    ByteArrayOutputStream baos;
    PrintStream newOut;

    @BeforeEach
    public void init() {
        System.out.println("CADMintTest");
        CADMint = new CanadaMint("Canada_Mint");
    }
    @Test
    public void testCanadaMintLocation() {
        String location = CADMint.getLocation();
        assertEquals("CAD", location);
    }
    @Test
    public void testCanadaMintName() {

        String name = CADMint.getName();
        assertEquals("Canada_Mint", name);
    } 
    
    @Test
    public void TestMakeCoins(){
        
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
    

    
}
