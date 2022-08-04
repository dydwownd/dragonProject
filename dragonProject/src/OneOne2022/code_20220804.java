package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class code_20220804 {
//1744
/**
4
-1
2
1
3
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> plusQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusQ = new PriorityQueue<>();
        long answer = 0;

        for(int i=0; i<n; i++){
            int temp = Integer.parseInt(br.readLine());
            if(temp>0) plusQ.offer(temp);
            else minusQ.offer(temp);
        }

        while(plusQ.size()>1){
            int temp1 = plusQ.poll();
            int temp2 = plusQ.poll();
            if(temp1 != 1 && temp2 != 1) answer += temp1*temp2;
            else answer += temp1+temp2;
        }

        while(minusQ.size()>1){
            answer += minusQ.poll()*minusQ.poll();
        }

        if(!plusQ.isEmpty()) answer += plusQ.poll();
        if(!minusQ.isEmpty()) answer += minusQ.poll();

        System.out.println(answer);
    }
}
