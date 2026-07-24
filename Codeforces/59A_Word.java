import java.util.Scanner;

public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        String s = sc.next(); 
        int uppercase_count = 0;
        int lowercase_count = 0;
        
        for (int i = 0; i < s.length(); i++) { 
            char character = s.charAt(i);
            if (Character.isUpperCase(character)) { 
                uppercase_count++; 
            } else { 
                lowercase_count++; 
            } 
        } 
        if(uppercase_count > lowercase_count){
            s = s.toUpperCase();
        }else{
            s = s.toLowerCase();
        }
        
        System.out.println(s); 
        sc.close(); 
    } 
}
