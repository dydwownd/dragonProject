package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20221025 {
//1689

/**
11
1 2
3 6
7 8
10 11
13 16
0 5
5 6
2 5
6 10
9 14
12 15
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,(o1, o2) -> o1[0]-o2[0]);

        int answer = 1;
        q.offer(arr[0][1]);

        for(int i=1; i<n; i++){
            while (!q.isEmpty() && q.peek() <= arr[i][0]){
                q.poll();
            }
            q.offer(arr[i][1]);
            answer = Math.max(answer,q.size());
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
