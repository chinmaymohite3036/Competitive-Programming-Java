import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.util.System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        // Process each test case
        while (t-- > 0) {
            int rating = sc.nextInt();
            
            // Check divisions based on the rating thresholds
            if (rating >= 1900) {
                System.out.println("Division 1");
            } else if (rating >= 1600) {
                System.out.println("Division 2");
            } else if (rating >= 1400) {
                System.out.println("Division 3");
            } else {
                System.out.println("Division 4");
            }
        }
        
        sc.close();
    }
}
