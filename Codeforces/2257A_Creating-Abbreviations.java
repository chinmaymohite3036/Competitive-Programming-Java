import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            String[] nm = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            
            boolean[] alpha = new boolean[26];
            for (int i = 0; i < n; i++) {
                alpha[br.readLine().trim().charAt(0) - 'a'] = true;
            }
            
            boolean possible = true;
            for (int i = 0; i < m; i++) {
                String abbr = br.readLine().trim();
                for (char c : abbr.toCharArray()) {
                    if (!alpha[c - 'A']) possible = false;
                }
            }
            
            System.out.println(possible ? "YES" : "NO");
        }
    }
}
