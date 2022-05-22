package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220522 {

/**
78 53 64
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[3];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int answer = arr[0];

        arr[1] -= arr[0];
        arr[2] -= arr[0];

        answer += arr[1]/3;
        answer += arr[2]/3;

        arr[1] %= 3;
        arr[2] %= 3;

        if(arr[1] == 2 || arr[2] == 2) answer += 2;
        else if(arr[1] == 1 || arr[2] == 1) answer += 1;

        System.out.print(answer);
    }
}
