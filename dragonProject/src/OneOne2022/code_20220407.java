package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20220407 {

/**
2
5
3 10 2 8 14
1
13
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            long answer = 0;
            PriorityQueue<Long> q = new PriorityQueue<>();
            if(n==1){
                System.out.println(1);
            }else{
                for(int j=0; j<n; j++){
                    q.offer(Long.parseLong(st.nextToken()));
                }

                while(!q.isEmpty() && q.size()>1){
                    long a = q.poll();
                    long b = q.poll();
                    if(answer == 0) answer = a*b%1000000007;
                    else answer *= a*b%1000000007;
                    q.offer(a*b%1000000007);
                }
                System.out.println(answer);
            }

        }
    }

}
