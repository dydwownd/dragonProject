package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20220526 {

/**
6 3 2 2
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int answer = 0;

        PriorityQueue<Integer> q=  new PriorityQueue<>();

        for(int i=0; i<N; i++){
            q.offer(K);
        }

        while(q.peek() > answer){
            answer++;
            for(int i=0; i<A; i++){
                q.offer(q.poll()+B);
            }
        }

        System.out.print(answer);

    }
}
