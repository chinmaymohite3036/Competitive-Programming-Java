class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder nextRound = new StringBuilder();
            int sum = 0;
            int count = 0;
            
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';
                count++;
                
                if (count == k || i == s.length() - 1) {
                    nextRound.append(sum);
                    sum = 0;   
                    count = 0; 
                }
            }
            
            s = nextRound.toString();
        }
        
        return s;
    }
}