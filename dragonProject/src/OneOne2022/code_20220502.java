package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220502 {

/**
3 9000
40 10
20 5
30 20
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][3];
        int answer = 0;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Math.max(arr[i][0],arr[i][1]*5);
        }

        Arrays.sort(arr,(o1, o2) -> o2[2]-o1[2]);

        for(int i=0; i<n; i++){
            if(k<1000) break;
            if(arr[i][0] < arr[i][1]*5){
                if(k>1000){
                    answer += arr[i][1];
                    k-=1000;
                }
            }else{
                if(k>5000){
                    answer += arr[i][1];
                    k-=5000;
                }
            }
        }

        System.out.print(answer);
    }
}
