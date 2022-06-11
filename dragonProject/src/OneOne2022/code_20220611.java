package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220611 {

/**
8 7
30 15 70 50 40 40 50
2 2 1 3 1 2 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int answer = 0;
        int total = N*24;
        int[][] arr = new int[M][2];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<M; i++){
            arr[i][0] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<M; i++){
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,(o1, o2) -> o2[1]-o1[1]);

        for(int i=0; i<M; i++){
            int val = (100-arr[i][0])/arr[i][1];
            if(val<total){
                answer += arr[i][0]+(arr[i][1]*val);
                total -= val;
            }else if(total>0){
                answer += arr[i][0]+(arr[i][1]*total);
                total = 0;
            }else{
                answer += arr[i][0];
            }
        }

        System.out.println(answer);

    }
}
