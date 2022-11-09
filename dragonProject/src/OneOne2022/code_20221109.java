package OneOne2022;
import java.io.*;
import java.util.StringTokenizer;

public class code_20221109 {
//24498

/**
5
2 4 3 5 5
*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        answer = Math.max(arr[0],arr[n-1]);

        for(int i=1; i<n-1; i++){
            if(arr[i-1] ==0 || arr[i] == 0 || arr[i+1]== 0) continue;
            int min = Math.min(arr[i-1],arr[i+1]);
            answer = Math.max(answer,arr[i]+min);
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
