package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class code_20220518 {

/**
4 2
1 2 2 3
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        int cnt = 0;
        int day = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i=0; i<N; i++){
            if(arr[i] >= K){
                day++;
                cnt += (arr[i]-K+1);
            }
        }

        System.out.print(cnt + " " + day);
    }
}
