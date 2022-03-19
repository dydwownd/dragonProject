package OneOne2022;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class code_20220319 {

/**
5
3 2 10 9 6
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PriorityQueue<Double> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<n; i++){
            q.offer(sc.nextDouble());
        }

        while(!q.isEmpty() && q.size()>1){
            Double a = q.poll();
            Double b = q.poll();
            q.offer(a+(b/2));
        }

        System.out.println(q.poll());

    }

}
