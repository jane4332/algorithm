class Solution {
    public long solution(long a, long b) {
        long sum = 0;
        if(a > b){
            long c = 0;
            c = a;
            a = b;
        
            b = c;
        } 
        for(long i = a; i <= b; i++ ){
            sum = sum + i;
        }
    
        return sum;
    }
}