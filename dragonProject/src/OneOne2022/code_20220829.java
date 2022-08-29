package OneOne2022;
import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20220829 {
//1461
/**
7 2
-37 2 -6 -39 -29 11 -28
*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        long answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> rq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num > 0) q.offer(num);
            else rq.offer(Math.abs(num));
        }
        if(!q.isEmpty() && !rq.isEmpty()){
            int temp;
            if(q.peek() > rq.peek()){
                temp = q.peek();
                for(int i=0; i<m; i++){
                    if(!q.isEmpty()) q.poll();
                }
            }else{
                temp = rq.peek();
                for(int i=0; i<m; i++){
                    if(!rq.isEmpty()) rq.poll();
                }
            }
            answer += temp;
        }else if(!q.isEmpty()){
            int temp = q.peek();
            for(int i=0; i<m; i++){
                if(!q.isEmpty()) q.poll();
            }
            answer += temp;
        }else if(!rq.isEmpty()){
            int temp = rq.peek();
            for(int i=0; i<m; i++){
                if(!rq.isEmpty()) rq.poll();
            }
            answer += temp;
        }

        while(!q.isEmpty()){
            int temp = q.poll();
            for(int i=1; i<m; i++){
                if(!q.isEmpty()) q.poll();
            }
            answer += (temp*2);
        }

        while(!rq.isEmpty()){
            int temp = rq.poll();
            for(int i=1; i<m; i++){
                if(!rq.isEmpty()) rq.poll();
            }
            answer += (temp*2);
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
