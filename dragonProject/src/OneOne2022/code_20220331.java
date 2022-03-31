package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220331 {

/**
5
1 2 3 4 5

4
1 2 3 4
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        PriorityQueue<Integer> q = new PriorityQueue<>();
        LinkedList<Integer> list = new LinkedList<>();
        int answer = 0;

        for(int i=0; i<n; i++){
            q.offer(Integer.parseInt(st.nextToken()));
        }

        for(int i=0; i<n; i++){
            list.add(q.poll());
        }

        if(n%2 == 1){
            answer = list.pollLast();
        }

        for(int i=0; i<n/2; i++){
            int first = list.pollFirst();
            int second = list.pollLast();
            answer = Math.max(answer,first+second);
        }

        System.out.println(answer);

    }

}
