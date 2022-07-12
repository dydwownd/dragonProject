package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220712 {
//23845
/**
7
5 3 4 10 4 8 9
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[] arr = new int[n];
        PriorityQueue<Integer> rq = new PriorityQueue<>(Collections.reverseOrder());
        long answer = 0;

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        rq.offer(arr[0]);

        for(int i=1; i<n; i++){
            if(arr[i] > rq.peek()+1){
                answer += rq.size()*rq.peek();
                while(!rq.isEmpty()) rq.poll();
                rq.offer(arr[i]);
            }else if(arr[i] == rq.peek()+1){
                rq.offer(arr[i]);
            }else if(arr[i] == rq.peek()){
                if(i+1<n && arr[i+1] == rq.peek()+1){
                    answer += arr[i];
                }else{
                    answer += rq.size()*rq.peek();
                    while(!rq.isEmpty()) rq.poll();
                    rq.offer(arr[i]);
                }
            }
        }

        if(rq.size()>0) answer += rq.size()*rq.peek();

        System.out.println(answer);
    }
}
