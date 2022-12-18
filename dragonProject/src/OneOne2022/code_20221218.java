package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221218 {
//25214

/**
6
50 100 70 110 10 100
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        while (n-->0) {
            int cur = Integer.parseInt(st.nextToken());
            if (min > cur) min = cur;
            else ans = Math.max(ans, cur-min);
            sb.append(ans).append(' ');
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
