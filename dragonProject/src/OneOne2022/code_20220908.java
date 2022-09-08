package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220908 {
//14487

/**
5
1 6 5 2 4
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
        int answer = 0;

        Arrays.sort(arr);

        for(int i=0; i<n-1; i++) answer += arr[i];

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
