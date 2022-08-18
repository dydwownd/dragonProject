package OneOne2022;
import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20220817 {
//15903
/**
3 1
3 2 6
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        PriorityQueue<Long> q = new PriorityQueue<>();
        long answer = 0;

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++) q.offer(Long.parseLong(st.nextToken()));

        for(int i=0; i<m; i++){
            long result = q.poll()+q.poll();
            q.offer(result);
            q.offer(result);
        }

        while(!q.isEmpty()) answer += q.poll();

        bw.write(answer+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
