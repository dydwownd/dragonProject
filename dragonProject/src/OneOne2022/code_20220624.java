package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220624 {

/**
5
1 3 2 3 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            int start = 1;
            for(int j=i; j<N; j++){
                if(j==N-1) break;
                if(arr[j] < start){
                    start--;
                    break;
                }
                start++;
            }
            answer = Math.max(start,answer);
        }

        System.out.println(answer);
    }
}
