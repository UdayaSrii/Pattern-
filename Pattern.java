public class Pattern {
    // Create a 2D array to store the pattern
    public static void pattern(int n) {
        // Give a space of n-1 to the first row
        int i,j;
        for (i=1;i<=n;i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }  
            System.out.println(); 
        }
    }
    // Create a main method to call the pattern method
    public static void main(String[] args) {
        int n=4;
         pattern(n);
    }
}

