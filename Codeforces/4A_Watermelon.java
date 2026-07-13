import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double split = sc.nextDouble();
        if(split > 2 & split % 2 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        sc.close();
    }
}