import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        
        int price = k*(w * (w+1) / 2);
        
        int borrow = price - n;
        
        if (borrow > 0 ){
            System.out.println(borrow);
        } else {
            System.out.println(0);
        }
        
        sc.close();

    }
}