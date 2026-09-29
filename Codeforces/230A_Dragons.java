import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int s = sc.nextInt();
        int n = sc.nextInt();
        
        int[][] dragons = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            dragons[i][0] = sc.nextInt(); 
            dragons[i][1] = sc.nextInt(); 
        }
        
        Arrays.sort(dragons, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
        
        boolean canWin = true;
        for (int i = 0; i < n; i++) {
            if (s > dragons[i][0]) {
                s += dragons[i][1]; 
            } else {
                canWin = false;
                break;
            }
        }
        
        if (canWin) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}
