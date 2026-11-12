import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextLong()) {
            long n = scanner.nextLong();
            long m = scanner.nextLong();
            long a = scanner.nextLong();
            
            long flagstonesN = (n + a - 1) / a;
            long flagstonesM = (m + a - 1) / a;
            
            long totalFlagstones = flagstonesN * flagstonesM;
            
            System.out.println(totalFlagstones);
        }
        
        scanner.close();
    }
}