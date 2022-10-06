package OneOne2022;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_20221006 {
//20300

/**
5
1 2 3 4 5

6
1 2 3 4 5 6
 */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        long[] arr = new long[n];
        long answer = 0;

        for(int i=0; i<n; i++) arr[i] = Long.parseLong(st.nextToken());

        Arrays.sort(arr);

        if(n%2==1){
            answer = arr[n-1];
            n--;
        }

        for(int i=0; i<n/2; i++){
            answer = Math.max(answer, arr[i]+arr[n-1-i]);
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
