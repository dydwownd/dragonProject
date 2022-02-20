package OneOne2022;
import java.util.Scanner;

public class code_20220220 {

/**
5
5 2 4 1 3
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] dp = new int[N + 1];
        int max = 0;
        // dp[i] = dp[i - 1] + 1;
        for (int i = 1; i <= N; i++) {
            int k = sc.nextInt();
            dp[k] = dp[k - 1] + 1;
            max = Math.max(dp[k], max);
        }
        System.out.println(N - max);


    }

}
