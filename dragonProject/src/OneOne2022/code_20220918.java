package OneOne2022;
import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20220918 {
//12018

/**
5 76
5 4
36 25 1 36 36
4 4
30 24 25 20
6 4
36 36 36 36 36 36
2 4
3 7
5 4
27 15 26 8 14
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int answer = 0;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            int P = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());
            PriorityQueue<Integer> temp = new PriorityQueue<>(Collections.reverseOrder());

            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<P; j++) temp.offer(Integer.parseInt(st.nextToken()));

            if(L>P){
                q.offer(1);
            }else{
                for(int j=0; j<L-1; j++) temp.poll();
                q.offer(temp.peek());
            }
        }

        while(!q.isEmpty() && q.peek() <= m){
            m -= q.poll();
            answer++;
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
