import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();
        
        // 약관 종류와 유효기간을 매핑
        Map<String, Integer> type = new HashMap<>();
        for (String s : terms) {
            String[] term = s.split(" ");
            type.put(term[0], Integer.parseInt(term[1]));
        }
        
        // 오늘 날짜 처리
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate dateToday = LocalDate.parse(today, formatter);

        // 개인정보 처리
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            LocalDate startDt = LocalDate.parse(privacy[0], formatter);
            String ptype = privacy[1];
            
            // 해당 약관에 맞는 유효기간을 구함
            int period = type.get(ptype);
            
            // 유효기간 종료 날짜 계산
            LocalDate expirationDate = startDt.plusMonths(period);  // 유효기간이 끝나는 날짜는 포함 안됨
            
            // expirationDate가 today와 같거나 이전이면 파기해야 함
            if (!expirationDate.isAfter(dateToday)) {
                result.add(i + 1); // 개인정보 번호는 1부터 시작하므로, i + 1
            }
        }

        // 결과 리스트를 배열로 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
