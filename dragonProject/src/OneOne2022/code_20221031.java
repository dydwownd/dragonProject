package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221031 {
//16112

/**
3 2
100 300 200
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long[] arr = new long[n];
        long answer = 0;

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++) arr[i] = Long.parseLong(st.nextToken());

        Arrays.sort(arr);

        for(int i=1; i<k; i++){
            answer += (i*arr[i]);
        }

        for(int i=k; i<n; i++){
            answer += (k*arr[i]);
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
