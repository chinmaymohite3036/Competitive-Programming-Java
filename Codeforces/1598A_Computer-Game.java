import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String row1 = sc.next();
            String row2 = sc.next();
            
            boolean possible = true;
            
            for (int i = 0; i < n; i++) {
                if (row1.charAt(i) == '1' && row2.charAt(i) == '1') {
                    possible = false;
                    break;
                }
            }
            
            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
