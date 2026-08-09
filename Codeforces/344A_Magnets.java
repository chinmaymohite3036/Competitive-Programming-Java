import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int groups = 1; 
        
        String currentMagnet = sc.next();
        
        for (int i = 1; i < n; i++) {
            String nextMagnet = sc.next();
            
            if (!nextMagnet.equals(currentMagnet)) {
                groups++;
                currentMagnet = nextMagnet;
            }
        }
        
        System.out.println(groups);
        
        sc.close();
    }
}
