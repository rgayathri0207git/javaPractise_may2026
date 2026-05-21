public class palindromeCheck {
    public static void main(String[] args) {
        String original = "radar";
        boolean isPalindrome = true; // Your flag
        
        int len = original.length();
        
        // A single loop running to the midpoint
        for (int i = 0; i < len / 2; i++) {
            // Compare index 'i' from the start with the corresponding index from the end
            if (original.charAt(i) != original.charAt(len - 1 - i)) {
                isPalindrome = false;
                break; // Stop immediately if a mismatch is found
            }
        }
        
        // Your final check
        if (isPalindrome) {
            System.out.println(original + " is a Palindrome!");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}