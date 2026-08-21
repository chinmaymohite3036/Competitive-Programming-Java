import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            StringBuilder row = new StringBuilder();
            
            if (i % 2 != 0) {
                for (int j = 0; j < m; j++) {
                    row.append('#');
                }
            } else {
                if ((i / 2) % 2 != 0) {
                    for (int j = 0; j < m - 1; j++) {
                        row.append('.');
                    }
                    row.append('#');
                } else {
                    row.append('#');
                    for (int j = 0; j < m - 1; j++) {
                        row.append('.');
                    }
                }
            }
            System.out.println(row.toString());
        }
        
        scanner.close();
    }
}