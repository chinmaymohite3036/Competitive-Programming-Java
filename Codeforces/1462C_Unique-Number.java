import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int x = sc.nextInt();
            
            if (x > 45) {
                System.out.println(-1);
                continue;
            }
            
            StringBuilder result = new StringBuilder();
            for (int digit = 9; digit >= 1; digit--) {
                if (x >= digit) {
                    result.insert(0, digit); 
                    x -= digit;
                }
            }
            
            System.out.println(result.toString());
        }
        
        sc.close();
    }
}
