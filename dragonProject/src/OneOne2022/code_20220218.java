package OneOne2022;
import java.util.*;

public class code_20220218 {

/**
7
1 6
1 7
3 2
3 1
2 4
2 5
6 1
*/

    public static class Info{
        int deadLine;
        int cnt;
        Info(int d, int c){
            deadLine = d;
            cnt = c;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Info> list = new ArrayList<>();
        long answer = 0;
        int idx = -1;
        int max = 0;

        for(int i=0; i<N; i++){
            int deadLine = sc.nextInt();
            int cnt = sc.nextInt();
            list.add(new Info(deadLine-1,cnt));
        }

        for(int i=0; i<N; i++){
            idx = -1;
            max = 0;
            for(int j=0; j<list.size(); j++){
                if(list.get(j).deadLine <= i && list.get(j).cnt > max){
                    idx = j;
                    max = list.get(j).cnt;
                }
            }
            if(idx != -1){
                answer += max;
                list.remove(idx);
            }

            for(int j=list.size()-1; j>=0; j--){
                if(list.get(j).deadLine <= i) list.remove(j);
            }
        }

        System.out.println(answer);

    }

}
