import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int l = scanner.nextInt();
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            Arrays.sort(a);
            
            int maxDoubleRadius = Math.max(a[0], l - a[n - 1]) * 2;
            
            for (int i = 1; i < n; i++) {
                int gap = a[i] - a[i - 1];
                if (gap > maxDoubleRadius) {
                    maxDoubleRadius = gap;
                }
            }
            
            System.out.printf("%.10f%n", maxDoubleRadius / 2.0);
        }
        
        scanner.close();
    }
}