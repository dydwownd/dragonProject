package OneOne2022;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class code_20221102 {
//2790

/**
3
8
10
9
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        int answer = n;
        int max = 0;
        int calc = 0;

        for(int i=0; i<n; i++) arr[i] = Long.parseLong(br.readLine());

        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            arr[i] += (n-i);
            max = Math.max((int)arr[i],(int)max);
        }

        for(int i=0; i<n-1; i++){
            if(arr[i] >= max){
                answer++;
            }
            calc++;
            arr[i+1] += calc;
        }

        if(arr[n-1] >= max) answer++;

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
