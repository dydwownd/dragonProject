package OneOne2022;

import java.util.*;

public class code_20220205 {

/** input
7
4 60
4 40
1 20
2 50
3 30
4 10
6 5
 */

/** output
 185
 */

    public static class Work{
        int day;
        int score;
        Work(int d, int s){
            day = d;
            score = s;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Work> list = new ArrayList<>();
        int answer = 0;
        int max = 0;

        for(int i=0; i<N; i++){
            int d = sc.nextInt();
            int w = sc.nextInt();
            max = Math.max(max,d);
            list.add(new Work(d,w));
        }

        for(int i=max; i>0; i--){
            int idx = -1;
            int score = 0;
            for(int j=0; j<list.size(); j++){
                if(list.get(j).day >= i && list.get(j).score > score){
                    idx = j;
                    score = list.get(j).score;
                }
            }

            if(idx != -1){
                answer += score;
                list.remove(idx);
            }
        }

        System.out.println(answer);
    }

}
