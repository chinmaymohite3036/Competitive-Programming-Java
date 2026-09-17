import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int timeAvailable = 240 - k;
        int solved = 0;

        for (int i = 1; i <= n; i++) {
            if (timeAvailable >= 5 * i) {
                timeAvailable -= 5 * i;
                solved++;
            } else {
                break;
            }
        }

        System.out.println(solved);
    }
}
