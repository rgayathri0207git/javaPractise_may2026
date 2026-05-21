public class numberPyramid {
    public static void main(String[] args) {
        int rows = 4; // Total number of rows to print
        
        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            
            // Inner loop for columns in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Print numbers side-by-side
            }
            
            System.out.println(); // Move to the next line after finishing a row
        }
    }
}