package project1;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloProject1Test {
    
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    
    @Before
    public void setUp() {
        // Redirect System.out to capture console output
        System.setOut(new PrintStream(outputStream));
    }
    
    @After
    public void restoreSystemOut() {
        // Restore the original System.out after each test
        System.setOut(originalOut);
    }
    
    @Test
    public void testMainMethod() {
        // Call the main method
        HelloProject1.main(new String[]{});
        
        // Capture the output and verify it
        String expectedOutput = "Hello from Project 1!" + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }
}

