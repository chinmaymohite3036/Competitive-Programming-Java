import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int m = sc.nextInt(); 
            
            boolean[] rowHasOne = new boolean[n];
            boolean[] colHasOne = new boolean[m];
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int element = sc.nextInt();
                    if (element == 1) {
                        rowHasOne[i] = true;
                        colHasOne[j] = true;
                    }
                }
            }
            
            int availableRows = 0;
            for (int i = 0; i < n; i++) {
                if (!rowHasOne[i]) {
                    availableRows++;
                }
            }
            
            int availableCols = 0;
            for (int j = 0; j < m; j++) {
                if (!colHasOne[j]) {
                    availableCols++;
                }
            }
            
            int maxMoves = Math.min(availableRows, availableCols);
            
            if (maxMoves % 2 != 0) {
                System.out.println("Ashish");
            } else {
                System.out.println("Vivek");
            }
        }
        
        sc.close();
    }
}
