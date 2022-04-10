package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20220410 {

/**
5 1 2 7 8 9
6 3 4 2 2 2 2
9 0 1 2 3 4 0 1 2 3
0
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());

            if(n == 0) break;

            PriorityQueue<Integer> q = new PriorityQueue<>();
            int zeroCnt = 0;
            StringBuilder result1 = new StringBuilder();
            StringBuilder result2 = new StringBuilder();

            for(int i=0; i<n; i++){
                int num = Integer.parseInt(st.nextToken());
                if(num == 0) zeroCnt++;
                else q.offer(num);
            }

            result1.append(q.poll());
            result2.append(q.poll());

            for(int i=0; i<zeroCnt/2; i++){
                result1.append(0);
                result2.append(0);
            }

            if(zeroCnt%2 == 1) result1.append(0);

            while(!q.isEmpty()){
                result1.append(q.poll());
                if(q.isEmpty()) break;
                result2.append(q.poll());
            }

            int result = Integer.parseInt(result1.toString()) + Integer.parseInt(result2.toString());

            System.out.println(result);
        }
    }

}
