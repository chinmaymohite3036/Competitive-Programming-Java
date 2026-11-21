import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            int evenCount = 0, oddCount = 0;
            int lastEvenIdx = -1, lastOddIdx = -1;
            
            for (int i = 1; i <= n; i++) {
                int num = scanner.nextInt();
                if ((num & 1) == 0) {
                    evenCount++;
                    lastEvenIdx = i;
                } else {
                    oddCount++;
                    lastOddIdx = i;
                }
            }
            
            System.out.println(evenCount == 1 ? lastEvenIdx : lastOddIdx);
        }
        
        scanner.close();
    }
}