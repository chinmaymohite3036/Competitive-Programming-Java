import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            
            int t = sc.nextInt();
            
            for(int i = 0; i < t; i++){
                int n = sc.nextInt();
                int[] arr = new int[n];
                
                for(int j = 0; j < n; j++){
                    arr[j] = sc.nextInt();
                }
                int minIndex = 0;
                int maxIndex = 0;
                
                for (int k = 1; k < n; k++) {
                    if (arr[k] < arr[minIndex]) {
                        minIndex = k;
                    }
                    if (arr[k] > arr[maxIndex]) {
                        maxIndex = k;
                    }
                }
                int minPos = minIndex + 1;
                int maxPos = maxIndex + 1;
                
                int left = Math.min(minPos, maxPos);
                int right = Math.max(minPos, maxPos);
                
                int cost1 = right;
                int cost2 = (n - left) + 1;
                int cost3 = left + (n - right) + 1;
                
                int moves = Math.min(cost1, Math.min(cost2, cost3));
                
                System.out.println(moves);
            }
                
    }
}