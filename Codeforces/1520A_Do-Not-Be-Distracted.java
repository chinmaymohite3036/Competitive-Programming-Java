import java.util.Scanner;
import java.util.HashSet;
 
public class DoNotBeDistracted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            if (isPolycarpSuspicious(s)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        
        sc.close();
    }
    
    private static boolean isPolycarpSuspicious(String s) {
        HashSet<Character> seenTasks = new HashSet<>();
        char prevTask = s.charAt(0);
        seenTasks.add(prevTask);
        
        for (int i = 1; i < s.length(); i++) {
            char currentTask = s.charAt(i);
            
            if (currentTask != prevTask) {
                if (seenTasks.contains(currentTask)) {
                    return true; 
                }
                seenTasks.add(currentTask);
                prevTask = currentTask;
            }
        }
        return false;
    }
}
