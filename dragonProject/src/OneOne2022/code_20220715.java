package OneOne2022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220715 {
//11399
/**
5
3 1 4 3 2
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n];
        int time = 0;
        int answer = 0;

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            time += arr[i];
            answer += time;
        }

        System.out.println(answer);

    }
}
