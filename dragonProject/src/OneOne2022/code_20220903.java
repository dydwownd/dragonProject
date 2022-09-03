package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20220903 {
//1781

/**
7
1 6
1 7
3 2
3 1
2 4
2 5
6 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr = new int[n][2];
        PriorityQueue<Integer> q = new PriorityQueue<>();
        long answer = 0;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,(o1, o2) -> o1[0]==o2[0] ? o2[1]-o1[1] : o1[0]-o2[0]);

        for(int i=0; i<n; i++){
            if(q.size()<arr[i][0]) q.offer(arr[i][1]);
            else if(q.size() == arr[i][0] && q.peek() < arr[i][1]){
                q.poll();
                q.offer(arr[i][1]);
            }
        }

        while(!q.isEmpty()){
            answer += q.poll();
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }


}
