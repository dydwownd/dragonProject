package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220516 {

/**
3 5
1 3
2 9
3 7

 (1)	(11)	(15)	(25)	(63)
 1	2	3	4	5

 0	1	0	1	4

 2	11	20	29	0

 10	0	3	0	3



 1	10
 2	9
 3	8
 5	6
 6	6
 3	5
*/

    public static class Carrot{
        int base;
        int inc;
        int amount;
        Carrot(int b, int i, int a){
            base = b;
            inc = i;
            amount = a;
        }
}

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        List<Carrot> list = new ArrayList<>();
        int answer = 0;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int w = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            list.add(new Carrot(w,p,w+(p*(T-1))));
        }

        int idx = 0;
        int max = 0;

        while(T>0){
            T--;
            for(int j=0; j<list.size(); j++){
                if(max < list.get(j).amount){
                    max = list.get(j).amount;
                    idx = j;
                }
                list.get(j).amount -= list.get(j).inc;
            }

            answer += max;
            max = 0;
            list.remove(idx);
        }

    }

}
