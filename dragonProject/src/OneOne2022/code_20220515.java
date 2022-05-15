package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20220515 {

/**
5 2
1 4 4 8 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> q = new PriorityQueue<>();
        Integer[] arr = new Integer[N];

        for(int i=0; i<M; i++){
            q.offer(0);
        }

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0; i<N; i++){
            q.offer(q.poll()+arr[i]);
        }

        for(int i=0; i<M-1; i++){
            q.poll();
        }

        System.out.print(q.poll());

    }
}
