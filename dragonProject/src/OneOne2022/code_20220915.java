package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20220915 {
//2457

/**
7
9 9 4 1 4 9 9
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        long[] rightGet = new long[n];
        long[] leftGet = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        long answer = 0;
        long sum = 0;
        long beeOne = 0;
        long beeTwo = 0;

        long temp = 0;
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            temp += arr[i];
            rightGet[i] = temp;
        }

        temp = 0;
        for(int i = n-1; i>=0; i--){
            temp += arr[i];
            leftGet[i] += temp;
        }

        sum = rightGet[n-1];

        for(int i=1; i<n-1; i++){
            beeOne = sum - arr[0] - arr[i];
            beeTwo = sum - rightGet[i];
            answer = Math.max(answer, beeOne + beeTwo);
        }

        beeOne = 0;
        beeTwo = 0;
        for(int i = n-2; i>0; i--){
            beeOne = sum - arr[n-1] - arr[i];
            beeTwo = sum - leftGet[i];
            answer = Math.max(answer, beeOne + beeTwo);
        }

        beeOne = 0;
        beeTwo = 0;
        for(int i=1; i<n-1; i++){
            beeOne = rightGet[i] - arr[0];
            beeTwo = leftGet[i] - arr[n-1];
            answer = Math.max(answer, beeOne + beeTwo);
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }

}
