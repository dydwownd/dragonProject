package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220521 {

/**
3
10 5
9 3
10 5
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] answer = new int[N];
        int[][] arr = new int[N][2];
        int firstMin = 0;

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            firstMin = Math.min(firstMin,first);
            arr[i][0] = first;
            arr[i][1] = second;
        }
        answer[0] = firstMin;

        Arrays.sort(arr,(o1, o2) -> o2[1]-o1[1]);
        int sum = arr[0][0];

        for(int i=1; i<N; i++){
            sum += arr[i][1];
            answer[i] = sum;
        }

        Arrays.stream(answer).forEach(System.out::println);
    }
}
