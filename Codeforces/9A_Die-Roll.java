import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int y = scanner.nextInt();
            int w = scanner.nextInt();
            
            int wins = 7 - Math.max(y, w);
            String[] fractions = {"0/1", "1/6", "1/3", "1/2", "2/3", "5/6", "1/1"};
            
            System.out.println(fractions[wins]);
        }
        
        scanner.close();
    }
}