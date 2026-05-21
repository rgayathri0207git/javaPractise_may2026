public class floydTriangle {
    public static void main(String[] args) {
        int rows = 4;
        int counter = 1; // Tracks the continuous number
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++; // Increment after printing
            }
            System.out.println();
        }
    }
}