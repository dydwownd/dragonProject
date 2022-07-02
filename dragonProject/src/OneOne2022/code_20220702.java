package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220702 {
//10427
/**
3
5 1 5 4 3 8
3 1 2 3
6 3 4 1 6 8 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int testCase = 0; testCase<T; testCase++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int[] num = new int[N];
            int[] diff = new int[N-1];
            long answer = 0;

            for(int i=0; i<N; i++) num[i] = Integer.parseInt(st.nextToken());

            Arrays.sort(num);

            for(int i=0; i<N-1; i++){
                diff[i] = num[i+1]-num[i];
            }

            Arrays.sort(diff);

            for(int i=0; i<N-1; i++){
                answer += (diff[i]*((N-1)-i));
            }

            sb.append(answer);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
