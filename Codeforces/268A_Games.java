import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int[] homeColors = new int[n];
        int[] guestColors = new int[n];
        
        for (int i = 0; i < n; i++) {
            homeColors[i] = scanner.nextInt();
            guestColors[i] = scanner.nextInt();
        }
        
        int guestUniformCount = 0;
        
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                if (i != j) {
                    if (homeColors[i] == guestColors[j]) {
                        guestUniformCount++;
                    }
                }
            }
        }
        
        System.out.println(guestUniformCount);
        
        scanner.close();
    }
}
