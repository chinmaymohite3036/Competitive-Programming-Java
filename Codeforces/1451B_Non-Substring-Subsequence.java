import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            String s = sc.next();
            
            while (q-- > 0) {
                int l = sc.nextInt() - 1; 
                int r = sc.nextInt() - 1; 
                
                char firstChar = s.charAt(l);
                char lastChar = s.charAt(r);
                
                boolean hasBefore = s.substring(0, l).indexOf(firstChar) != -1;
                
                boolean hasAfter = s.substring(r + 1).indexOf(lastChar) != -1;
                
                if (hasBefore || hasAfter) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
