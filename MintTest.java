/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class MintTest {

    private Mint mint;
    
    @BeforeEach
    public void init() {
        mint = new USAMint("USA", "Captial_Mint");
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
}
