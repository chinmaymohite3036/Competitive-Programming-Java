import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int y = sc.nextInt();

        while (true) {
            y++;
            int copy = y;
            
            int a = copy % 10;
            int b = (copy / 10) % 10;
            int c = (copy / 100) % 10;
            int d = (copy / 1000) % 10;
            
            if (a != b && a != c && a != d && b != c && b != d && c != d) {
                System.out.print(y);
                break;
            } 
        }
        
        sc.close();
    }
}
