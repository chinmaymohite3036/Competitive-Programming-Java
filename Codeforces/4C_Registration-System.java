import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            Map<String, Integer> database = new HashMap<>();
            
            for (int i = 0; i < n; i++) {
                String name = scanner.next();
                Integer count = database.get(name);
                
                if (count == null) {
                    database.put(name, 1);
                    System.out.println("OK");
                } else {
                    System.out.println(name + count);
                    database.put(name, count + 1);
                }
            }
        }
        
        scanner.close();
    }
}