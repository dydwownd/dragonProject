package OneOne2022;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class code_20220226 {

/**
3
5
7
7
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int me = 0;
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<N; i++){
            if(i==0){
                me = sc.nextInt();
            }
            else{
                int num = sc.nextInt();
                q.offer(num);
            }
        }

        while(!q.isEmpty() && me <= q.peek()){
            q.offer(q.poll()-1);
            me++;
            answer++;
        }

        System.out.println(answer);

    }

}
