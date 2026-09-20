import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            // First passenger sets the initial boundaries
            int firstSeat = sc.nextInt();
            int min = firstSeat;
            int max = firstSeat;
            
            boolean isValid = true;
            
            // Check the remaining n - 1 passengers
            for (int i = 1; i < n; i++) {
                int seat = sc.nextInt();
                
                // The new seat must be right next to the current occupied block
                if (seat == min - 1) {
                    min = seat; // Expand the block to the left
                } else if (seat == max + 1) {
                    max = seat; // Expand the block to the right
                } else {
                    isValid = false; // Rule broken!
                }
            }
            
            if (isValid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
