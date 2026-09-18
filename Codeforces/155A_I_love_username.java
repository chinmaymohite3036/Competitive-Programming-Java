import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int firstScore = sc.nextInt();
        int maxScore = firstScore;
        int minScore = firstScore;
        int amazingContests = 0;
        
        for (int i = 1; i < n; i++) {
            int currentScore = sc.nextInt();
            
            if (currentScore > maxScore) {
                maxScore = currentScore;
                amazingContests++;
            } else if (currentScore < minScore) {
                minScore = currentScore;
                amazingContests++;
            }
        }
        
        System.out.println(amazingContests);
        sc.close();
    }
}
