import java.util.Scanner;

public class Main {
    static int getDiff(String a, String b, int m) {
        int diff = 0;
        for (int i = 0; i < m; i++) {
            diff += Math.abs(a.charAt(i) - b.charAt(i));
        }
        return diff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            String[] words = new String[n];
            for (int i = 0; i < n; i++) {
                words[i] = sc.next();
            }
            
            int ans = 999999; 
            
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int cost = getDiff(words[i], words[j], m);
                    if (cost < ans) {
                        ans = cost;
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
