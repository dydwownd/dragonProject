package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code_20220630 {
//14922
/**
3
3 1 2
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int min = Integer.MAX_VALUE;
        int val = Integer.MAX_VALUE;
        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            min = Math.min(arr[i],min);
        }

        for(int i=0; i<N-1; i++){
            if(arr[i] == min || arr[i+1] == min){
                int calc = (arr[i] + arr[i + 1]) / 2;
                if(calc < val){
                    val = calc;
                    answer = i;
                }
            }
        }

        System.out.println(answer);

    }
}
