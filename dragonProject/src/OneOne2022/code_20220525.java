package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220525 {


/**
1 74
502
2
47
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][5];
        long answer = 0;

        //M-R*P
        StringTokenizer M = new StringTokenizer(br.readLine(), " ");
        StringTokenizer P = new StringTokenizer(br.readLine(), " ");
        StringTokenizer R = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<N; i++){
            arr[i][0] = Integer.parseInt(M.nextToken());
            arr[i][1] = Integer.parseInt(P.nextToken());
            arr[i][2] = Integer.parseInt(R.nextToken());
            arr[i][3] = arr[i][0] - (arr[i][1]*arr[i][2]);
            arr[i][4] = arr[i][3]/arr[i][2];
        }

        Arrays.sort(arr,(o1,o2)-> o2[4]-o1[4]);

        for(int i=0; i<N; i++){
            if(arr[i][2] <= T){
                T -= arr[i][2];
                answer += arr[i][3];
            }
        }

        System.out.print(answer);
    }
}
