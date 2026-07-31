import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        
        int xsum = 0;
        int ysum = 0;
        int zsum = 0;
        
        for (int i = 0 ; i < n ; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            xsum += x;
            ysum += y;
            zsum += z;
        }
        if (xsum == 0 && ysum == 0 && zsum == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO"); 
        }
        
        sc.close(); 
    }
}