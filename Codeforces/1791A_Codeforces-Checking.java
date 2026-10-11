import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String target = "codeforces";
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            String c = scanner.next();
            if (target.contains(c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
