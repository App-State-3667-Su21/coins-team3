import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

public class DollarSmeltTest {

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
        DollarSmelt p = new DollarSmelt();
        String expectedOutput = "(88.5% Cu, 6% Zi, 3.5% Mn, 2% Ni)";
        p.doOperation();
        System.out.flush();
        String actualOutput = baos.toString();
        assertEquals(expectedOutput, actualOutput);
    }
}
