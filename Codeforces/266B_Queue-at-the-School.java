import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();
 
        StringBuilder a = new StringBuilder(s);
 
        for (int second = 0; second < t; second++) {
 
            for (int i = 0; i < n - 1; i++) {
 
                if (a.charAt(i) == 'B' && a.charAt(i+1) == 'G') {
 
                    char temp = a.charAt(i);
                    a.setCharAt(i, a.charAt(i + 1));
                    a.setCharAt(i + 1, temp);
 
                    i++;
                }
            }
        }
 
        System.out.println(a);
 
        sc.close();
    }
}