import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        
        int toastsByDrink = (k * l) / nl;
        int toastsByLime = c * d;
        int toastsBySalt = p / np;
        
        int maxTotalToasts = Math.min(toastsByDrink, Math.min(toastsByLime, toastsBySalt));
        int toastsPerFriend = maxTotalToasts / n;
        
        System.out.println(toastsPerFriend);
        
        sc.close();
    }
}
