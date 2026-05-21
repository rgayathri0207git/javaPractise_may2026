import java.util.Arrays;

public class anagramCheck {
    public static boolean isAnagram(String str1, String str2) {
        // 1. If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // 2. Convert both strings to character arrays
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        
        // 3. Sort both character arrays alphabetically
        Arrays.sort(array1); // e.g., "listen" becomes [e, i, l, n, s, t]
        Arrays.sort(array2); // e.g., "silent" becomes [e, i, l, n, s, t]
        
        // 4. Compare if both sorted arrays are identical
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";
        
        if (isAnagram(word1, word2)) {
            System.out.println(word1 + " and " + word2 + " are Anagrams!");
        } else {
            System.out.println(word1 + " and " + word2 + " are NOT Anagrams.");
        }
    }
}
