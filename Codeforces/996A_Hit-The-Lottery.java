import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        int[] bills = {100, 20, 10, 5, 1};
        long totalBills = 0;
        
        for (int bill : bills) {
            totalBills += n / bill;
            n %= bill;
        }
        
        System.out.println(totalBills);
        sc.close();
    }
}
