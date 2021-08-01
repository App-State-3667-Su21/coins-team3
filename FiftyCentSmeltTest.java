import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

public class FiftyCentSmeltTest {

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
    public void uniqueSmeltTest() {
        FiftyCentSmelt p = new FiftyCentSmelt();
        String expectedOutput = "(specs unknown)";
        p.doOperation();
        System.out.flush();
        String actualOutput = baos.toString();
        assertEquals(expectedOutput, actualOutput);
    }
}
