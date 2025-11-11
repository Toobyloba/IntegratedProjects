package tech.hyperedge.utils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;

public class TextAnalyzer {
    
    public int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        return text.trim().split("\\s+").length;
    }
    
    public Map<String, Integer> getWordFrequency(String text) {
        Map<String, Integer> frequency = new HashMap<>();
        if (text == null || text.trim().isEmpty()) {
            return frequency;
        }
        
        String[] words = text.toLowerCase().split("\\s+");
        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }
        return frequency;
    }
    
    public String toJson(Map<String, Integer> data) {
        Gson gson = new Gson();
        JsonObject json = new JsonObject();
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            json.addProperty(entry.getKey(), entry.getValue());
        }
        return gson.toJson(json);
    }
}

