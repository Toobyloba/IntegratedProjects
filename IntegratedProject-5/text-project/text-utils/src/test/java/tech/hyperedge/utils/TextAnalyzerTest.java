package tech.hyperedge.utils;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Map;

public class TextAnalyzerTest {
    
    @Test
    public void testCountWords() {
        TextAnalyzer analyzer = new TextAnalyzer();
        assertEquals(5, analyzer.countWords("This is a simple test"));
        assertEquals(0, analyzer.countWords(""));
        assertEquals(0, analyzer.countWords(null));
    }
    
    @Test
    public void testWordFrequency() {
        TextAnalyzer analyzer = new TextAnalyzer();
        Map<String, Integer> freq = analyzer.getWordFrequency("hello world hello");
        
        assertEquals(2, freq.get("hello").intValue());
        assertEquals(1, freq.get("world").intValue());
    }
    
    @Test
    public void testToJson() {
        TextAnalyzer analyzer = new TextAnalyzer();
        Map<String, Integer> data = analyzer.getWordFrequency("test test data");
        String json = analyzer.toJson(data);
        
        assertTrue(json.contains("\"test\":2"));
        assertTrue(json.contains("\"data\":1"));
    }
}

