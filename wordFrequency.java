import java.util.HashMap;
import java.util.Map;

public class wordFrequency {
    public static void main(String[] args) {
        String text = "apple banana apple cherry banana apple";
        String[] words = text.split(" ");
        
        Map<String, Integer> frequencyMap = new HashMap<>();
        
        for (String word : words) {
            // Your logic: store key as string and count as value
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        
        System.out.println(frequencyMap); 
        // Outputs: {banana=2, cherry=1, apple=3}
    }
}