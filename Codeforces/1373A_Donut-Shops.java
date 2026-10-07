import java.util.Scanner;
 
public class DonutShops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            
            long shop1 = -1;
            long shop2 = -1;
            
            if (a < c) {
                shop1 = 1; 
            }
            
            if (a * b > c) {
                shop2 = b;
            }
            
            System.out.println(shop1 + " " + shop2);
        }
        sc.close();
    }
}