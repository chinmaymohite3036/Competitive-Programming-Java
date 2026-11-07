import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            
            System.out.println(Integer.bitCount(x));
        }
        
        scanner.close();
    }
}