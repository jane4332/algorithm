import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int row = 0;
        int col = 0;
        if(w%(m+1)>0){
            col = w/(m+1)+1;
        }else{
            col = w/(m+1); //5
        }
        
        if(h%(n+1) >0){
            row =h/(n+1)+1;
        }else{
            row = h/(n+1);
        }
        int result = col*row;
        
        System.out.println(result);
        
    }
}