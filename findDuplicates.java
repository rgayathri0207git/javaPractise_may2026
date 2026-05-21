import java.util.HashSet;
import java.util.Set;

public class findDuplicates {
    public static void main(String[] args) {
        String s = "automation";
        
        // 1. Convert string to character array
        char[] c = s.toCharArray();
        
        // 2. Declare Set A (unique elements) and Set B (duplicates)
        Set<Character> setA = new HashSet<>();
        Set<Character> setB = new HashSet<>();
        
        // 3. Loop through the array
        for (int i = 0; i < c.length; i++) {
            // .add() returns false if the character is already present in setA
            if (!setA.add(c[i])) {
                setB.add(c[i]); // It's a duplicate, add it to setB
            }
        }
        
        // 4. Print the results
        System.out.println("Characters after removing duplicates (Set A): " + setA);
        System.out.println("Duplicated characters (Set B): " + setB);
    }
}
