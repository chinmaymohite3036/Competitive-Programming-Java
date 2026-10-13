import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] x = new int[4];
        for (int i = 0; i < 4; i++) {
            x[i] = scanner.nextInt();
        }
        
        Arrays.sort(x);
        
        int sum = x[3];
        
        int a = sum - x[0];
        int b = sum - x[1];
        int c = sum - x[2];
        
        System.out.println(a + " " + b + " " + c);
        
        scanner.close();
    }
}
