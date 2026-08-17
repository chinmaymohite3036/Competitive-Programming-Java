import java.util.Scanner;
import java.util.HashSet;

public class Pangram {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        String s = scanner.next().toLowerCase();
        
        HashSet<Character> uniqueChars = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                uniqueChars.add(ch);
            }
        }
        
        if (uniqueChars.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
