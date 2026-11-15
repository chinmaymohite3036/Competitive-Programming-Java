import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] heights = new int[n];
            
            int maxHeight = 0;
            int minHeight = 101;
            int maxIndex = 0;
            int minIndex = 0;
            
            for (int i = 0; i < n; i++) {
                heights[i] = scanner.nextInt();
                
                if (heights[i] > maxHeight) {
                    maxHeight = heights[i];
                    maxIndex = i;
                }
                
                if (heights[i] <= minHeight) {
                    minHeight = heights[i];
                    minIndex = i;
                }
            }
            
            int totalSeconds = maxIndex + (n - 1 - minIndex);
            
            if (maxIndex > minIndex) {
                totalSeconds--;
            }
            
            System.out.println(totalSeconds);
        }
        
        scanner.close();
    }
}