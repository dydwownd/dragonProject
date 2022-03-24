package OneOne2022;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class code_20220324 {

/**
3
40 30 30
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for(int i=0; i<n; i++) q.offer(sc.nextInt());

        while(!q.isEmpty() && q.size()>1){
            int x = q.poll();
            int y = q.poll();
            answer += x+y;
            q.offer(x);
        }

        System.out.println(answer);

    }

}
