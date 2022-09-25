package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20220925 {
//1374

/**
8
6 15 21
7 20 25
1 3 8
3 2 14
8 6 27
2 7 13
4 12 18
5 6 20
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int[][] arr= new int[n][2];
        int answer = 0;
        int min = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int no = Integer.parseInt(st.nextToken());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,(o1, o2) -> o1[0]==o2[0]?o1[1]-o2[1]:o1[0]-o2[0]);

        for(int i=0; i<n; i++){
            while(!q.isEmpty() && q.peek()<=arr[i][0]){
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
