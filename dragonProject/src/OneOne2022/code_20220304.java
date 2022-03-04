package OneOne2022;
import java.util.Scanner;

public class code_20220304 {

/**
10 24
5
7
5
4
2
7
8
5
3
4
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] coin = new int[N];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int pre = 0;
        int cnt = 0;

        for(int i=0; i<N; i++) {
            coin[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            int s = coin[i];
            if(pre > s){
                cnt = W/min;
                W -= min*cnt;
                W += max*cnt;
                min = Integer.MAX_VALUE;
                max = Integer.MIN_VALUE;
            }
            min = Math.min(min, s);
            max = Math.max(max, s);
            pre = s;
        }

        if(min < max){
            cnt = W/min;
            W -= min*cnt;
            W += max*cnt;
        }

        System.out.println(W);
    }

}
