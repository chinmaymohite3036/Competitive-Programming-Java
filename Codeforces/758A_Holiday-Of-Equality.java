import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] welfare = new int[n];
        int max = 0;
        
        for (int i = 0; i < n; i++) {
            welfare[i] = sc.nextInt();
            if (welfare[i] > max) {
                max = welfare[i];
            }
        }
        
        int totalSpent = 0;
        for (int i = 0; i < n; i++) {
            totalSpent += (max - welfare[i]); 
        }
        
        System.out.println(totalSpent);
    }
}
