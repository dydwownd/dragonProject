package OneOne2022;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class code_20220216 {

/**
4
100
200
12345
1003
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            for(int j : solve(sc.nextInt())){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

    public static ArrayList<Integer> solve(int num){
        ArrayList<Integer> list = new ArrayList<>();
        int[] dp = new int[num];
        int idx = 0;
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<num; i++){
            dp[i] = dp[i-1]+dp[i-2];
            if(dp[i] > num){
                idx = i;
                break;
            }
        }

        for(int i=idx-1; i>0; i--){
            if(dp[i] <= num){
                num -= dp[i];
                list.add(dp[i]);
            }
        }

        Collections.sort(list);

        return list;
    }

}
