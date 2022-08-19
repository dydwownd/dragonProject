package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20220819 {
//2212
/**
6
2
1 6 9 3 6 7
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n];
        int[] diff = new int[n-1];
        int answer = 0;

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        for(int i=0; i<n-1; i++) diff[i] = arr[i+1]-arr[i];

        Arrays.sort(diff);

        for(int i=0; i<(n-1)-(k-1); i++) answer += diff[i];

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
