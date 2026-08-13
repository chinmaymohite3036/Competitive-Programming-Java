import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        String s1 = sc.next();
        String s2 = sc.next();
 
        StringBuilder result = new StringBuilder();
 
        for (int i = 0; i < s1.length(); i++) {
 
            if ( s1.charAt(i) == s2.charAt(i)){
 
                result.append('0');
 
            } else {
 
                result.append('1');
            }
        }
 
        System.out.println(result);
 
        sc.close();
    }
}