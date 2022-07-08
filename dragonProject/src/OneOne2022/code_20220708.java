package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220708 {
//16207
/**
9
10 3 4 4 4 5 6 6 6
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Integer[] arr = new Integer[N];
        Queue<Integer> q = new LinkedList<>();
        long answer = 0;

        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0; i<N-1; i++){
            if(arr[i] == arr[i+1] || arr[i]-1 == arr[i+1]){
                q.offer(arr[i+1]);
                i++;
            }
        }

        while(!q.isEmpty() && q.size()>=2){
            answer += q.poll()*q.poll();
        }

        System.out.println(answer);
    }
}
