import java.util.*;
class Solution {
    public long solution(long n) {
        String [] a = String.valueOf(n).split("");
        Arrays.sort(a, Collections.reverseOrder());
         String sortedString = String.join("", a);
        
        long answer = Long.parseLong(sortedString);
        return answer;
    }
}