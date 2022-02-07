package OneOne2022;
import java.util.*;

public class code_20220207 {

/**
4 40
6
3 4 20
1 2 10
1 3 20
1 4 30
2 3 10
2 4 20
*/

    public static class Village{
        int start;
        int end;
        int weight;
        Village(int s, int e, int w){
            start = s;
            end = e;
            weight = w;
        }
    }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int N = sc.nextInt();
         int C = sc.nextInt();
         int M = sc.nextInt();
         int now = 0;
         int answer = 0;
         int[] addW = new int[N];

         List<Village> list = new ArrayList<>();

         for(int i=0; i<M; i++){
             int start = sc.nextInt();
             int end = sc.nextInt();
             int weight = sc.nextInt();
             list.add(new Village(start-1, end-1, weight));
         }

         Collections.sort(list,(o1, o2) -> o1.end-o2.end);

         for(int i=0; i<N; i++){
             now -= addW[i];

             for(int j=0; j<M; j++){
                if(now == C) break;
                if(i == list.get(j).start){
                    int add = 0;
                    if(C-now > list.get(j).weight) add = list.get(j).weight;
                    else add = C-now;

                    answer += add;
                    now += add;
                    addW[list.get(j).end] += add;
                }
             }
         }

         System.out.println(answer);
     }


 }