import java.util.Scanner;

public class NotShading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int r = sc.nextInt() - 1; 
            int c = sc.nextInt() - 1;
            
            boolean hasBlack = false;
            boolean rowHasBlack = false;
            boolean colHasBlack = false;
            boolean targetIsBlack = false;
            
            for (int i = 0; i < n; i++) {
                String row = sc.next();
                for (int j = 0; j < m; j++) {
                    if (row.charAt(j) == 'B') {
                        hasBlack = true;
                        if (i == r) rowHasBlack = true;
                        if (j == c) colHasBlack = true;
                        if (i == r && j == c) targetIsBlack = true;
                    }
                }
            }
            
            if (targetIsBlack) System.out.println(0);
            else if (rowHasBlack || colHasBlack) System.out.println(1);
            else if (hasBlack) System.out.println(2);
            else System.out.println(-1);
        }
        sc.close();
    }
}
