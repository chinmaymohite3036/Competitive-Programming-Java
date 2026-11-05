import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t > 0) {
            int year = sc.nextInt();
            int foundRoot = -1;
            
            for (int i = 0; i <= 99; i++) {
                if (i * i == year) {
                    foundRoot = i;
                    break;
                }
            }
            
            if (foundRoot != -1) {
                System.out.println("0 " + foundRoot);
            } else {
                System.out.println("-1");
            }
            
            t--;
        }
        
        sc.close();
    }
}
