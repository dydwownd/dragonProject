package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221024 {
//10803

/**
6 5
*/

    private static int[][] map = new int[10001][101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int tempN = Integer.parseInt(st.nextToken());
        int tempM = Integer.parseInt(st.nextToken());
        int n = Math.max(tempN,tempM);
        int m = Math.min(tempN,tempM);

        for(int i=1; i<=n; i++){
            map[i][1] = i;
            if(i <= m){
                map[i][i] = 1;
            }
            if(i>=3){
                if(i%2 == 0){
                    map[i][2] = i/2;
                }else{
                    map[i][2] = i/2+2;
                }
            }
        }

        dp(n,m);

        bw.write(map[n][m] + "\n");
        bw.close();
        br.close();
    }

    private static int dp(int n, int m) {
        int tempN = Math.max(n,m);
        int tempM = Math.min(n,m);
        n = tempN;
        m = tempM;
        if(map[n][m] == 0){
            int min = Integer.MAX_VALUE;
            if(n % m == 0){
                return map[n][m] = Math.min(n/m, min);
            }
            if(n >= m * 3){
                return map[n][m] = dp(n-m, m) + 1;
            }
            for(int i=1; i<= n / 2; i++){
                min = Math.min(min, dp(n - i, m) + dp(i, m));

            }
            for(int i=1; i<= m / 2; i++){
                min = Math.min(min, dp(n, m-i) + dp(n, i));

            }
            return map[n][m] = min;
        }else{
            return map[n][m];
        }
    }
}
