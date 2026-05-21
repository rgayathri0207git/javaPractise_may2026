public class invertedPyramid {
    public static void main(String[] args) {
        int n = 4;
        
        // Your outer loop: Counting backwards from n down to 1
        for (int i = n; i >= 1; i--) {
            
            // Inner loop: Counts upwards from 1 until it hits the current value of i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            System.out.println(); // Move to the next line after completing a row
        }
    }
}