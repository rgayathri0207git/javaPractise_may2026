public class revereseString {
    public static void main(String[] args) {
        String str = "Renault";
        
        // 1. Convert string into a character array
        char[] charArray = str.toCharArray();
        
        // 2. Loop backwards from array.length - 1 down to index 0
        for (int i = charArray.length - 1; i >= 0; i--) {
            // 3. Print it character by character
            System.out.print(charArray[i]);
        }
    }
}