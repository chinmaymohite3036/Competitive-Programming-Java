import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.class);
        
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            
            int ans = (n - 1) / 2;
            
            System.out.println(ans);
        }
        sc.close();
    }
}