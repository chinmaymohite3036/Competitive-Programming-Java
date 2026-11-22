import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNext()) {
            String word = scanner.next();
            char[] chars = word.toCharArray();
            boolean shouldFlip = true;
            
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] >= 'a') { 
                    shouldFlip = false;
                    break;
                }
            }
            
            if (shouldFlip) {
                for (int i = 0; i < chars.length; i++) {
                    chars[i] ^= 32; 
                }
                System.out.println(new String(chars));
            } else {
                System.out.println(word);
            }
        }
        
        scanner.close();
    }
}