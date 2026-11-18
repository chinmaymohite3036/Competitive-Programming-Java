import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            int ans = a + b + c;
            ans = Math.max(ans, a * b * c);
            ans = Math.max(ans, (a + b) * c);
            ans = Math.max(ans, a * (b + c));
            
            System.out.println(ans);
        }
        
        scanner.close();
    }
}