
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            long x = sc.nextLong();
            long y = sc.nextLong();
            long n = sc.nextLong();
 
            long q = n / x;
 
            if (n % x < y) {
                q--;
            }
 
            long answer = x * q + y;
 
            System.out.println(answer);
        }
 
        sc.close();
    }
}