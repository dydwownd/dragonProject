package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221019 {
//17262

/**
3
2 5
1 4
2 4
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        int startMax = 0;
        int endMin = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if(start > startMax) startMax = start;
            if(endMin > end) endMin = end;

        }

        answer = startMax-endMin;

        bw.write(answer<0?"0":answer + "\n");
        bw.close();
        br.close();
    }
}
