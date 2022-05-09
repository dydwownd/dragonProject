package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220509 {

/**
5 100
3 1 2 4 5
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());
        long[] arr = new long[N];
        long answer = Long.MAX_VALUE;

        st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<N; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i=1; i<N; i++){
            long temp = (arr[0] * i) + (arr[i] * (N-i));
            answer = Math.min(answer,K%temp==0?K/temp:K/temp+1);
        }

        System.out.print(answer);
    }
}
