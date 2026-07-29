import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        long n = sc.nextLong();
 
        int luckyDigitCount = 0;
 
        while (n > 0) {
            long digit = n % 10;
 
            if (digit == 4 || digit == 7) {
                luckyDigitCount++;
            }
 
            n /= 10;
        }
 
        if (luckyDigitCount == 4 || luckyDigitCount == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
 
        sc.close();
    }
}