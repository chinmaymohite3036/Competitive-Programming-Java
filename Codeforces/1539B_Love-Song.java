import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        String s = sc.next();
        
        int[] prefixSum = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            int letterValue = s.charAt(i) - 'a' + 1;
            prefixSum[i + 1] = prefixSum[i] + letterValue;
        }
        
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            
            int result = prefixSum[r] - prefixSum[l - 1];
            System.out.println(result);
        }
        
        sc.close();
    }
}
