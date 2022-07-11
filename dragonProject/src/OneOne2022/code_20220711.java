package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20220711 {
//15321
/**
5
2017
100
20
30
70
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>();
        long answer = 0;

        for(int i=0; i<n; i++) q.offer(Integer.parseInt(br.readLine()));

        while(!q.isEmpty() && q.size()>1){
            int temp = q.poll();
            answer += q.peek()-temp;
        }

        System.out.println(answer);
    }
}
