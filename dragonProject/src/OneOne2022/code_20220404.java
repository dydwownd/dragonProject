package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20220404 {

/**
5 7
10 20 30 40 50
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<N; i++){
            int A = Integer.parseInt(st.nextToken());
            if(A == 10) answer++;
            else q.offer(A);
        }

        while(M>0 && !q.isEmpty()){
            int temp = q.poll();
            if(temp/10 < M){
                answer += temp/10;
                if(temp%10 == 0) answer++;
                M -= temp/10;
            }else{
                answer += M;
                M = 0;
            }
        }

        System.out.println(answer);

    }

}
