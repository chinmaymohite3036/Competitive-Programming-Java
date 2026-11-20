import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNext()) {
            String remix = scanner.next();
            
            String originalSong = remix.replaceAll("(WUB)+", " ").trim();
            
            System.out.println(originalSong);
        }
        
        scanner.close();
    }
}