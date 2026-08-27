import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            String s = sc.next(); 
            ArrayList<String> answers = new ArrayList<>();
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '0') {
                    
                    String roundNumber = "" + s.charAt(i); 
                    
                    int zerosNeeded = s.length() - 1 - i;
                    for (int j = 0; j < zerosNeeded; j++) {
                        roundNumber += "0";
                    }
                    
                    answers.add(roundNumber);
                }
            }
            
            System.out.println(answers.size());
            
            System.out.println(String.join(" ", answers));
        }
        sc.close();
    }
}
