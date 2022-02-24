package OneOne2022;
import java.util.PriorityQueue;
import java.util.Scanner;

public class code_20220224 {

/**
3
2 1
8 3
5 7
*/

    public static class Cow{
        int enterTime;
        int requireTime;
        Cow(int e, int r){
            enterTime = e;
            requireTime = r;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int answer = 0;
        PriorityQueue<Cow> q = new PriorityQueue<>((o1, o2) -> o1.enterTime-o2.enterTime);
        PriorityQueue<Cow> process = new PriorityQueue<>((o1, o2) -> o1.requireTime-o2.requireTime);

        for(int i=0; i<N; i++){
            int enterTime = sc.nextInt();
            int requireTime = sc.nextInt();
            q.offer(new Cow(enterTime,requireTime));
        }

        while(!q.isEmpty() || !process.isEmpty()){
            while(!q.isEmpty() && answer >= q.peek().enterTime){
                process.offer(q.poll());
            }
            if(!process.isEmpty()){
                answer += process.poll().requireTime;
            }else{
                answer++;
            }
        }

        System.out.println(answer);

    }

}
