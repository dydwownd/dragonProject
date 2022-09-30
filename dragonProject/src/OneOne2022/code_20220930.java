package OneOne2022;
import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20220930 {
//19598

/**
3
0 40
15 30
5 10
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<int[]> q = new PriorityQueue<>((o1, o2) -> o1[0]==o2[0]?o1[1]-o2[1]:o1[0]-o2[0]);
        PriorityQueue<Integer> answer = new PriorityQueue<>();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            q.offer(new int[]{Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())});
        }

        while (!q.isEmpty()){
            int[] now = q.poll();
            if(answer.isEmpty() || answer.peek() > now[0]){
                answer.offer(now[1]);
            }else if(answer.peek() <= now[0]){
                answer.poll();
                answer.offer(now[1]);
            }
        }

        bw.write(answer.size() + "\n");
        bw.close();
        br.close();
    }
}
