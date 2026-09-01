import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            
            int t = sc.nextInt();
            
            while (t-- > 0) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = sc.nextLong();
            
                long S = a + 2 * b + 3 * c;
            
                if (S % 2 == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            }
    }
}