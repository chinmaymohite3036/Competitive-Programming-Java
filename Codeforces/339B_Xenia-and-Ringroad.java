import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            
            long totalTime = 0;
            int currentHouse = 1; // Xenia starts at house 1
            
            for (int i = 0; i < m; i++) {
                int targetHouse = scanner.nextInt();
                
                if (targetHouse >= currentHouse) {
                    totalTime += (targetHouse - currentHouse);
                } else {
                    totalTime += (n - currentHouse + targetHouse);
                }
                
                currentHouse = targetHouse;
            }
            
            System.out.println(totalTime);
        }
        
        scanner.close();
    }
}