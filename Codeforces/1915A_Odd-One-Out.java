import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        // Process each test case
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            // Find the unique number
            if (a == b) {
                System.out.println(c);
            } else if (a == c) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        }
        
        sc.close();
    }
}
