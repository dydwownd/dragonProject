package OneOne2022;
import java.util.*;

public class code_20220312 {

/**
6
1 6 2 5 3 4
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int answer = 0;

        for(int i=0; i<N; i++){
            list.add(sc.nextInt());
        }

        int rank = N;
        for(int i=0; i<N; i++){
            if(list.size() == 1) break;

            int idx = list.indexOf(rank);

            if(idx == 0){
                answer += Math.abs(list.get(idx) - list.get(idx+1));
            }else if(idx == list.size()-1){
                answer += Math.abs(list.get(idx-1) - list.get(idx));
            }else{
                answer += Math.min(Math.abs(list.get(idx-1) - list.get(idx)), Math.abs(list.get(idx) - list.get(idx+1)));
            }

            rank--;
            list.remove(idx);
        }

        System.out.println(answer);

    }

}
