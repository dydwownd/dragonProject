package OneOne2022;
import java.io.*;

public class code_20221030 {
//1398

/**
2
47
9
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        StringBuilder sb = new StringBuilder();

        int[] dp = new int[101];

        for(int i=1; i<100; i++){
            int temp = i;
            dp[i] = temp/25;
            temp %= 25;
            dp[i] += temp/10;
            temp %= 10;
            dp[i] += temp;

        }

        for(int i=0; i<n; i++){
            arr[i] = Long.parseLong(br.readLine());
        }

        for(int i=0; i<n; i++){
            int temp = 0;
            while(arr[i] > 0){
                int idx = (int)(arr[i]%100);
                temp += dp[idx];
                arr[i] /= 100;
            }
            sb.append(temp);
            sb.append("\n");
        }

        bw.write(sb.toString() + "\n");
        bw.close();
        br.close();
    }
}
