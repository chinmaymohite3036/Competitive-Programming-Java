import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long u = sc.nextLong();
        long v = sc.nextLong();
 
        if (u > v || (v - u) % 2 != 0) {
            System.out.println("-1");
        } 
        else if (u == 0 && v == 0) {
            System.out.println("0");
        } 
        else if (u == v) {
            System.out.println("1\n" + u);
        } 
        else {
            long x = (v - u) / 2;
            
            if ((u & x) == 0) {
                System.out.println("2\n" + (u + x) + " " + x);
            } else {
                System.out.println("3\n" + u + " " + x + " " + x);
            }
        }
    }
}