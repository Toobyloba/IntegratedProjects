package tech.hyperedge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConflictApp {
    private static final Logger logger = LoggerFactory.getLogger(ConflictApp.class);
    
    public static void main(String[] args) {
        logger.info("Testing SLF4J configuration");
        System.out.println("Check console for SLF4J warnings about multiple bindings");
    }
}
