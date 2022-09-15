package OneOne2022;
import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20220916 {
//13975

/**
2
4
40 30 30 50
15
1 21 3 4 5 35 5 4 3 5 98 21 14 17 32
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int testCase=0; testCase<t; testCase++){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            PriorityQueue<Long> q = new PriorityQueue<>();
            long answer = 0;

            for(int i=0; i<n; i++) q.offer(Long.parseLong(st.nextToken()));

            while(!q.isEmpty() && q.size()>1){
                long temp = q.poll()+q.poll();
                answer += temp;
                q.offer(temp);
            }

            sb.append(answer);
            sb.append("\n");
        }


        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
