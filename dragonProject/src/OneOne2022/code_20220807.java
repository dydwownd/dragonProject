package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220807 {
//1449
/**
4 2
1 2 100 101
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int answer = 0;

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        for(int i=0; i<N; i++){
            int len = L-1;
            while(i+1 < N && len > 0 && arr[i+1]-arr[i] <= len){
                len -= arr[i+1]-arr[i];
                i++;
            }
            answer++;
        }

        System.out.println(answer);
    }
}
