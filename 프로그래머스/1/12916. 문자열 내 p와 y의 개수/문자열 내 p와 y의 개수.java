class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_count =0;
        int y_count =0;
        for(int i =0; i< s.length(); i++){
            if(String.valueOf(s.charAt(i)).equalsIgnoreCase("p")){
                p_count ++;
            }else if(String.valueOf(s.charAt(i)).equalsIgnoreCase("y")){
                y_count++;
            }
        }
        if(p_count == y_count){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}