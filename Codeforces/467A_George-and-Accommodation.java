import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int available_rooms = 0;
 
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            
            if ((q - p) >= 2){
                available_rooms++;
            }
        }
            
        System.out.print(available_rooms);
            
        
        sc.close();
    }
}