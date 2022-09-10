package OneOne2022;
import java.io.*;
import java.util.Arrays;

public class code_20220910 {
//1448

/**
3
1
2
3
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        long answer = -1;

        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        for(int i=n-3; i>=0; i--){
            if(arr[i] + arr[i+1] > arr[i+2]){
                answer = Math.max(answer,arr[i]+arr[i+1]+arr[i+2]);
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
