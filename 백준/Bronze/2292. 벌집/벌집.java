import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        int range =2;
      
        if(n == 1){
            System.out.println(1);
        }else{

            while(range<=n){
                range = range +(cnt*6);
                cnt++;
            }
            System.out.println(cnt);
        }
       
    }

}
