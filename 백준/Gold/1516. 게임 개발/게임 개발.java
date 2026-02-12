import java.util.*;
import java.io.*;


public class Main {
    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());

        // 인접리스트 만들어주기??
        for(int i = 0; i<=N ; i ++){
            A.add(new ArrayList<>());
        }

        int[] selfTime =  new int[N+1];
        int[] indegree = new int[N+1];

        for(int i = 1; i <= N ; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            selfTime[i]= Integer.parseInt(st.nextToken());
            while(true){
                int x = Integer.parseInt(st.nextToken());
                if(x== -1) break;
                A.get(x).add(i);
                indegree[i]++;
            }
            
        }

        Queue<Integer> link = new LinkedList<>();
        for(int i =1; i<=N; i ++){
            if(indegree[i]==0){
                link.offer(i);
            }
        }

        int[] result = new int[N+1];

        while(!link.isEmpty()){
            int now = link.poll();
            for(int next: A.get(now)){
                result[next] = Math.max(result[next], result[now]+selfTime[now]);
                indegree[next]--;
                if(indegree[next]==0) link.offer(next);
            }
            
        }


        for(int i=1; i<=N ;i++){
            System.out.println(result[i]+selfTime[i]);
        }


    }



}