package OneOne2022;
import java.io.*;
import java.util.Arrays;

public class code_20220826 {
//2012

/**
5
1
5
3
1
2
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        long answer = 0;

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        for(int i=0; i<n; i++) answer += Math.abs((i+1) - arr[i]);

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }

}
