import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            while (t-- > 0) {
                int n = scanner.nextInt();
                int x = scanner.nextInt();
                
                int prev = 0;
                int maxFuel = 0;
                
                for (int i = 0; i < n; i++) {
                    int curr = scanner.nextInt();
                    int dist = curr - prev;
                    if (dist > maxFuel) {
                        maxFuel = dist;
                    }
                    prev = curr;
                }
                
                int turnaround = 2 * (x - prev);
                if (turnaround > maxFuel) {
                    maxFuel = turnaround;
                }
                
                System.out.println(maxFuel);
            }
        }
        
        scanner.close();
    }
}