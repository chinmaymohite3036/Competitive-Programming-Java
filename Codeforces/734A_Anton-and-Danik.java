import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        
        int anton_count = 0;
        int danik_count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A'){
                anton_count++;
            } else {
                danik_count++;
            }
        }
        if (anton_count > danik_count){
            System.out.println("Anton");
        } else if (anton_count < danik_count){
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
