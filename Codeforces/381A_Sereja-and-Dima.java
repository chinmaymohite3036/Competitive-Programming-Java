import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int[] cards = new int[n];
        
        for (int i = 0; i < n; i++) {
            cards[i] = scanner.nextInt();
        }
        
        int left = 0;
        int right = n - 1;
        int serejaScore = 0;
        int dimaScore = 0;
        boolean isSerejaTurn = true;
        
        while (left <= right) {
            int chosenCard;
            if (cards[left] > cards[right]) {
                chosenCard = cards[left];
                left++;
            } else {
                chosenCard = cards[right];
                right--;
            }
            
            if (isSerejaTurn) {
                serejaScore += chosenCard;
            } else {
                dimaScore += chosenCard;
            }
            
            isSerejaTurn = !isSerejaTurn; // Switch turn
        }
        
        System.out.println(serejaScore + " " + dimaScore);
        scanner.close();
    }
}