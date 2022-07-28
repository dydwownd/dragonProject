package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class code_20220728 {
//1715
/**
3
10
20
40
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>();
        long answer = 0;

        for(int i=0; i<n; i++) q.offer(Integer.parseInt(br.readLine()));

        while(q.size()>1){
            int firstNum = q.poll();
            int secondNum = q.poll();
            answer += (firstNum+secondNum);
            q.offer(firstNum+secondNum);
        }

        System.out.println(answer);
    }
}
