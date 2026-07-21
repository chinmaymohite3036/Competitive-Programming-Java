import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int year_count = 0;
        
        while( a <= b ){
            a *= 3;
            b *= 2;
            year_count++;
        }
        
        System.out.println(year_count);
        
        sc.close();

    }
}