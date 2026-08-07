
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] matrix = new int[5][5];
        
        int rowOfOne = 0;
        int colOfOne = 0;
        
        for (int r = 0; r < 5; r++) {      
            for (int c = 0; c < 5; c++) {   
                
                matrix[r][c] = sc.nextInt(); 
                
 
                if (matrix[r][c] == 1) {
                    rowOfOne = r; 
                    colOfOne = c; 
                }
            }
        }
        
        int rowMoves = Math.abs(rowOfOne - 2); 
        int colMoves = Math.abs(colOfOne - 2); 
        
        int totalMoves = rowMoves + colMoves;
        
        System.out.println(totalMoves);
        
        sc.close();
    }
}