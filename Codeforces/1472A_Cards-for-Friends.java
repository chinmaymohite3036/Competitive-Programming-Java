import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int n = sc.nextInt();

            int pieces = 1;

            while (w % 2 == 0) {
                w = w / 2;
                pieces = pieces * 2;
            }

            while (h % 2 == 0) {
                h = h / 2;
                pieces = pieces * 2;
            }

            if (pieces >= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}