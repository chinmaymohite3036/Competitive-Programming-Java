import java.util.Scanner;
 
public class GiftsFixing {
    public static void main(String[] academind) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            
            long minA = Long.MAX_VALUE;
            long minB = Long.MAX_VALUE;
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (a[i] < minA) {
                    minA = a[i];
                }
            }
            
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
                if (b[i] < minB) {
                    minB = b[i];
                }
            }
            
            long totalMoves = 0;
            for (int i = 0; i < n; i++) {
                long diffA = a[i] - minA;
                long diffB = b[i] - minB;
                totalMoves += Math.max(diffA, diffB);
            }
            
            System.out.println(totalMoves);
        }
        sc.close();
    }
}