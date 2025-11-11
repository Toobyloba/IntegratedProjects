package tech.hyperedge.logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class LoggingApp {
    
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();
        node.put("message", "Checking Jackson version");
        node.put("library", "jackson-databind");
        
        System.out.println("JSON Output: " + node.toString());
        System.out.println("Jackson Version: " + 
            com.fasterxml.jackson.databind.cfg.PackageVersion.VERSION);
    }
}

