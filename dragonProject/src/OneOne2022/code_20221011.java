package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221011 {
//20186

/**
5 3
2 3 1 2 1
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine()," ");
        long answer = 0;

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        for(int i=n-k; i<n; i++) answer += arr[i];

        for(int i=1; i<k; i++) answer -= i;

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
