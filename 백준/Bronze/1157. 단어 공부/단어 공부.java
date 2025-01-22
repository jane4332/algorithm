import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       
       //nextLine으로 받았기 때문에 공백제거
       s = s.replace(" ", "");
       
       //전부 대문자로 치환
       s = s.toUpperCase();

       String [] list = s.split("");
       HashMap<String, Integer> result = new HashMap<>();
        Integer beforeValue = 0;
       for(int i = 0 ; i< s.length(); i++){
        // 같은 키가 있을경우
       if(result.containsKey(list[i])){
        //같은 key 가 있을경우 value = value+1
        beforeValue = result.get(list[i]);
        result.replace(list[i],beforeValue+1);
       }else{
        result.put(list[i], 1);
        }
       }
       ArrayList<String> lastResult = new ArrayList<>();
       
       Integer maxValue = Collections.max(result.values());
       for (String key : result.keySet()) {
        if (result.get(key).equals(maxValue)) {
            lastResult.add(key);
        }
    }

    if (lastResult.size() == 1){
        System.out.println(lastResult.get(0));
    }else{
        System.out.println("?");
    }
       
    }
}