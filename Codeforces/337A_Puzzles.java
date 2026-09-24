import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] f = new int[m];
        for (int i = 0; i < m; i++) {
            f[i] = sc.nextInt();
        }
        
        Arrays.sort(f);
        
        int minDifference = Integer.MAX_VALUE;
        
        for (int i = 0; i <= m - n; i++) {
            int currentDifference = f[i + n - 1] - f[i];
            
            if (currentDifference < minDifference) {
                minDifference = currentDifference;
            }
        }
        
        System.out.println(minDifference);
        
        sc.close();
    }
}