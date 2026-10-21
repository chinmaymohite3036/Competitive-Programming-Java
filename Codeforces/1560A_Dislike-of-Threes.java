import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int k = sc.nextInt();
            int currentNum = 0;
            
            for (int count = 0; count < k; ) {
                currentNum++;
                if (currentNum % 3 != 0 && currentNum % 10 != 3) {
                    count++; 
                }
            }
            
            System.out.println(currentNum);
        }
        
        sc.close();
    }
}
