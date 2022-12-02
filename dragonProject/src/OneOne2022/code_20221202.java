package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221202 {
//17451

/**
5
300 400 500 400 300
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<n; i++) arr[i] = Long.parseLong(st.nextToken());

        long answer = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            if(answer < arr[i]) answer = arr[i];
            else if(arr[i] < answer && answer%arr[i] != 0) answer = ((answer / arr[i]) + 1) * arr[i];
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
