import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        double sum = 0;
 
        for (int i = 0; i < n; i++) {
            
            double p = sc.nextDouble();
            sum += p;
        }
        
        double average = sum / n;
 
        System.out.println(average);
 
        sc.close();
    }
}