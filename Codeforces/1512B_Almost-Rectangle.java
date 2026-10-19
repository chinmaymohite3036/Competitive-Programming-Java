import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int r1 = -1, c1 = -1, r2 = -1, c2 = -1;
            String[] grid = new String[n];
 
            for (int i = 0; i < n; i++) {
                grid[i] = sc.next();
                for (int j = 0; j < n; j++) {
                    if (grid[i].charAt(j) == '*') {
                        if (r1 == -1) { r1 = i; c1 = j; } 
                        else { r2 = i; c2 = j; }
                    }
                }
            }
 
            if (r1 == r2) r1 = r2 = (r1 == 0) ? 1 : 0;
            if (c1 == c2) c1 = c2 = (c1 == 0) ? 1 : 0;
 
            for (int i = 0; i < n; i++) {
                StringBuilder row = new StringBuilder(grid[i]);
                if (i == r1) row.setCharAt(c2, '*');
                if (i == r2) row.setCharAt(c1, '*');
                System.out.println(row);
            }
        }
        sc.close();
    }
}