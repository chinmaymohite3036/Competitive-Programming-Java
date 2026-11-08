import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            int[] counts = new int[5]; 
            for (int i = 0; i < n; i++) {
                counts[scanner.nextInt()]++;
            }
            
            int taxis = 0;
            
            taxis += counts[4];
            
            taxis += counts[3];
            counts[1] = Math.max(0, counts[1] - counts[3]); 
            
            taxis += counts[2] / 2;
            
            if (counts[2] % 2 != 0) {
                taxis++;
                counts[1] = Math.max(0, counts[1] - 2); 
            }
            
            if (counts[1] > 0) {
                taxis += (counts[1] + 3) / 4; 
            }
            
            System.out.println(taxis);
        }
        
        scanner.close();
    }
}