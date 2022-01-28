package OneOne2022;
import java.util.*;

public class code_20220128 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] room = new int[N][2];
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i=0; i<N; i++){
            room[i][0] = sc.nextInt();
            room[i][1] = sc.nextInt();
        }

        Arrays.sort(room, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) return o1[1]-o2[1];
                else return o1[0]-o2[0];
            }
        });

        for(int i=0; i<N; i++){
            if(q.isEmpty()) q.offer(room[i][1]);
            else{
                if(q.peek() <= room[i][0])  q.poll();
                q.offer(room[i][1]);
            }
        }

        System.out.println(q.size());
    }

}
