import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        long totalCost = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            
            if (a > 1) {
                totalCost += (a - 1);
            } else if (a < -1) {
                totalCost += Math.abs(a + 1);
                negativeCount++;
            } else if (a == -1) {
                negativeCount++;
            } else if (a == 0) {
                totalCost += 1; 
                zeroCount++;
            }
        }
        
        if (negativeCount % 2 != 0) {
            if (zeroCount == 0) {
                totalCost += 2;
            }
        }
        
        System.out.println(totalCost);
        sc.close();
    }
}
