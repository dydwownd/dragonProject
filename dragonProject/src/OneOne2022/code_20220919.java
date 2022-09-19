package OneOne2022;
import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20220919 {
//3135

/**
100 15
1
15
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int nowNum = Integer.parseInt(st.nextToken());
        int targetNum = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.offer(Math.abs(nowNum-targetNum));

        for(int i=0; i<n; i++){
            q.offer(Math.abs(targetNum-Integer.parseInt(br.readLine()))+1);
        }

        bw.write(q.peek() + "\n");
        bw.close();
        br.close();
    }
}
