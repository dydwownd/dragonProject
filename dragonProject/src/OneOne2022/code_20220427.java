package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220427 {

/**
5
1 3 2 4 6
2 7 3 4 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        int[][] arr = new int[n][2];
        int answer = 0;

        for(int i=0; i<n; i++){
            arr[i][0] = Integer.parseInt(st1.nextToken());
            arr[i][1] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr,(o1, o2) -> o1[1]-o2[1]);

        for(int i=0; i<n; i++){
            answer += arr[i][0]+(arr[i][1]*i);
        }

        System.out.println(answer);
    }
}
