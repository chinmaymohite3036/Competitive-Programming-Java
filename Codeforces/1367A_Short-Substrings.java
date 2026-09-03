import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            
            int t = sc.nextInt();
            
            for(int i = 0; i < t; i++){
                String b = sc.next();
                StringBuilder res = new StringBuilder();
                
                res.append(b.charAt(0));
                res.append(b.charAt(1));
                
                for(int j = 3; j < b.length(); j+=2){
                    res.append(b.charAt(j));
                }
                
                System.out.println(res);
            }
           
            
                
    }
}