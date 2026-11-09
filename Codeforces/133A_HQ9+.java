import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextLine()) {
            String p = scanner.nextLine();
            
            boolean producesOutput = false;
            
            for (int i = 0; i < p.length(); i++) {
                char c = p.charAt(i);
                if (c == 'H' || c == 'Q' || c == '9') {
                    producesOutput = true;
                    break; 
                }
            }
            
            if (producesOutput) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}