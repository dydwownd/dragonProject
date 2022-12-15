package OneOne2022;
import java.io.*;
import java.util.Arrays;

public class code_20221215 {
//2405

/**
5
100
234
430
120
489
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int answer = 0;

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        for (int i=0; i < n - 2; i++) answer = Math.max(answer, Math.abs(arr[n - 1] + arr[i] - arr[i + 1] * 2));
        for (int i=1; i < n - 1; i++) answer = Math.max(answer, Math.abs(-arr[0] + arr[i] * 2 - arr[i + 1]));

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
