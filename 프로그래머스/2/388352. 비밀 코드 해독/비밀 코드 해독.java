import java.util.*;

class Solution {
    public int answer;
    public int solution(int n, int[][] q, int[] ans) {
        answer = 0;
        logic(new ArrayList<>(),n,1,q,ans);
        return answer;
    }
    
    public void logic(List<Integer> code, int n, int start, int[][] q, int[] ans){
        if(code.size() ==5){
            // 5개로 조합 만들었을때 체크
            if(validate(code,q,ans)){
                answer++;
            }
            //리턴하는 이유 for 문으로 다시 돌아가서 확인 한 경우의 수는 제거해야함
            return;
        }
        for(int i = start; i<=n;i++){
            //조합만들기
            code.add(i);
             logic(code,n,i+1,q,ans);
            // 마지막 요소 제거하고 for문 마저돌기
            code.remove(code.size()-1);
        }
    } 
    
    public boolean validate(List<Integer> code, int[][] q, int[] ans){
        // 시스템응답과 같은지 비교
        
        for(int j =0; j<q.length;j++){
            //q에 포함된 갯수 확인용
            int  check =0;
            for(int item: q[j]){
                if (code.contains(item)) {
                    check++;
                }
                
            }
            if(check != ans[j]){
                return false;
            }
            
        }
        return true;
    }
}