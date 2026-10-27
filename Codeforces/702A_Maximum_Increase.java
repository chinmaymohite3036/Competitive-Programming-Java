import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        int maxLen = 1;
        int currentLen = 1;
        int prev = scanner.nextInt();
        
        for (int i = 1; i < n; i++) {
            int current = scanner.nextInt();
            if (current > prev) {
                currentLen++;
            } else {
                currentLen = 1;
            }
            maxLen = Math.max(maxLen, currentLen);
            prev = current;
        }
        
        System.out.println(maxLen);
        scanner.close();
    }
}
 