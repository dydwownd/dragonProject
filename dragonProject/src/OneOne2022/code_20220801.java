package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220801 {
//4796
/**
5 8 20
5 8 17
0 0 0
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = 0;
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if(L == 0 && P == 0 && V == 0) break;

            int answer = 0;
            int remainder = V%P;
            testCase++;

            answer += ((V/P)*L);
            if(remainder >= L) answer += L;
            else answer += remainder;

            sb.append("Case " + testCase + ": " + answer);
            sb.append("\n");

        }

        System.out.println(sb.toString());
    }
}
