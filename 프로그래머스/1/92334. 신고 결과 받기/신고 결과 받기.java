import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};

       // 1. id_list 가 신고한 사람 갖고있는 형태
        // id_map <String, Set>
        Map<String, Set<String>> id_map = new HashMap<>();
        
        // 중복 신고건 없애기 위해 report set 형태로 만들기
        Set<String> set_report = new HashSet<>(Arrays.asList(report));
        
        //타겟이 얼마나 신고당햇는지 확인용
         Set<String, Integer> target_map = new HashSet<>();
        
        //id 당 신고한사람 갯수 찾기위함
        for(String name : id_list){
            id_map.put(name, new HashSet<>());
        }
         
        // 리포트 돌면서 공백 기준으로 신고자, 타깃 나눠서 누가 누굴 신고했는지 id_map 에 담아주기
        for(String s : set_report){
            String reporter = s.split(" ")[0];
            String target = s.split(" ")[1];
            
            id_map.get(reporter).add(target);
            target_set.get(reporter) = target_set.get(reporter)+1;
            System.out.println(target_set.toString());
        }
        
       
        
        // System.out.println(reporter+"확인"+target);
        
        
        

         return new int[] {};
    }
}


        
 // 실패한 방법 => 너무 for문을 많이 돌아야함       
//         // 1. 리포트에서 중복 제거 => 같은사람에 대해서 한번만 신고할 수 있으므로
//         report = Arrays.stream(report).distinct().toArray(String[]::new);
        
//          // 2. Id_List를 맵에 담아서 key Value 형태로 신고당한횟수가 나올때마다 Value 값 증가시키기
//         Map<String, Integer> id_map = new HashMap<>();
//         int id_list_length = id_list.length;
//         for(int i =0; i< id_list_length; i++ ){
//             id_map.put(id_list[i],0);
//         }
        
        
// 3. 리포트에서 배열을 for문 돌면서 공백 기준으로 앞뒤로 나눈 후 신고당한사람을 key 로 갖고있는 맵 value 증가시키기
//         Set<String> dec_set = new HashSet<>();          
//         for(int i=0 ; i<report.length ;i++){
//             String dec = report[i].split(" ")[1];
//              id_map.put(dec, id_map.get(dec) + 1);
//             // 신고 횟수가 k 이상이면 중복 없이 추가
//             if (id_map.get(dec) >= k) {
//                 dec_set.add(dec);  
//             }
//             System.out.println(dec_set);
//         }