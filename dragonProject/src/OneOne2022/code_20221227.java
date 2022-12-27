package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221227 {
//25379

/**
4
4 5 1 0
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long cntL = 0;
        long cntR = 0;
        long sum = 0;
        int idx = 0;

        for (int i = 0; i < n; i++) {
            int cur = Integer.parseInt(st.nextToken());
            if (cur%2 == 0) {
                sum+=idx++;
                cntL += i;
                cntR += n-1-i;
            }
        }

        bw.write(Math.min(cntL, cntR) - sum + "\n");
        bw.close();
        br.close();
    }
}
