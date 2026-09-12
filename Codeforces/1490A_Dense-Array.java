import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            int ans = 0;
 
            for (int i = 0; i < n - 1; i++) {
 
                int small = Math.min(a[i], a[i + 1]);
                int large = Math.max(a[i], a[i + 1]);
 
                while (large > small * 2) {
                    small = small * 2;
                    ans++;
                }
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}