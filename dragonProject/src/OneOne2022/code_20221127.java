package OneOne2022;
import java.io.*;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class code_20221127 {
//2785

/**
2
3 3
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        PriorityQueue<Integer> q = new PriorityQueue<>();
        LinkedList<Integer> list = new LinkedList<>();
        int answer = 0;

        for(int i=0; i<n; i++) q.offer(Integer.parseInt(st.nextToken()));

        while(!q.isEmpty()) list.offer(q.poll());

        while(true) {
            if(list.size() <= 1) break;
            int temp = list.pollFirst()-1;
            list.offerFirst(temp);
            list.pollLast();
            if(list.peekFirst() == 0) list.pollFirst();
            answer++;
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
