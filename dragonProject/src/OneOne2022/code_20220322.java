package OneOne2022;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class code_20220322 {

/**
4
3 5 4 2
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        long answer = 0;

        for (int i=0; i<n; i++) {
            int temp = sc.nextInt();
            sum += temp;
            q.offer(temp);
        }

        while(!q.isEmpty()){
            int num = q.poll();
            sum -= num;
            answer += num*sum;
        }

        System.out.println(answer);
    }

}
