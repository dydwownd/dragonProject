package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220623 {

/**
6
20 1 15 8 4 10
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>();
        PriorityQueue<Integer> rq = new PriorityQueue<>(Collections.reverseOrder());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr =new int[N];
        int answer = 0;

        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(st.nextToken());
            q.offer(temp);
            rq.offer(temp);
        }

        for(int i=0; i<N; i=i+2){
            arr[i] = rq.poll();
            arr[i+1] = q.poll();
        }

        for(int i=0; i<N-1; i++){
            answer += Math.abs(arr[i]-arr[i+1]);
        }

        System.out.println(answer);
    }
}
