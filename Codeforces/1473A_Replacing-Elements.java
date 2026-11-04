import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            
            int smallest1 = Integer.MAX_VALUE;
            int smallest2 = Integer.MAX_VALUE;
            boolean allLessOrEqual = true;
            
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                
                if (val > d) {
                    allLessOrEqual = false;
                }
                
                if (val < smallest1) {
                    smallest2 = smallest1;
                    smallest1 = val;
                } else if (val < smallest2) {
                    smallest2 = val;
                }
            }
        
            if (allLessOrEqual || (smallest1 + smallest2 <= d)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
