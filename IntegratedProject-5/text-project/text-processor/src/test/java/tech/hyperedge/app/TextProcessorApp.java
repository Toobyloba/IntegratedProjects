package tech.hyperedge.app;


import tech.hyperedge.utils.TextAnalyzer;
import java.util.Map;

public class TextProcessorApp {
    
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide text to analyze");
            return;
        }
        
        String text = String.join(" ", args);
        TextAnalyzer analyzer = new TextAnalyzer();
        
        System.out.println("=== Text Analysis ===");
        System.out.println("Input: " + text);
        System.out.println("Word count: " + analyzer.countWords(text));
        
        Map<String, Integer> frequency = analyzer.getWordFrequency(text);
        System.out.println("\nWord Frequencies:");
        frequency.forEach((word, count) -> 
            System.out.println("  " + word + ": " + count)
        );
        
        System.out.println("\nJSON Output:");
        System.out.println(analyzer.toJson(frequency));
    }
}

