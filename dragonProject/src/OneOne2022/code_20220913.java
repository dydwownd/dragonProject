package OneOne2022;
import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class code_20220913 {
//1826

/**
4
4 4
5 2
11 5
15 10
25 10
*/

    public static class Info{
        int idx;
        int amount;
        Info(int i, int a){
            idx = i;
            amount = a;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Info> q = new PriorityQueue<>((o1, o2) -> o1.idx-o2.idx);
        PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder());
        StringTokenizer st;
        int answer = 0;
        int object = 0;
        int now = 0;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            q.add(new Info(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }

        st = new StringTokenizer(br.readLine()," ");
        object = Integer.parseInt(st.nextToken());
        now = Integer.parseInt(st.nextToken());

        while(now < object){
            while(!q.isEmpty() && q.peek().idx <= now){
                plus.offer(q.poll().amount);
            }
            if(plus.isEmpty()) break;

            answer++;
            now += plus.poll();
        }

        if(now < object) answer = -1;

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
