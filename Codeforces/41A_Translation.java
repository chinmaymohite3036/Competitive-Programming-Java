import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String t = sc.next();
        
        String reversed = "";

        for (int i = s.length() - 1 ; i >=0; i--) {
            reversed += s.charAt(i);
        }
            
            if (reversed.equals(t)) {
                System.out.print("YES");
            } else{
                System.out.print("NO");
            }
        
        sc.close();
    }
}
