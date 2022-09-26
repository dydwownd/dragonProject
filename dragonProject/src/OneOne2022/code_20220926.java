package OneOne2022;
import java.io.*;
import java.util.*;

public class code_20220926 {
//10165

/**
10
5
0 4
2 6
5 0
7 9
9 4
*/

    public static class Station{
        int idx;
        int start;
        int end;
        Station(int i, int s, int e){
            idx = i;
            start = s;
            end = e;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int lastStation = 0;
        List<Station> list = new ArrayList<>();
        LinkedList<Station> dq = new LinkedList<>();
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i=0; i<m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if(start>end){
                lastStation = Math.max(lastStation,end);
                end += n;
            }

            list.add(new Station(i+1,start,end));
        }

        Collections.sort(list,(o1, o2) -> o1.start==o2.start?o2.end-o1.end:o1.start-o2.start);

        for(int i=0; i<m; i++){
            if(dq.isEmpty() || dq.peekLast().end < list.get(i).end){
                dq.offer(list.get(i));
            }
        }

        while(!dq.isEmpty() && dq.peekFirst().end <= lastStation){
            dq.pollFirst();
        }

        while(!dq.isEmpty()){
            q.offer(dq.poll().idx);
        }

        while(!q.isEmpty()){
            sb.append(q.poll());
            sb.append(" ");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}

