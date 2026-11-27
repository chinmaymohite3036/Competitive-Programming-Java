import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int t = scanner.nextInt();
        int[] cols = new int[500];
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                String row = scanner.next();
                cols[i] = row.indexOf('#') + 1;
            }

            for (int i = n - 1; i >= 0; i--) {
                out.append(cols[i]).append(i > 0 ? ' ' : '\n');
            }
        }

        System.out.print(out);
        scanner.close();
    }
}