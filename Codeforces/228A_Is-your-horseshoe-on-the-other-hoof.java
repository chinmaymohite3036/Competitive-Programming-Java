import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> uniqueColors = new HashSet<>();
        
        for (int i = 0; i < 4; i++) {
            uniqueColors.add(sc.nextInt());
        }
        
        System.out.println(4 - uniqueColors.size());
    }
}
