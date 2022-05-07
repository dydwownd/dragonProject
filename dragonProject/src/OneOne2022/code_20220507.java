package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220507 {

/**
4 5
1 7
6 2
3 5
4 4
0 8
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;
        int cnt = 0;
        int[][] arr= new int[M][3];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = arr[i][0] - arr[i][1];
        }

        Arrays.sort(arr, (o1, o2) -> o2[2] - o1[2]);

        for(int i=0; i<M; i++){
            if(cnt == M-1) break;
            cnt++;
            if(arr[i][2] < 0){
                answer += Math.abs(arr[i][2])/2;
            }

        }

        System.out.print(answer);
    }
}
