import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            if (k >= 2) {
                System.out.println("YES");
            } else {
                // If k == 1, check if the array is already sorted
                boolean isSorted = true;
                for (int i = 0; i < n - 1; i++) {
                    if (a[i] > a[i + 1]) {
                        isSorted = false;
                        break;
                    }
                }
                
                if (isSorted) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        
        sc.close();
    }
}
