import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int MAX = 1_000_000;
        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        StreamTokenizer in = new StreamTokenizer(new InputStreamReader(System.in));
        in.nextToken();
        int n = (int) in.nval;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            in.nextToken();
            long x = (long) in.nval;
            long root = (long) Math.sqrt(x);

            if (root * root == x && isPrime[(int) root]) {
                result.append("YES\n");
            } else {
                result.append("NO\n");
            }
        }

        System.out.print(result);
    }
}