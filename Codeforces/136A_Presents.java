import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] ans = new int[n + 1];
            
            for (int i = 1; i <= n; i++) {
                int p = scanner.nextInt();
                ans[p] = i; 
            }
            
            for (int i = 1; i <= n; i++) {
                System.out.print(ans[i] + (i == n ? "" : " "));
            }
            System.out.println();
        }
        
        scanner.close();
    }
}