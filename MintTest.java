/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.Random;

public class MintTest {
    
    private Mint mint;
    
    
    @BeforeEach
    public void init() {
        
        mint = new USAMint("Capital_Mint");
    }
    
    @Test
    public void testMintLocation() {
        String location = mint.getLocation();
        assertEquals("USA", location);
    }
    @Test
    public void testMintName() {

        String name = mint.getName();
        assertEquals("Capital_Mint", name);
    }

    /*
        I Dont know how to test makeCoins(), val is not a field, can't just pull it, 
        I think we need to do a similar thing of setUpOut() that takes output and do the same
        think with system.in. That's just my thinking on how to get access to the value, but then the test
        itself is requiring to put in input for each value.

    */
    @Test
    public void TestMakeCoins(){
        
    }
}
