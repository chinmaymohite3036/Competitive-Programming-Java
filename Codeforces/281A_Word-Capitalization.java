import java.util.Scanner;

public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        String s = sc.next(); 
        
        char first_char = s.charAt(0);
        
        if(Character.isLowerCase(first_char)){
            first_char = Character.toUpperCase(first_char);
        }
        
        String slice = s.substring(1); 
        
        System.out.println(first_char + slice); 
        sc.close(); 
    } 
}
