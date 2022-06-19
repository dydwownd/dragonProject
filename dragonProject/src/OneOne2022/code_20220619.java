package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220619 {


/**
3
1
5
10
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int preNum = 0;
        long answer = 0;

        for(int i=0; i<N; i++) set.add(Integer.parseInt(br.readLine()));
        for(int i : set) q.offer(i);

        preNum = q.poll();

        while(!q.isEmpty()){
            int temp = q.poll();
            answer += (preNum-temp);
            preNum = temp;
        }

        System.out.println(answer);
    }
}
