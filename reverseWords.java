public class reverseWords {
    public static void main(String[] args) {
        String sentence = "Renault Nissan";
        
        // 1. Split the sentence by space to get an array of words
        String[] words = sentence.split(" ");
        
        // 2. Loop backwards from the last word index down to 0
        for (int i = words.length - 1; i >= 0; i--) {
            // 3. Print each word followed by a space
            System.out.print(words[i] + " ");
        }
    }
}