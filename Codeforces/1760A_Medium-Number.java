import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int[] numbers = new int[3];
            numbers[0] = sc.nextInt();
            numbers[1] = sc.nextInt();
            numbers[2] = sc.nextInt();
            
            Arrays.sort(numbers);
            
            System.out.println(numbers[1]);
        }
        
        sc.close();
    }
}
