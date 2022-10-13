package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221014 {
//1727

/**
2 1
10 20
15
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] man = new int[n+1];
        int[] woman = new int[m+1];

        st = new StringTokenizer(br.readLine()," ");
        for(int i=1; i<=n; i++) man[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        for(int i=1; i<=m; i++) woman[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(man);
        Arrays.sort(woman);

        int[][] dp = new int[n+1][m+1];

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                dp[i][j] = dp[i-1][j-1] + Math.abs(man[i] - woman[j]);
                if(i>j) dp[i][j] = Math.min(dp[i][j],dp[i-1][j]);
                else if(i<j) dp[i][j] = Math.min(dp[i][j],dp[i][j-1]);
            }
        }

        bw.write(dp[n][m] + "\n");
        bw.close();
        br.close();
    }
}
