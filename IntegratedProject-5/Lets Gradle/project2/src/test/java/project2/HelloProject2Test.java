package project2;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloProject2Test {
    
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    
    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }
    
    @After
    public void restoreSystemOut() {
        System.setOut(originalOut);
    }
    
    @Test
    public void testMainMethod() {
        HelloProject2.main(new String[]{});
        
        String expectedOutput = "Hello from Project 2!" + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }
}

