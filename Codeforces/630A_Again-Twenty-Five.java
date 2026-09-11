import java.util.Scanner;
import java.util.HashSet;

public class DoNotBeDistracted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int result = (int) Math.pow(5, n);
        
        int digits = result % 100;
        
        System.out.println(digits);
        
        sc.close();
    }
}
