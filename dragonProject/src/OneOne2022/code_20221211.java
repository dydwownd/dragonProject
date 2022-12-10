package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221211 {
//25418

/**
5 10
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] dp = new int[k+1];

        Arrays.fill(dp, 1000001);
        dp[a] = 0;
        for (int i = a+1; i <= k; i++) {
            dp[i] = dp[i-1];
            if (i%2==0 && dp[i] > dp[i/2])
                dp[i] = dp[i/2];
            dp[i]++;
        }

        bw.write(dp[k] + "\n");
        bw.close();
        br.close();
    }
}
