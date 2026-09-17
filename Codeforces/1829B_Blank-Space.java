import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int maxBlank = 0;
            int currentBlank = 0;
            
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a == 0) {
                    currentBlank++;
                } else {
                    maxBlank = Math.max(maxBlank, currentBlank);
                    currentBlank = 0;
                }
            }
            maxBlank = Math.max(maxBlank, currentBlank);
            System.out.println(maxBlank);
        }
        sc.close();
    }
}