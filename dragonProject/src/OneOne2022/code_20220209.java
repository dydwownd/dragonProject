package OneOne2022;
import java.util.*;

public class code_20220209 {

/**
3
3
10 7 6
3
3 5 9
5
1 1 3 1 2
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] answer = new int[T];

        for(int kind=0; kind<T; kind++){
            int N = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            int max = 0;

            for(int cnt=0; cnt<N; cnt++){
                int price = sc.nextInt();
                list.add(price);
            }

            for(int i=0; i<N; i++){
                max = list.get(i);
                for(int j=i+1; j<N; j++){
                    if(max < list.get(j)) max = list.get(j);
                }

                if(max != -1) answer[kind] += max-list.get(i);
            }
        }

        Arrays.stream(answer).forEach(System.out::println);

    }

}
