import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int m = sc.nextInt();
        int n = sc.nextInt();
 
        int total_squares = m * n;
        int max_dominos = total_squares/2;
 
        System.out.println(max_dominos);
    }
}