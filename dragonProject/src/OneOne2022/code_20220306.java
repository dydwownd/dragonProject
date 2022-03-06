package OneOne2022;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class code_20220306 {

/**
3
2 2 2
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] num = new int[N];
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<N; i++){
            q.offer(sc.nextInt());
        }

        while(!q.isEmpty() && q.size() != 1){
            int first = q.poll();
            int second = q.poll();
            answer += first*second;
            q.offer(first+second);
        }

        System.out.println(answer);

    }

}
