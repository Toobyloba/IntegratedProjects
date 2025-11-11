package tech.hyperedge.logger;

import static org.junit.Assert.*;
import org.junit.Test;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DependencyTest {
    
    @Test
    public void testJacksonVersionIsAvailable() {
        ObjectMapper mapper = new ObjectMapper();
        assertNotNull("ObjectMapper should be available", mapper);
    }
    
    @Test
    public void testVersionInfo() {
        String version = com.fasterxml.jackson.databind.cfg.PackageVersion.VERSION.toString();
        System.out.println("Running with Jackson version: " + version);
        assertNotNull("Version should not be null", version);
    }
}

