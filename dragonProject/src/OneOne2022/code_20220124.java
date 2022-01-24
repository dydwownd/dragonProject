package OneOne2022;
import java.util.*;

public class code_20220124 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Queue<Integer> temp = new LinkedList<>();
        int[][] bag = new int[n][2];
        long answer = 0;

        for(int i=0; i<n; i++){
            bag[i][0] = sc.nextInt();
            bag[i][1] = sc.nextInt();
        }

        for(int i=0; i<k; i++){
            pq.offer(sc.nextInt());
        }

        Arrays.sort(bag,((o1, o2) -> o2[1]-o1[1]));

        for(int i=0; i<n; i++){
            int weight = bag[i][0];
            int price = bag[i][1];
            while(!pq.isEmpty()){
                int posible = pq.poll();
                if(weight<=posible){
                    answer += price;
                    break;
                }else{
                    temp.offer(posible);
                }
            }
            while(!temp.isEmpty()){
                pq.offer(temp.poll());
            }
        }

        System.out.println(answer);


    }



}
