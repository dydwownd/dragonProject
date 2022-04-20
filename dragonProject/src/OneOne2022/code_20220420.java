package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220420 {

/**
4
3 5
8 14
5 20
1 16
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        int answer = 987654321;
        int sum = 0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,(o1, o2) -> o1[1]-o2[1]);

        for(int i=0; i<n; i++){
            sum += arr[i][0];
            if(arr[i][1] - sum < 0){
                answer = -1;
                break;
            }
            if(arr[i][1] - sum < answer) answer = arr[i][1] - sum;
        }

        System.out.println(answer);

    }
}
