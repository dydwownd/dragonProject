package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20221126 {
//17503

/**
3 9 5
2 5
4 6
3 3
4 3
1 4
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] arr = new int[k][2];
        int sum = 0;
        int answer = -1;

        for(int i=0; i<k; i++){
            st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,(o1, o2) -> o1[1]-o2[1]);

        for (int i = 0; i < k; i++) {
            pq.add(arr[i][0]);
            sum += arr[i][0];

            if (pq.size() > n) {
                int min = pq.peek() == null ? 0 : pq.poll();
                sum -= min;
            }

            if (pq.size() == n && sum >= m) {
                answer = arr[i][1];
                break;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
