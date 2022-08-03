package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220803 {
//1049
/**
4 2
12 3
15 4
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int setMin = Integer.MAX_VALUE;
        int oneMin = Integer.MAX_VALUE;
        long answer = 0;

        int[][] arr =new int[m][3];

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = arr[i][1]*6;
        }

        Arrays.sort(arr,(o1, o2) -> o1[0]-o2[0]);
        setMin = Math.min(setMin,arr[0][0]);

        Arrays.sort(arr,(o1, o2) -> o1[1]-o2[1]);
        oneMin = Math.min(oneMin,arr[0][1]);

        Arrays.sort(arr,(o1, o2) -> o1[2]-o2[2]);
        setMin = Math.min(setMin,arr[0][2]);

        answer += ((n/6)*setMin);

        n %= 6;

        answer += Math.min(setMin,n*oneMin);

        System.out.println(answer);
    }
}
