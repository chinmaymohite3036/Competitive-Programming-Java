import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            String ticket = sc.next();
            
            int firstSum = (ticket.charAt(0) - '0') + (ticket.charAt(1) - '0') + (ticket.charAt(2) - '0');
            int lastSum = (ticket.charAt(3) - '0') + (ticket.charAt(4) - '0') + (ticket.charAt(5) - '0');
            
            if (firstSum == lastSum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
