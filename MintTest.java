/* 
 *  * JUnit5 test class
 *   */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.Random;

class dummyMint extends Mint{
    public dummyMint(String loc, String nam)
    {
        super(loc, nam);
    }
    public String getLocation(){return location;}  
    public String getName(){return name;}
    public void makeCoins(){return;}}

public class MintTest {
    
    private dummyMint mint;
    
    
    @BeforeEach
    public void init() {
    mint = new dummyMint("USA", "Capital_Mint");    
      
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
