package OneOne2022;
import java.util.PriorityQueue;
import java.util.Scanner;

public class code_20220307 {

/**
2
4
40 30 30 50
15
1 21 3 4 5 35 5 4 3 5 98 21 14 17 32
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int N = sc.nextInt();
            long answer = 0;
            PriorityQueue<Long> q = new PriorityQueue<>();

            for(int j=0; j<N; j++){
                q.offer(sc.nextLong());
            }

            while(!q.isEmpty() && q.size()>1){
                long first = q.poll();
                long second = q.poll();
                answer += first+second;
                q.offer(first+second);
            }

            System.out.println(answer);
        }
    }

}
