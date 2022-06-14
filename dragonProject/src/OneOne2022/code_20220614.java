package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.*;

public class code_20220614 {

/**
3
7 11 13
10
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(br.readLine());
        PriorityQueue<Double> q = new PriorityQueue<>();
        PriorityQueue<Double> rq = new PriorityQueue<>(Collections.reverseOrder());
        double answer = Double.MAX_VALUE;

        for(int i=0; i<N; i++){
            double temp = Double.parseDouble(st.nextToken());
            q.offer(temp);
            rq.offer(temp);
        }

        while(M>0){
            if(q.peek() == rq.peek()){
                answer = 0;
                break;
            }else{
                double temp = rq.poll()/2;
                if(temp>q.peek()){
                    q.offer(temp);
                    q.offer(temp);
                }
                rq.offer(temp);
                rq.offer(temp);
            }
            answer = Math.min(answer,Math.abs(q.peek()-rq.peek()));
            M--;
        }

        System.out.println(answer);
    }
}
